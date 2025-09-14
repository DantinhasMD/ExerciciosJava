/* Dada uma matriz 2x3 com preços de produtos em 2 lojas, crie um
método para encontrar o menor preço de cada produto (mínimo por
coluna).
double[] encontrarMenorPrecoPorProduto(double[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores24 {
    public static void main(String[] args) {
        double[][] matriz = {
                {46.55, 33.89, 30.89},
                {66.55, 13.89, 16.55}
        };

        double[] menoresValores = encontrarMenorPrecoPorProduto(matriz);
        for (int i = 0; i < menoresValores.length; i++){
            System.out.printf("Menor Valor do %d produto: R$%.2f\n", i + 1, menoresValores[i]);
        }

    }

    public static double[] encontrarMenorPrecoPorProduto(double[][] matriz) {
        int colunas = matriz[0].length;
        int linhas = matriz.length;
        double[] menorValor = new double[colunas];

        // Para cada coluna (produto)
        for (int j = 0; j < colunas; j++) {
            menorValor[j] = matriz[0][j];
            for (int i = 1; i < linhas; i++) {
                if (matriz[i][j] < menorValor[j]) {
                    menorValor[j] = matriz[i][j];
                }
            }
        }

        return menorValor;
    }
}
