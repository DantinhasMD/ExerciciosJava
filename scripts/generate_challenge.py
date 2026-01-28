import os, json, datetime

folder = "src/java_daily_challenges"
os.makedirs(folder, exist_ok=True)

nivel_file = f"{folder}/nivel.json"

# Se não existir, cria nível inicial
if not os.path.exists(nivel_file):
    nivel_data = {
        "nivel_atual": "iniciante",
        "ultima_analise": str(datetime.date.today()),
        "exercicios_desde_analise": 0
    }
else:
    with open(nivel_file, "r") as f:
        nivel_data = json.load(f)

# Atualiza contador
nivel_data["exercicios_desde_analise"] += 1

# Se chegou a 30, reavalia nível
if nivel_data["exercicios_desde_analise"] >= 30:
    # Aqui você pode colocar lógica simples ou chamar IA
    if nivel_data["nivel_atual"] == "iniciante":
        nivel_data["nivel_atual"] = "intermediario"
    elif nivel_data["nivel_atual"] == "intermediario":
        nivel_data["nivel_atual"] = "avancado"
    # Reinicia contador e atualiza data
    nivel_data["exercicios_desde_analise"] = 0
    nivel_data["ultima_analise"] = str(datetime.date.today())

# Salva nível atualizado
with open(nivel_file, "w") as f:
    json.dump(nivel_data, f, indent=4)

# Gera desafio adaptado ao nível
today = datetime.date.today().strftime("%Y_%m_%d")
filename = f"{folder}/Desafio_{today}.java"

nivel = nivel_data["nivel_atual"]

if nivel == "iniciante":
    desafio = "Crie um programa que leia números e calcule a média."
elif nivel == "intermediario":
    desafio = "Implemente um sistema em Java usando MVC para gerenciar uma lista de tarefas."
else:  # avançado
    desafio = "Desenvolva uma API REST em Java (Spring Boot) para gerenciar usuários e autenticação."

challenge = f"""
/*
Desafio do dia {today} - Nível: {nivel}

{desafio}
*/

public class Desafio_{today} {{
    public static void main(String[] args) {{
        System.out.println("Inicie sua implementação aqui!");
    }}
}}
"""

with open(filename, "w") as f:
    f.write(challenge)
