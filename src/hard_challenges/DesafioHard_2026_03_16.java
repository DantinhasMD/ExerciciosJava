package hard_challenges;

/*
========================================
Sistema de Gerenciamento de Pedidos de Serviços de Manutenção
DESAFIO HARD
Data: 2026_03_16
========================================

ENUNCIADO:
Desenvolva um sistema que gerencie pedidos de serviços de manutenção para equipamentos em uma fábrica. O sistema deve permitir que os usuários ingressem pedidos, gerenciem os status dos pedidos e forneçam relatórios sobre a frequência de manutenção necessária.

CONCEITOS:
- collections_list
- collections_set

FOCO TÉCNICO:
- O conceito de collections_list será exigido para armazenar e gerenciar a lista de pedidos de manutenção. A lista deve ser capaz de ser ordenada por data de entrada, status e prioridade.
- O conceito de collections_set será exigido para armazenar e gerenciar a coleção de equipamentos que necessitam de manutenção. A coleção deve ser capaz de ser atualizada automaticamente quando um pedido de manutenção for concluído.
- O sistema deve utilizar um algoritmo de ordenação para garantir que os pedidos sejam processados da forma correta.

REQUISITOS:
- O sistema deve permitir que os usuários ingressem pedidos de manutenção com data de entrada, status e prioridade.
- O sistema deve gerenciar a lista de pedidos de manutenção de forma ordenada por data de entrada, status e prioridade.
- O sistema deve gerenciar a coleção de equipamentos que necessitam de manutenção.
- O sistema deve fornecer relatórios sobre a frequência de manutenção necessária para cada equipamento.
- O sistema deve enviar notificações automáticas para os usuários quando um pedido de manutenção for concluído.
- O sistema deve permitir que os usuários cancellem pedidos de manutenção.
- O sistema deve gerenciar a história de alterações de cada pedido de manutenção.

EXEMPLOS:
Entrada: { 'pedido': 'Manutenção em equipamento X', 'data': '2024-03-15', 'status': 'pendente', 'prioridade': 'alta' } | Saída esperada: { 'pedido': 'Manutenção em equipamento X', 'data': '2024-03-15', 'status': 'pendente', 'prioridade': 'alta', 'historia': ['2024-03-15 - pedido adicionado'] }
Entrada: { 'pedido': 'Manutenção em equipamento Y', 'data': '2024-03-16', 'status': 'concluído', 'prioridade': 'baixa' } | Saída esperada: { 'pedido': 'Manutenção em equipamento Y', 'data': '2024-03-16', 'status': 'concluído', 'prioridade': 'baixa', 'historia': ['2024-03-16 - pedido adicionado', '2024-03-16 - pedido concluído'] }
Entrada: { 'pedido': 'Manutenção em equipamento Z', 'data': '2024-03-17', 'status': 'cancelado', 'prioridade': 'alta' } | Saída esperada: { 'pedido': 'Manutenção em equipamento Z', 'data': '2024-03-17', 'status': 'cancelado', 'prioridade': 'alta', 'historia': ['2024-03-17 - pedido cancelado'] }
Entrada: { 'pedido': 'Manutenção em equipamento X', 'data': '2024-03-15', 'status': 'pendente', 'prioridade': 'alta', 'equipamento': 'X' } | Saída esperada: Erro: equipamento não encontrado
*/

public class DesafioHard_2026_03_16 {
    public static void main(String[] args) {
        // Aqui não tem atalho.
    }
}
