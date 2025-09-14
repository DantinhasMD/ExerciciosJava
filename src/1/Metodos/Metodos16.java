// Classificação de Produtos (If Aninhado) - Crie um método `classificarProduto` que:
//- Recebe o preço do produto (double) e quantidade vendida no mês (int)
//- Usa estruturas if aninhadas para classificar o produto como:
//- "High-End" - se preço > R$500 e vendas > 20
//- "Popular" - se preço < R$100 e vendas > 50
//- "Normal" - para todos os outros casos
//- Retorna a classificação como String

package Metodos;

public class Metodos16 {
    public static void main(String[] args) {
        classificarProduto(98.9, 5);
        classificarProduto(9.9, 500);
        classificarProduto(101.99, 50);
        classificarProduto(500, 21);
        classificarProduto(980.9, 35);
    }

    public static void classificarProduto(double precoProduto, int qtdVendidaMes) {
        if (precoProduto > 500 && qtdVendidaMes > 20) {
            System.out.println("High-End");
        } else if (precoProduto < 500 && qtdVendidaMes > 50) {
            System.out.println("Popular");
        } else {
            System.out.println("Normal");
        }
    }
}
