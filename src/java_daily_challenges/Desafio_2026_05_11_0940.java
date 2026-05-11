package java_daily_challenges;

/*
========================================
Sistema de Controle de Estoque
Nível: iniciante
Data: 2026_05_11_0940
========================================

ENUNCIADO:
Desenvolva um sistema que controle o estoque de produtos em uma loja. O sistema deve permitir a inserção de produtos, a atualização da quantidade disponível e a consulta da quantidade disponível de cada produto.

CONCEITOS:
- variáveis
- exceções

REQUISITOS:
- O sistema deve ser capaz de lidar com a inserção de produtos com nome e quantidade disponível.
- O sistema deve ser capaz de atualizar a quantidade disponível de um produto existente.
- O sistema deve ser capaz de consultar a quantidade disponível de um produto existente.
- Se o produto não existir, o sistema deve lançar uma exceção com a mensagem 'Produto não encontrado'.
- Se a quantidade disponível for negativa, o sistema deve lançar uma exceção com a mensagem 'Quantidade disponível não pode ser negativa'.
- O sistema deve armazenar os dados em uma estrutura de dados simples (ex: lista de produtos).

EXEMPLOS:
Entrada: inserir produto: nome=Produto A, quantidade=10 | Saída esperada: {"nome":"Produto A","quantidade":10}
Entrada: atualizar produto: nome=Produto A, quantidade=20 | Saída esperada: {"nome":"Produto A","quantidade":20}
Entrada: consultar produto: nome=Produto A | Saída esperada: {"nome":"Produto A","quantidade":20}
Entrada: consultar produto: nome=Produto B | Saída esperada: {"erro":"Produto não encontrado"}
Entrada: atualizar produto: nome=Produto A, quantidade=-10 | Saída esperada: {"erro":"Quantidade disponível não pode ser negativa"}
*/

public class Desafio_2026_05_11_0940 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
