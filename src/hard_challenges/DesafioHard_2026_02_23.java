package hard_challenges;

/*
========================================
Sistema de Gerenciamento de Pedidos de Venda
DESAFIO HARD
Data: 2026_02_23
========================================

ENUNCIADO:
Desenvolva um sistema que permita gerenciar pedidos de venda de produtos em uma loja online. O sistema deve lidar com diferentes tipos de pedidos (simples, prazos e priorizados), calcular os custos e impostos, e gerar relatórios de venda.

CONCEITOS:
- tratamento_erros
- excecoes_api

FOCO TÉCNICO:
- O tratamento de erros será implementado utilizando try-catch para capturar exceções durante a execução do sistema. Além disso, será utilizada a interface de exceção do Java para definir e lançar exceções personalizadas.
- A API será implementada utilizando RESTful, com endpoints para cada tipo de pedido. A validação de entrada será feita utilizando Bean Validation (Hibernate Validator).

REQUISITOS:
- O sistema deve ser capaz de lidar com diferentes tipos de pedidos (simples, prazos e priorizados).
- O sistema deve calcular os custos e impostos com base nos preços dos produtos e nas taxas de entrega.
- O sistema deve gerar relatórios de venda diários, semanais e mensais.
- O sistema deve permitir a criação de usuários e permissões para cada tipo de pedido.
- O sistema deve ter uma interface de usuário para visualizar os pedidos e relatórios.
- O sistema deve ser capaz de lidar com pedidos cancelados e devoluções.
- O sistema deve ter uma camada de integração com o sistema de pagamento para processar as transações.

EXEMPLOS:
Entrada: Request {"pedido": {"tipo": "simples", "produtos": [{"nome": "Produto 1", "preco": 10.99}], "endereco": {"logradouro": "Rua 1", "numero": 123}}} | Saída esperada: {"pedido": {"id": 1, "status": "em processamento", "total": 10.99}}
Entrada: Request {"pedido": {"tipo": "simples", "produtos": [{"nome": "Produto 1", "preco": -10.99}], "endereco": {"logradouro": "Rua 1", "numero": 123}}} | Saída esperada: {"erro": "Preço inválido"}
Entrada: Request {"pedido": {"tipo": "prazo", "produtos": [{"nome": "Produto 1", "preco": 10.99}], "endereco": {"logradouro": "Rua 1", "numero": 123}, "prazo": "2024-01-01"}} | Saída esperada: {"pedido": {"id": 2, "status": "em processamento", "total": 10.99}}
*/

public class DesafioHard_2026_02_23 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
