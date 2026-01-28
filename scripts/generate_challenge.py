import os
import json
import datetime
import requests

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

# ---------- NIVEL ----------
if not os.path.exists(NIVEL_FILE):
    nivel_data = {
        "nivel_atual": "iniciante",
        "ultima_analise": str(datetime.date.today()),
        "exercicios_desde_analise": 0
    }
else:
    with open(NIVEL_FILE, "r", encoding="utf-8") as f:
        nivel_data = json.load(f)

nivel_data["exercicios_desde_analise"] += 1

if nivel_data["exercicios_desde_analise"] >= 90:
    if nivel_data["nivel_atual"] == "iniciante":
        nivel_data["nivel_atual"] = "intermediario"
    elif nivel_data["nivel_atual"] == "intermediario":
        nivel_data["nivel_atual"] = "avancado"

    nivel_data["exercicios_desde_analise"] = 0
    nivel_data["ultima_analise"] = str(datetime.date.today())

with open(NIVEL_FILE, "w", encoding="utf-8") as f:
    json.dump(nivel_data, f, indent=4, ensure_ascii=False)

nivel = nivel_data["nivel_atual"]

# ---------- PROMPT ----------
prompt = f"""
Você é um arquiteto de software especialista em Java Backend e Spring Boot.

Nível do usuário: {nivel}

Gere UM desafio diário realista, baseado em problemas de sistemas reais.

Formato de resposta OBRIGATÓRIO (JSON válido):

{{
  "titulo": "string",
  "enunciado": "string",
  "requisitos": ["string", "string"],
  "exemplos": [
    {{
      "entrada": "string",
      "saida": "string"
    }}
  ]
}}

Diretrizes por nível:

INICIANTE:
- lógica básica
- console
- problemas simples com contexto real

INTERMEDIÁRIO:
- API REST com Spring Boot
- regras de negócio
- separação de camadas
- modelagem de dados
- objetivos claros de execução

AVANÇADO:
- decisões arquiteturais
- design de projeto
- extensibilidade
- qualidade de código

Regras:
- Não inclua código
- Não explique a solução
- Não use markdown
- Seja objetivo e profissional
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

# ---------- TRATAMENTO DE ERRO DA API ----------
if "choices" not in data:
    raise RuntimeError(
        "Erro ao gerar desafio via Groq API:\n"
        + json.dumps(data, indent=2, ensure_ascii=False)
    )

raw_content = data["choices"][0]["message"]["content"].strip()

# ---------- PARSE SEGURO DO JSON DA IA ----------
try:
    challenge_data = json.loads(raw_content)
except json.JSONDecodeError:
    raise RuntimeError(
        "Resposta da IA não é JSON válido:\n" + raw_content
    )

# ---------- VALIDACAO DE CONTRATO ----------
required_keys = {"titulo", "enunciado", "requisitos", "exemplos"}
if not required_keys.issubset(challenge_data):
    raise RuntimeError(
        "JSON retornado não segue o contrato esperado:\n"
        + json.dumps(challenge_data, indent=2, ensure_ascii=False)
    )

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
