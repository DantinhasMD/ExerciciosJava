import os
import json
import datetime
import requests
import re
import sys

# ================= CONFIG =================
FOLDER = "src/hard_challenges"
os.makedirs(FOLDER, exist_ok=True)

STATE_FILE = f"{FOLDER}/hard_state.json"

GROQ_API_KEY = os.getenv("GROQ_API_KEY")
MODEL = os.getenv("GROQ_MODEL", "llama-3.1-8b-instant")
API_URL = "https://api.groq.com/openai/v1/chat/completions"
# =========================================

if not GROQ_API_KEY:
    raise RuntimeError("GROQ_API_KEY não encontrada")

# ================= CONCEITOS HARD =================
HARD_CONCEITOS = [
    "collections_list",
    "collections_set",
    "collections_map",
    "collections_queue",
    "tratamento_erros",
    "excecoes_api",
    "consumo_api",
    "threads"
]

# ================= ESTADO =================
today = datetime.date.today()

if not os.path.exists(STATE_FILE):
    raise RuntimeError("Arquivo hard_state.json não encontrado")

with open(STATE_FILE, "r", encoding="utf-8") as f:
    state = json.load(f)

# Garante compatibilidade futura
state.setdefault("total_exercicios", 0)
state.setdefault("ultimo_exercicio", None)
state.setdefault("conceitos_contador", {})

for conceito in HARD_CONCEITOS:
    state["conceitos_contador"].setdefault(conceito, 0)

# ================= ESCOLHA BALANCEADA =================
def escolher_conceitos(contador, qtd=2):
    ordenados = sorted(contador.items(), key=lambda x: x[1])
    return [c[0] for c in ordenados[:qtd]]

conceitos_escolhidos = escolher_conceitos(state["conceitos_contador"], 2)

# ================= PROMPT HARD =================
prompt = f"""
Você é um arquiteto de software sênior especializado em Java,
responsável por formar desenvolvedores capazes de atuar em sistemas críticos.

Este é um DESAFIO HARD semanal.

CONCEITOS OBRIGATÓRIOS:
{", ".join(conceitos_escolhidos)}

Gere UM desafio realista, complexo e profundo, baseado em sistemas reais
de produção.

O desafio deve:
- Exigir decisões técnicas explícitas
- Forçar uso consciente das estruturas escolhidas
- Conter regras de negócio interdependentes
- Ter tratamento de erro rigoroso
- NÃO explicar a solução
- Responder EXCLUSIVAMENTE com JSON válido
- Não usar markdown
- Não incluir texto fora do JSON

Formato OBRIGATÓRIO:

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
- MÍNIMO de 7 requisitos
- Pelo menos UM exemplo inválido com erro explícito
- "foco_tecnico" deve explicar COMO cada conceito é exigido
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

raw = data["choices"][0]["message"]["content"]

# ================= EXTRAÇÃO JSON =================
def extract_json(text):
    match = re.search(r"\{.*\}", text, re.DOTALL)
    if not match:
        raise RuntimeError("JSON não encontrado")
    return json.loads(match.group())

challenge = extract_json(raw)

# ================= VALIDAÇÃO HARD =================
obrigatorios = [
    "titulo", "enunciado", "conceitos",
    "foco_tecnico", "requisitos", "exemplos"
]

for campo in obrigatorios:
    if campo not in challenge:
        raise RuntimeError(f"Campo ausente: {campo}")

if len(challenge["requisitos"]) < 7:
    raise RuntimeError("Desafio HARD exige no mínimo 7 requisitos")

if not any(
        "erro" in e["saida"].lower() or "inválid" in e["saida"].lower()
        for e in challenge["exemplos"]
):
    raise RuntimeError("Nenhum exemplo de erro encontrado")

# ================= ATUALIZA ESTADO =================
state["total_exercicios"] += 1
state["ultimo_exercicio"] = today.isoformat()

for c in conceitos_escolhidos:
    state["conceitos_contador"][c] += 1

with open(STATE_FILE, "w", encoding="utf-8") as f:
    json.dump(state, f, indent=4, ensure_ascii=False)

# ================= JAVA FILE =================
date_str = today.strftime("%Y_%m_%d")
classname = f"DesafioHard_{date_str}"
filename = f"{FOLDER}/{classname}.java"

java_file = f"""package hard_challenges;

/*
========================================
{challenge["titulo"]}
DESAFIO HARD
Data: {date_str}
========================================

ENUNCIADO:
{challenge["enunciado"]}

CONCEITOS:
{chr(10).join("- " + c for c in challenge["conceitos"])}

FOCO TÉCNICO:
{chr(10).join("- " + f for f in challenge["foco_tecnico"])}

REQUISITOS:
{chr(10).join("- " + r for r in challenge["requisitos"])}

EXEMPLOS:
{chr(10).join(
    f"Entrada: {e['entrada']} | Saída esperada: {e['saida']}"
    for e in challenge["exemplos"]
)}
*/

public class {classname} {{
    public static void main(String[] args) {{
        // Aqui não tem atalho.
    }}
}}
"""

with open(filename, "w", encoding="utf-8") as f:
    f.write(java_file)

print(f" Desafio HARD gerado com sucesso: {filename}")
