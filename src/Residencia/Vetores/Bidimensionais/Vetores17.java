// Uma matriz int[N][D] armazena as vendas diárias de cada produto. Liste os produtos
// cujo total vendido no período seja inferior a um limite definido.
//Método sugerido:
//● int[] produtosBaixaVenda(int[][] vendas, int limite)

package Residencia.Vetores.Bidimensionais;

public class Vetores17 {
    public static void main(String[] args) {
        int[][] vendas = {
                {23, 15, 45, 9},
                {33, 35, 15, 8},
                {43, 25, 25, 12},
                {3, 4, 1, 17},
        };

        int[] produtosInferiores = produtosBaixaVenda(vendas, 60);
        System.out.print("Produtos com total inferior ao limite: ");
        for (int produto : produtosInferiores) {
            System.out.print(produto + " ");
        }
    }

    public static int[] produtosBaixaVenda(int[][] vendas, int limite) {
        // Primeiro, contar quantos produtos estão abaixo do limite
        int contador = 0;
        for (int i = 0; i < vendas.length; i++) {
            int totalProduto = 0;
            for (int j = 0; j < vendas[i].length; j++) {
                totalProduto += vendas[i][j];
            }
            if (totalProduto < limite) {
                contador++;
            }
        }

        // Criar vetor só com os índices dos produtos abaixo do limite
        int[] produtosBaixoLimite = new int[contador];
        int idx = 0;
        for (int i = 0; i < vendas.length; i++) {
            int totalProduto = 0;
            for (int j = 0; j < vendas[i].length; j++) {
                totalProduto += vendas[i][j];
            }
            if (totalProduto < limite) {
                produtosBaixoLimite[idx++] = i;
            }
        }

        return produtosBaixoLimite;
    }
}
