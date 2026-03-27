package java_daily_challenges;

/*
========================================
Gerenciamento de Pedidos de Entrega
Nível: iniciante
Data: 2026_03_27_0709
========================================

ENUNCIADO:
Um sistema de entrega de pizzas precisa gerenciar pedidos de clientes. Cada pedido tem um ID, um cliente associado e uma lista de pizzas com seus respectivos ingredientes. O sistema deve permitir a adição de pedidos e a atualização de ingredientes de uma pizza específica. Além disso, o sistema deve verificar se um cliente tem pedidos pendentes antes de permitir a adição de um novo pedido.

CONCEITOS:
- listas
- mapas

REQUISITOS:
- Cada pedido tem um ID único
- Cada cliente pode ter vários pedidos pendentes
- Cada pizza tem um ID único e um conjunto de ingredientes
- O sistema deve permitir a adição de pedidos e a atualização de ingredientes de uma pizza específica

EXEMPLOS:
Entrada: {'cliente': 'João', 'pedidos': []} | Saída esperada: {'cliente': 'João', 'pedidos': [1]}
Entrada: {'cliente': 'Maria', 'pedidos': [1, 2]} | Saída esperada: {'cliente': 'Maria', 'pedidos': [1, 2, 3]}
Entrada: {'cliente': 'João', 'pedidos': [1, 2], 'pizzas': [{'id': 1, 'ingredientes': ['queijo', 'presunto']}]} | Saída esperada: {'cliente': 'João', 'pedidos': [1, 2], 'pizzas': [{'id': 1, 'ingredientes': ['queijo', 'presunto']}, {'id': 2, 'ingredientes': ['queijo', 'presunto']}]}
Entrada: {'cliente': 'João', 'pedidos': [1, 2], 'pizzas': [{'id': 1, 'ingredientes': ['queijo', 'presunto']}], 'erro': 'erro'} | Saída esperada: {'erro': 'erro'}
*/

public class Desafio_2026_03_27_0709 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
