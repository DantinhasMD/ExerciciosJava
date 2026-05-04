package hard_challenges;

/*
========================================
Sistema de Processamento de Transações Financeiras
DESAFIO HARD
Data: 2026_05_04
========================================

ENUNCIADO:
Desenvolva um sistema que permita processar transações financeiras em paralelo, utilizando threads, e consume API de cotação de moedas.

CONCEITOS:
- consumo_api
- threads

FOCO TÉCNICO:
- O sistema deve utilizar threads para processar transações financeiras em paralelo, garantindo escalabilidade e performance.
- O consumo de API de cotação de moedas deve ser realizado utilizando a biblioteca HttpClient, com tratamento de erros e exceções.
- O sistema deve utilizar uma estrutura de dados para armazenar as transações em processamento, permitindo a visualização do status de cada transação.

REQUISITOS:
- O sistema deve processar no máximo 100 transações por segundo.
- O sistema deve ter uma taxa de erro de no máximo 1% em transações que envolvem a API de cotação de moedas.
- O sistema deve ter uma estrutura de dados que permita a visualização do status de cada transação em tempo real.
- O sistema deve ter um mecanismo de retenção de transações que foram canceladas ou falharam.
- O sistema deve ter uma API REST para gerenciar as transações, incluindo a criação, atualização e exclusão de transações.
- O sistema deve ter um mecanismo de autenticação e autorização para garantir que apenas usuários autorizados possam acessar as transações.
- O sistema deve ter um mecanismo de monitoramento e log para garantir que todos os eventos sejam registrados e analisados.

EXEMPLOS:
Entrada: POST /transacoes HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{"valor": 100.0, "moeda": "USD"} | Saída esperada: {"id": 1, "status": "PROCESSANDO", "valor": 100.0, "moeda": "USD"}
Entrada: POST /transacoes HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{"valor": 100.0, "moeda": "USD"} | Saída esperada: {"id": 1, "status": "ERRO", "mensagem": "API de cotação de moedas indisponível"}
Entrada: POST /transacoes HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{"valor": -100.0, "moeda": "USD"} | Saída esperada: {"id": 1, "status": "ERRO", "mensagem": "Valor inválido"}
*/

public class DesafioHard_2026_05_04 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
