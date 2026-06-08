package hard_challenges;

/*
========================================
Sistema de Gerenciamento de Pedidos de Serviços de Manutenção
DESAFIO HARD
Data: 2026_06_08
========================================

ENUNCIADO:
Desenvolva um sistema que permita gerenciar pedidos de serviços de manutenção em uma fábrica de automóveis. O sistema deve permitir que os funcionários registrem pedidos, atribuam prioridade e status aos pedidos, e que os gerentes visualize os pedidos em aberto e atribua funcionários para realizarem as manutenções.

CONCEITOS:
- collections_list
- collections_set

FOCO TÉCNICO:
- O uso de collections_list permitirá que os pedidos sejam armazenados em uma estrutura ordenada e indexada, facilitando a busca e ordenação dos pedidos.
- O uso de collections_set permitirá que os funcionários sejam armazenados em uma estrutura sem duplicatas, garantindo que nenhum funcionário seja atribuído a mais de um pedido ao mesmo tempo.

REQUISITOS:
- O sistema deve permitir que os funcionários registrem pedidos com data e hora de solicitação, descrição do serviço necessário e prioridade do pedido.
- O sistema deve permitir que os funcionários atribuam status aos pedidos (aberto, em andamento, concluído, cancelado).
- O sistema deve permitir que os gerentes visualize os pedidos em aberto e atribua funcionários para realizarem as manutenções.
- O sistema deve permitir que os funcionários sejam atribuídos a mais de um pedido ao mesmo tempo.
- O sistema deve garantir que nenhum funcionário seja atribuído a mais de um pedido ao mesmo tempo.
- O sistema deve permitir que os gerentes visualize o histórico de alterações nos pedidos (data e hora de alteração, usuário que fez a alteração e descrição da alteração).
- O sistema deve garantir a integridade dos dados, evitando que pedidos sejam registrados com data e hora de solicitação no passado.
- O sistema deve permitir que os funcionários visualize os pedidos que eles estão atribuídos e os status desses pedidos.
- O sistema deve permitir que os gerentes visualize os funcionários que estão atribuídos a cada pedido e os status desses pedidos.

EXEMPLOS:
Entrada: {"pedido": {"dataSolicitacao": "2022-01-01", "descricao": "Manutenção de motor", "prioridade": "alta", "status": "aberto"}, "funcionario": {"nome": "João", "email": "joao@example.com"}} | Saída esperada: {"pedido": {"dataSolicitacao": "2022-01-01", "descricao": "Manutenção de motor", "prioridade": "alta", "status": "aberto"}, "funcionario": {"nome": "João", "email": "joao@example.com"}, "erro": "Pedido criado com sucesso"}
Entrada: {"pedido": {"dataSolicitacao": "2022-01-01", "descricao": "Manutenção de motor", "prioridade": "alta", "status": "aberto"}, "funcionario": {"nome": "João", "email": "joao@example.com"}} | Saída esperada: {"pedido": {"dataSolicitacao": "2022-01-01", "descricao": "Manutenção de motor", "prioridade": "alta", "status": "aberto"}, "funcionario": {"nome": "João", "email": "joao@example.com"}, "erro": "Funcionário já atribuído a outro pedido"}
Entrada: {"pedido": {"dataSolicitacao": "2022-01-01", "descricao": "Manutenção de motor", "prioridade": "alta", "status": "aberto"}, "funcionario": {"nome": "João", "email": "joao@example.com"}} | Saída esperada: {"pedido": {"dataSolicitacao": "2022-01-01", "descricao": "Manutenção de motor", "prioridade": "alta", "status": "aberto"}, "funcionario": {"nome": "João", "email": "joao@example.com"}, "erro": "Data de solicitação no passado"}
*/

public class DesafioHard_2026_06_08 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
