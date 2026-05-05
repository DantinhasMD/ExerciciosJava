package java_daily_challenges;

/*
========================================
Sistema de Controle de Estoque
Nível: iniciante
Data: 2026_05_05_0810
========================================

ENUNCIADO:
Desenvolva um sistema que controle o estoque de produtos em uma loja. O sistema deve permitir a inserção de produtos, a atualização da quantidade de produtos em estoque e a remoção de produtos do estoque.

CONCEITOS:
- variáveis
- exceções

REQUISITOS:
- O sistema deve permitir a inserção de produtos com nome, preço e quantidade em estoque.
- O sistema deve permitir a atualização da quantidade de produtos em estoque apenas se o produto existir no estoque.
- O sistema deve permitir a remoção de produtos do estoque apenas se a quantidade solicitada for menor ou igual à quantidade em estoque.
- Se o usuário tentar atualizar ou remover um produto que não existe no estoque, o sistema deve lançar uma exceção.

EXEMPLOS:
Entrada: inserir produto: nome = 'Café', preço = 10.0, quantidade = 100 | Saída esperada: Produto inserido com sucesso!
Entrada: atualizar produto: nome = 'Café', quantidade = 50 | Saída esperada: Quantidade atualizada com sucesso!
Entrada: remover produto: nome = 'Café', quantidade = 50 | Saída esperada: Quantidade removida com sucesso!
Entrada: atualizar produto: nome = 'Café', quantidade = 200 | Saída esperada: Erro: Produto não encontrado!
Entrada: remover produto: nome = 'Café', quantidade = 150 | Saída esperada: Erro: Quantidade solicitada maior que a quantidade em estoque!
*/

public class Desafio_2026_05_05_0810 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
