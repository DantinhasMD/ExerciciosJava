import os
import json
import datetime
import requests
import re

# ================= CONFIG =================
FOLDER = "src/java_daily_challenges"
os.makedirs(FOLDER, exist_ok=True)

NIVEL_FILE = f"{FOLDER}/nivel.json"
GROQ_API_KEY = os.getenv("GROQ_API_KEY")
MODEL = os.getenv("GROQ_MODEL", "llama-3.1-8b-instant")
API_URL = "https://api.groq.com/openai/v1/chat/completions"
# =========================================

# ---------- VALIDACOES BASICAS ----------
if not GROQ_API_KEY:
    raise RuntimeError("GROQ_API_KEY não encontrada nas variáveis de ambiente")

# ================= CONCEITOS POR NÍVEL =================
CONCEITOS_POR_NIVEL = {
    "iniciante": [
        "variaveis",
        "condicionais",
        "loops",
        "entrada_saida_console",
        "listas",
        "mapas",
        "excecoes"
    ],
    "intermediario": [
        "api_rest",
        "spring_boot",
        "separacao_camadas",
        "regras_negocio",
        "modelagem_dados",
        "tratamento_excecoes",
        "validacao_entrada"
    ],
    "avancado": [
        "arquitetura",
        "trade_offs",
        "extensibilidade",
        "qualidade_codigo",
        "design_projeto",
        "dependencias_camadas",
        "performance"
    ]
}

# ================= ESTADO / NÍVEL =================
if not os.path.exists(NIVEL_FILE):
    nivel_data = {
        "nivel_atual": "iniciante",
        "ultima_analise": str(datetime.date.today()),
        "exercicios_desde_analise": 0,
        "conceitos_contador": {}
    }
else:
    with open(NIVEL_FILE, "r", encoding="utf-8") as f:
        nivel_data = json.load(f)

# GARANTE CHAVES
nivel_data.setdefault("conceitos_contador", {})
nivel_data.setdefault("exercicios_desde_analise", 0)
nivel_data.setdefault("nivel_atual", "iniciante")

nivel_data["exercicios_desde_analise"] += 1
nivel = nivel_data["nivel_atual"]

if nivel_data["exercicios_desde_analise"] >= 90:
    if nivel == "iniciante":
        nivel = "intermediario"
    elif nivel == "intermediario":
        nivel = "avancado"

    nivel_data["nivel_atual"] = nivel
    nivel_data["exercicios_desde_analise"] = 0
    nivel_data["ultima_analise"] = str(datetime.date.today())

nivel = nivel_data["nivel_atual"]

# ================= INICIALIZA CONCEITOS =================
conceitos_ativos = CONCEITOS_POR_NIVEL[nivel]

for conceito in conceitos_ativos:
    nivel_data["conceitos_contador"].setdefault(conceito, 0)

# ================= ESCOLHA BALANCEADA =================
def escolher_conceitos(conceitos_contador, conceitos_validos, quantidade=2):
    ordenados = sorted(
        ((c, conceitos_contador.get(c, 0)) for c in conceitos_validos),
        key=lambda x: x[1]
    )
    return [c for c, _ in ordenados[:quantidade]]

conceitos_escolhidos = escolher_conceitos(
    nivel_data["conceitos_contador"],
    conceitos_ativos,
    quantidade=2
)

