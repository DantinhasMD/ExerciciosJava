// Dada uma matriz int[N][M] com as vendas e um vetor double[N] com o preço unitário de
//cada produto, calcule:
//O faturamento total da loja no período e O faturamento individual de cada produto.
//Métodos sugeridos:
//● double faturamentoTotal(int[][] vendas, double[] precos)
//● double[] faturamentoPorProduto(int[][] vendas, double[] precos)

package Vetores.Bidimensionais;

public class Vetores12 {
    public static void main(String[] args) {
        int[][] vendas = {
                {55, 78, 34, 22},
                {65, 18, 55, 42},
                {12, 38, 84, 59},
        };

        double[] precos = {12, 5, 4, 6};

        double totalLoja = faturamentoTotal(vendas, precos);
        System.out.printf("Faturamento total da loja: %.2f%n", totalLoja);

        double[] totalProdutos = faturamentoPorProduto(vendas, precos);
        for (int i = 0; i < totalProdutos.length; i++) {
            System.out.printf("Produto %d: %.2f%n", i + 1, totalProdutos[i]);
        }
    }

    public static double faturamentoTotal(int[][] vendas, double[] precos) {
        double totalLoja = 0;

        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                totalLoja += vendas[i][j] * precos[j];
            }
        }
        return totalLoja;
    }

    public static double[] faturamentoPorProduto(int[][] vendas, double[] precos) {
        double[] totalPorProduto = new double[vendas.length];

        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                totalPorProduto[i] += vendas[i][j] * precos[j];
            }
        }
        return totalPorProduto;

    }

}
