package java_daily_challenges;

/*
========================================
Gerenciamento de estoque de produtos
Nível: iniciante
Data: 2026_02_10_0705
========================================

ENUNCIADO:
Um sistema de gerenciamento de estoque de produtos deve permitir que os usuários adicionem e removam
produtos do estoque, e também devem verificar se há produtos suficientes para atender
a uma ordem de compra.

CONCEITOS:
- exceções
- mapas

REQUISITOS:
- O estoque não pode conter produtos com quantidades negativas
- O sistema deve verificar se há produtos suficientes para atender a uma ordem de compra
- O sistema deve permitir que os usuários adicionem e removam produtos do estoque

EXEMPLOS:
Entrada: adicionarproduto {'produto': 'Camisa', 'quantidade': 10} | Saída esperada: {"produto":"Camisa","quantidade":10}
Entrada: adicionarproduto {'produto': 'Camisa', 'quantidade': -5} | Saída esperada: {"erro":"Quantidade inválida"}
Entrada: removerproduto {'produto': 'Camisa', 'quantidade': 5} | Saída esperada: {"produto":"Camisa","quantidade":5}
Entrada: removerproduto {'produto': 'Camisa', 'quantidade': 15} | Saída esperada: {"erro":"Quantidade insuficiente"}
Entrada: verificarestoque {'produto': 'Camisa'} | Saída esperada: {"produto":"Camisa","quantidade":10}
Entrada: verificarestoque {'produto': 'Camisa'} | Saída esperada: {"produto":"Camisa","quantidade":0}
*/

public class Desafio_2026_02_10_0705 {
    public static void main(String[] args) {
        // Implemente sua solução aqui
    }
}
