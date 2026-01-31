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

# ---------- PROMPT (COMPLETO, SEM CORTES) ----------
prompt = f"""
Você é um arquiteto de software especialista em Java Backend e Spring Boot,
com foco em formação completa e progressiva de desenvolvedores Java.

Nível do usuário: {nivel}

Gere UM desafio diário realista, baseado em problemas de sistemas reais,
usados em empresas, produtos ou plataformas internas.

O desafio deve:
- Ter regras de negócio claras e verificáveis
- Exigir decisões técnicas implícitas (estrutura de dados, validação, regras)
- Ter comportamento determinístico (resultado certo ou errado)
- Evoluir conforme o nível informado, sem antecipar conceitos
- Responda EXCLUSIVAMENTE com um JSON válido.
- Não inclua texto fora do JSON.
- Não use markdown.
- Não explique a solução.

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

- "foco_tecnico" deve listar os conceitos do currículo exercitados neste desafio
  e indicar brevemente COMO o problema força seu uso
  (ex: "List: armazenamento e iteração", "Exceções: validação de entrada").
- Cada desafio deve exercitar pelo menos DOIS conceitos relevantes.
- Os requisitos devem impor restrições reais, não descrições genéricas.
- Os exemplos devem permitir validar se a solução está correta ou incorreta.
- Pelo menos UM exemplo deve representar um caso inválido ou erro.

Currículo técnico obrigatório:
Os conceitos abaixo DEVEM ser exercitados de forma prática no exercício prático.
Cada desafio deve envolver pelo menos DOIS conceitos relevantes:

1. Linguagem Java:
- Tipos primitivos e objetos
- Imutabilidade
- equals e hashCode
- Generics
- Optional
- enum
- Exceções

2. Orientação a Objetos:
- Encapsulamento
- Abstração
- Polimorfismo
- Interfaces e contratos
- Composição vs herança
- SOLID aplicado

3. Estruturas de Dados:
- List, Set e Map
- Escolha consciente de implementação
- Ordenação e comparação

4. Erros e Validações:
- Exceções de negócio
- Validação de entrada
- Fail-fast

5. Concorrência e Assincronismo:
- Threads e execução concorrente
- Processamento assíncrono
- Consistência de dados

6. JVM e Runtime:
- Ciclo de vida de objetos
- Stack vs Heap
- Impactos de performance

7. Backend com Spring Boot:
- Injeção de dependência
- Separação de camadas
- Design de APIs REST
- Tratamento global de exceções

8. Dados e Persistência:
- Modelagem de dados
- Leitura e escrita
- Regras de consistência

9. Arquitetura e Qualidade:
- Separação de responsabilidades
- Dependências entre camadas
- Extensibilidade e manutenção

Se um conceito do currículo não for adequado ao nível atual,
ele NÃO deve aparecer nem ser mencionado no desafio.

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
    raise RuntimeError(
        "Erro ao gerar desafio via Groq API:\n"
        + json.dumps(data, indent=2, ensure_ascii=False)
    )

raw_content = data["choices"][0]["message"]["content"]

# ---------- EXTRAÇÃO SEGURA DO JSON ----------
def extract_json(text: str) -> dict:
    match = re.search(r"\{.*\}", text, re.DOTALL)
    if not match:
        raise RuntimeError("Nenhum JSON encontrado na resposta da IA")

    try:
        return json.loads(match.group())
    except json.JSONDecodeError as e:
        raise RuntimeError(
            "JSON inválido retornado pela IA:\n" + match.group()
        ) from e

challenge_data = extract_json(raw_content)

# ---------- VALIDAÇÃO DE CONTRATO ----------
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

print(f"Desafio gerado com sucesso: {filename}")
