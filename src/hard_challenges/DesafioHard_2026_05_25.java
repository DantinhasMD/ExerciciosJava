package hard_challenges;

/*
========================================
Sistema de Gerenciamento de Pedidos de Compras
DESAFIO HARD
Data: 2026_05_25
========================================

ENUNCIADO:
Desenvolva um sistema que gerencie pedidos de compras de produtos para uma loja online. O sistema deve permitir que os usuários criem pedidos, adicione produtos a esses pedidos e gerencie a entrega desses pedidos.

CONCEITOS:
- tratamento_erros
- excecoes_api

FOCO TÉCNICO:
- O tratamento de erros será implementado utilizando a técnica de 'try-catch' para capturar exceções que possam ocorrer durante a execução do sistema.
- As exceções API serão implementadas utilizando a interface 'RestController' para tratar requisições HTTP e retornar respostas com status de erro.
- O sistema utilizará a técnica de 'Dependency Injection' para injeção de dependências e gerenciamento de objetos.

REQUISITOS:
- O sistema deve permitir que os usuários criem pedidos com data de entrega e endereço de entrega.
- O sistema deve permitir que os usuários adicionem produtos a pedidos existentes.
- O sistema deve gerenciar a entrega dos pedidos, atualizando o status do pedido e enviando notificações para os usuários.
- O sistema deve validar a existência de produtos antes de adicioná-los a pedidos.
- O sistema deve gerenciar a estoque de produtos, atualizando a quantidade disponível quando um produto é adicionado a um pedido.
- O sistema deve retornar um erro se o usuário tentar adicionar um produto que não existe.
- O sistema deve retornar um erro se o usuário tentar criar um pedido com data de entrega inválida.
- O sistema deve retornar um erro se o usuário tentar criar um pedido com endereço de entrega inválido.

EXEMPLOS:
Entrada: POST /pedidos { 'data_entrega': '2024-01-01', 'endereco_entrega': 'Rua ABC, 123' } | Saída esperada: {"data_entrega":"2024-01-01","endereco_entrega":"Rua ABC, 123","status":"Criado"}
Entrada: POST /pedidos { 'data_entrega': '2024-01-01', 'endereco_entrega': 'Rua ABC, 123' } | Saída esperada: {"erro":"Data de entrega inválida"}
Entrada: POST /pedidos { 'data_entrega': '2024-01-01', 'endereco_entrega': null } | Saída esperada: {"erro":"Endereço de entrega é obrigatório"}
Entrada: GET /pedidos/123/productos | Saída esperada: {"erro":"Pedido não encontrado"}
Entrada: POST /pedidos/123/productos { 'produto_id': 123, 'quantidade': 10 } | Saída esperada: {"produto_id":123,"quantidade":10,"pedido_id":123}
Entrada: POST /pedidos/123/productos { 'produto_id': 123, 'quantidade': 10 } | Saída esperada: {"erro":"Produto não encontrado"}
*/

public class DesafioHard_2026_05_25 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
