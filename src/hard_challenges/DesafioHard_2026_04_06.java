package hard_challenges;

/*
========================================
Sistema de Gerenciamento de Faturamento de Serviços
DESAFIO HARD
Data: 2026_04_06
========================================

ENUNCIADO:
Desenvolva um sistema que permita gerenciar faturamento de serviços de forma eficiente e escalável, considerando regras de negócio complexas e tratamento de erros rigoroso.

CONCEITOS:
- tratamento_erros
- excecoes_api

FOCO TÉCNICO:
- O sistema utilizará uma arquitetura em camadas, com uma camada de apresentação (API REST) e uma camada de negócios (serviços e regras de negócio).
- A camada de negócios utilizará exceções para tratar erros e evitar a propagação de erros em cascata.
- A API REST utilizará tratamento de erros para retornar mensagens de erro úteis e consistentes ao usuário.

REQUISITOS:
- O sistema deve permitir a criação de faturas para serviços de forma automatizada.
- O sistema deve permitir a edição de faturas existentes.
- O sistema deve permitir a exclusão de faturas existentes.
- O sistema deve calcular automaticamente o valor total de cada fatura.
- O sistema deve validar se o valor total de cada fatura é maior que o limite estabelecido.
- O sistema deve retornar uma mensagem de erro se o valor total de uma fatura for maior que o limite estabelecido.
- O sistema deve lidar com exceções em caso de erro de banco de dados ou erro de rede.

EXEMPLOS:
Entrada: POST /faturas HTTP/1.1
Host: example.com
Content-Type: application/json

{
  "servico": "Serviço X",
  "valor": 100.00
} | Saída esperada: {"fatura": {"id": 1, "servico": "Serviço X", "valor": 100.00, "total": 100.00}, "status": "OK"}
Entrada: POST /faturas HTTP/1.1
Host: example.com
Content-Type: application/json

{
  "servico": "Serviço X",
  "valor": 200.00
} | Saída esperada: {"erro": "Valor total da fatura é maior que o limite estabelecido.", "status": "ERRO"}
Entrada: POST /faturas HTTP/1.1
Host: example.com
Content-Type: application/json

{
  "servico": "Serviço X",
  "valor": -100.00
} | Saída esperada: {"erro": "Valor da fatura não pode ser negativo.", "status": "ERRO"}
*/

public class DesafioHard_2026_04_06 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
