import datetime

today = datetime.date.today().strftime("%Y_%m_%d")
filename = f"src/java_dailys_challenges/Desafio_{today}.java"

challenge = f"""
/*
Desafio do dia {today}:

Implemente um pequeno sistema em Java usando o padrão MVC
para gerenciar uma lista de tarefas (ToDo List).
Funcionalidades mínimas:
- Adicionar tarefa
- Listar tarefas
- Marcar tarefa como concluída
- Remover tarefa

Use boas práticas de orientação a objetos.
*/

public class Desafio_{today} {{
    public static void main(String[] args) {{
        System.out.println("Inicie sua implementação aqui!");
    }}
}}
"""

with open(filename, "w") as f:
    f.write(challenge)
