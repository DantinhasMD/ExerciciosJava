package hard_challenges;

/*
========================================
Sistema de Processamento de Transações Financeiras
DESAFIO HARD
Data: 2026_06_01
========================================

ENUNCIADO:
Desenvolva um sistema que processa transações financeiras em tempo real, lidando com milhares de requisições por segundo, utilizando APIs de pagamentos e bancos, garantindo integridade dos dados e segurança do sistema.

CONCEITOS:
- consumo_api
- threads

FOCO TÉCNICO:
- O sistema deve utilizar threads para lidar com as requisições em paralelo, garantindo que as transações sejam processadas em tempo real.
- As APIs de pagamentos e bancos devem ser consumidas utilizando o padrão REST, com tratamento de erros rigoroso e validação de dados.
- O sistema deve utilizar uma base de dados para armazenar os dados de transação, com garantia de integridade dos dados e segurança do sistema.

REQUISITOS:
- O sistema deve processar pelo menos 5.000 requisições por segundo.
- O sistema deve lidar com APIs de pagamentos e bancos que retornam respostas em JSON.
- O sistema deve validar os dados de entrada antes de processar as transações.
- O sistema deve garantir a integridade dos dados e segurança do sistema.
- O sistema deve utilizar threads para lidar com as requisições em paralelo.
- O sistema deve utilizar uma base de dados para armazenar os dados de transação.
- O sistema deve ter um sistema de log para registrar as transações processadas.
- O sistema deve ter um sistema de alerta para notificar em caso de erro ou falha do sistema.

EXEMPLOS:
Entrada: POST /transacoes HTTP/1.1
Content-Type: application/json

{
  "id_transacao": 1,
  "valor": 100.00,
  "status": "Pendente"
} | Saída esperada: {
  "id_transacao": 1,
  "valor": 100.00,
  "status": "Aprovada"
}
Entrada: POST /transacoes HTTP/1.1
Content-Type: application/json

{
  "id_transacao": 1,
  "valor": -100.00,
  "status": "Pendente"
} | Saída esperada: {
  "erro": "Valor inválido"
}
Entrada: POST /transacoes HTTP/1.1
Content-Type: application/json

{
  "id_transacao": 1,
  "valor": 100.00,
  "status": "Invalido"
} | Saída esperada: {
  "erro": "Status inválido"
}
*/

public class DesafioHard_2026_06_01 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
