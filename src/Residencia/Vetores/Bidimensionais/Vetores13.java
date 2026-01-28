// Em uma matriz int[N][M] de vendas diárias, identifique, para cada dia, qual foi o produto
//mais vendido.
//Método sugerido:
//● int[] produtoMaiorVendaPorDia(int[][] vendas) → retorna um vetor em
//  que cada posição indica o produto mais vendido naquele dia.

package Residencia.Vetores.Bidimensionais;

public class Vetores13 {
    public static void main(String[] args) {
        int[][] vendas = {
                {45, 67, 12, 34},
                {75, 13, 68, 47},
                {14, 77, 52, 25},
                {55, 88, 92, 44}
        };

        int[] matrizProdutoMaisVendido = produtoMaiorVendaPorDia(vendas);
        for (int i = 0; i < matrizProdutoMaisVendido.length; i++){
            System.out.printf("Loja %02d: %d\n", i + 1, matrizProdutoMaisVendido[i]);
        }
    }

    public static int[] produtoMaiorVendaPorDia(int[][] vendas) {
        int[] produtoMaisVendido = new int[vendas.length];
        int maiorValor = 0;

        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                if (maiorValor < vendas[i][j]){
                    maiorValor = vendas[i][j];
                    produtoMaisVendido[i] = j + 1;
                }
            }
        }
        return produtoMaisVendido;
    }
}
