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

# ---------- NIVEL ----------
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

# ===== NORMALIZA ESTADO LEGADO (CORREÇÃO DO BUG) =====
if "conceitos_contador" not in nivel_data or not isinstance(nivel_data["conceitos_contador"], dict):
    nivel_data["conceitos_contador"] = {}

nivel = nivel_data["nivel_atual"]
nivel_data["exercicios_desde_analise"] += 1

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
    filtrados = {c: conceitos_contador[c] for c in conceitos_validos}
    ordenados = sorted(filtrados.items(), key=lambda x: x[1])
    return [c[0] for c in ordenados[:quantidade]]

conceitos_escolhidos = escolher_conceitos(
    nivel_data["conceitos_contador"],
    conceitos_ativos,
    quantidade=2
)

# ---------- PROMPT (COMPLETO, SEM CORTES) ----------
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

{
"titulo": "string",
  "enunciado": "string",
  "conceitos": ["string"],
  "foco_tecnico": ["string"],
  "requisitos": ["string"],
  "exemplos": [
    {
"entrada": "string",
      "saida": "string"
    }
  ]
}

Regras obrigatórias:
- "foco_tecnico" deve listar os conceitos do currículo exercitados neste desafio
  e indicar brevemente COMO o problema força seu uso.
- Cada desafio deve exercitar pelo menos DOIS conceitos relevantes.
- Pelo menos UM exemplo deve representar um caso inválido ou erro.
"""

# ---------- GROQ CALL ----------
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

# ---------- EXTRAÇÃO JSON ----------
def extract_json(text: str) -> dict:
    match = re.search(r"\{.*\}", text, re.DOTALL)
    if not match:
        raise RuntimeError("Nenhum JSON encontrado")
    return json.loads(match.group())

challenge_data = extract_json(raw_content)

# ---------- ATUALIZA CONTADOR (UMA VEZ) ----------
conceitos_gerados = set(challenge_data.get("conceitos", []))

for conceito in conceitos_escolhidos:
    if conceito in conceitos_gerados:
        nivel_data["conceitos_contador"][conceito] += 1

# ---------- PERSISTE ESTADO ----------
with open(NIVEL_FILE, "w", encoding="utf-8") as f:
    json.dump(nivel_data, f, indent=4, ensure_ascii=False)

# ---------- JAVA FILE ----------
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