package java_daily_challenges;

/*
========================================
Sistema de Controle de Estoque
Nível: iniciante
Data: 2026_05_20_0935
========================================

ENUNCIADO:
Um sistema de controle de estoque precisa gerenciar a entrada e saída de produtos em uma loja. O sistema deve permitir que o usuário adicione produtos ao estoque, retire produtos do estoque e exiba o estoque atual.

CONCEITOS:
- variáveis
- exceções

REQUISITOS:
- O sistema deve permitir que o usuário adicione produtos ao estoque com um código de barras único e um nome do produto.
- O sistema deve permitir que o usuário retire produtos do estoque com um código de barras único.
- O sistema deve exibir o estoque atual após cada operação.
- O sistema deve gerenciar as exceções caso o usuário tente adicionar um produto que já existe no estoque ou retirar um produto que não existe no estoque.

EXEMPLOS:
Entrada: add produto 1 12345 Produto A | Saída esperada: Produto adicionado ao estoque com sucesso. Estoque atual: {"12345": "Produto A", "quantidade": "1"}
Entrada: retirar produto 12345 | Saída esperada: Produto retirado do estoque com sucesso. Estoque atual: {"12345": "Produto A", "quantidade": "0"}
Entrada: add produto 12345 Produto B | Saída esperada: Erro: produto já existe no estoque. Estoque atual: {"12345": "Produto A", "quantidade": "1"}
Entrada: retirar produto 67890 | Saída esperada: Erro: produto não existe no estoque. Estoque atual: {"12345": "Produto A", "quantidade": "1"}
*/

public class Desafio_2026_05_20_0935 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