# ================= PROMPT (INTOCÁVEL) =================
prompt = f"""
Você é um arquiteto de software especialista em Java Backend e Spring Boot,
com foco em formação completa e progressiva de desenvolvedores Java.

Nível do usuário: {nivel}

Gere UM desafio diário realista, baseado em problemas de sistemas reais,
usados em empresas, produtos ou plataformas internas.

CONCEITOS OBRIGATÓRIOS PARA ESTE DESAFIO:
{", ".join(conceitos_escolhidos)}

O desafio deve:
- Ter regras de negócio claras e verificáveis
- Exigir decisões técnicas implícitas (estrutura de dados, validação, regras)
- Ter comportamento determinístico (resultado certo ou errado)
- Evoluir conforme o nível informado, sem antecipar conceitos
- Responda EXCLUSIVAMENTE com um JSON válido.
- Não inclua texto fora do JSON.
- Não use markdown.
- Não explique a solução.

Diretrizes por nível:
INICIANTE:
- Exercitar pensamento sequencial e lógico
- Entrada e saída via console
- Uso de variáveis, estruturas de decisão e repetição
- Problemas simples com contexto real
- Nenhum uso de frameworks ou APIs

INTERMEDIÁRIO:
- API REST com Spring Boot
- Regras de negócio explícitas
- Separação de camadas
- Modelagem simples de dados
- Objetivos claros de execução
- Foco em comportamento do sistema

AVANÇADO:
- Decisões arquiteturais e trade-offs
- Pensamento orientado a extensibilidade
- Qualidade de código e evolução futura
- Dependências entre camadas
- Design de projeto

Formato de resposta OBRIGATÓRIO (JSON válido):

{{
  "titulo": "string",
  "enunciado": "string",
  "conceitos": ["string"],
  "foco_tecnico": ["string"],
  "requisitos": ["string"],
  "exemplos": [
    {{
      "entrada": "string",
      "saida": "string"
    }}
  ]
}}

Regras obrigatórias:
- "foco_tecnico" deve indicar COMO o problema força o uso dos conceitos
- Cada desafio deve exercitar pelo menos DOIS conceitos
- Os requisitos devem impor restrições reais
- Pelo menos UM exemplo deve representar erro ou entrada inválida
"""

# ================= GROQ CALL =================
response = requests.post(
    API_URL,
    headers={
        "Authorization": f"Bearer {GROQ_API_KEY}",
        "Content-Type": "application/json"
    },
    json={
        "model": MODEL,
        "messages": [{"role": "user", "content": prompt}],
        "temperature": 0.6
    },
    timeout=30
)

data = response.json()
if "choices" not in data:
    raise RuntimeError(json.dumps(data, indent=2, ensure_ascii=False))

raw_content = data["choices"][0]["message"]["content"]

# ================= EXTRAÇÃO JSON =================
def extract_json(text: str) -> dict:
    match = re.search(r"\{.*\}", text, re.DOTALL)
    if not match:
        raise RuntimeError("Nenhum JSON encontrado na resposta da IA")
    return json.loads(match.group())

challenge_data = extract_json(raw_content)

# ================= VALIDAÇÃO FORTE =================
CAMPOS_OBRIGATORIOS = [
    "titulo",
    "enunciado",
    "conceitos",
    "foco_tecnico",
    "requisitos",
    "exemplos"
]

for campo in CAMPOS_OBRIGATORIOS:
    if campo not in challenge_data:
        raise RuntimeError(f"Campo obrigatório ausente: {campo}")

if len(challenge_data["requisitos"]) < 3:
    raise RuntimeError("Requisitos insuficientes")

if len(challenge_data["exemplos"]) < 2:
    raise RuntimeError("Exemplos insuficientes")

if not any(
    "erro" in e["saida"].lower() or "inválid" in e["saida"].lower()
    for e in challenge_data["exemplos"]
):
    raise RuntimeError("Nenhum exemplo de erro encontrado")

# ================= ATUALIZA CONTADOR =================
for conceito in conceitos_escolhidos:
    if conceito in challenge_data["conceitos"]:
        nivel_data["conceitos_contador"][conceito] += 1

with open(NIVEL_FILE, "w", encoding="utf-8") as f:
    json.dump(nivel_data, f, indent=4, ensure_ascii=False)

# ================= GERA JAVA =================
today = datetime.datetime.now().strftime("%Y_%m_%d_%H%M")
classname = f"Desafio_{today}"
filename = f"{FOLDER}/{classname}.java"

java_file = f"""package java_daily_challenges;

/*
========================================
{challenge_data["titulo"]}
Nível: {nivel}
Data: {today}
========================================

ENUNCIADO:
{challenge_data["enunciado"]}

CONCEITOS:
{chr(10).join("- " + c for c in challenge_data["conceitos"])}

REQUISITOS:
{chr(10).join("- " + r for r in challenge_data["requisitos"])}

EXEMPLOS:
{chr(10).join(
    f"Entrada: {e['entrada']} | Saída esperada: {e['saida']}"
    for e in challenge_data["exemplos"]
)}
*/

public class {classname} {{
    public static void main(String[] args) {{
        // Implemente sua solução aqui
    }}
}}
"""

with open(filename, "w", encoding="utf-8") as f:
    f.write(java_file)

print(f"Desafio gerado com sucesso: {filename}")
