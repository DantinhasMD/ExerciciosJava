import os
import json
import datetime
import requests

# ================= CONFIG =================
FOLDER = "src/java_daily_challenges"
os.makedirs(FOLDER, exist_ok=True)

NIVEL_FILE = f"{FOLDER}/nivel.json"
GROQ_API_KEY = os.getenv("GROQ_API_KEY")
MODEL = "llama3-8b-8192"
# =========================================

# ---------- NIVEL ----------
if not os.path.exists(NIVEL_FILE):
    nivel_data = {
        "nivel_atual": "iniciante",
        "ultima_analise": str(datetime.date.today()),
        "exercicios_desde_analise": 0
    }
else:
    with open(NIVEL_FILE, "r") as f:
        nivel_data = json.load(f)

nivel_data["exercicios_desde_analise"] += 1

if nivel_data["exercicios_desde_analise"] >= 30:
    nivel_data["nivel_atual"] = (
        "intermediario" if nivel_data["nivel_atual"] == "iniciante"
        else "avancado"
    )
    nivel_data["exercicios_desde_analise"] = 0
    nivel_data["ultima_analise"] = str(datetime.date.today())

with open(NIVEL_FILE, "w") as f:
    json.dump(nivel_data, f, indent=4)

nivel = nivel_data["nivel_atual"]

# ---------- PROMPT ----------
prompt = f"""
Você é um gerador de desafios diários de programação em Java.

Nível do usuário: {nivel}

Gere UM desafio seguindo EXATAMENTE este formato JSON:

{{
  "titulo": "...",
  "enunciado": "...",
  "requisitos": ["...", "..."],
  "exemplos": [
    {{
      "entrada": "...",
      "saida": "..."
    }}
  ]
}}

Regras:
- Não explique a solução
- Não inclua código Java
- Use apenas lógica compatível com o nível informado
- Seja claro e objetivo
"""

# ---------- GROQ CALL ----------
response = requests.post(
    "https://api.groq.com/openai/v1/chat/completions",
    headers={
        "Authorization": f"Bearer {GROQ_API_KEY}",
        "Content-Type": "application/json"
    },
    json={
        "model": MODEL,
        "messages": [{"role": "user", "content": prompt}],
        "temperature": 0.7
    }
)

content = response.json()["choices"][0]["message"]["content"]
challenge_data = json.loads(content)

# ---------- JAVA FILE ----------
today = datetime.datetime.now().strftime("%Y_%m_%d_%H%M")
classname = f"Desafio_{today}"
filename = f"{FOLDER}/{classname}.java"

java_file = f"""
package java_daily_challenges;

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

with open(filename, "w") as f:
    f.write(java_file)
