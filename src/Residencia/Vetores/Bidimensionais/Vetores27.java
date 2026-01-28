/* Crie um método que encontre a menor taxa de juros numa matriz 2x2 e
outro que calcule a média das taxas por mês (média das colunas).
double encontrarMenorTaxa(double[][] matriz);
double[] calcularMediaPorMes(double[][] matriz); */

package Residencia.Vetores.Bidimensionais;

public class Vetores27 {
    public static void main(String[] args) {
        double[][] matriz = {
                {46.55, 122.99},
                {66.55, 22.99},
        };

        System.out.printf("Menor Taxa: %.2f%%\n", encontrarMenorTaxa(matriz));

        double[] mediasMensais = calcularMediaPorMes(matriz);
        for (int i= 0; i < matriz[0].length; i++){
            System.out.printf("Média do %d: %.2f%%\n", i + 1, mediasMensais[i]);
        }
    }

    public static double encontrarMenorTaxa(double[][] matriz) {
        double menorValor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < menorValor){
                    menorValor = matriz[i][j];
                }
            }
        }
        return menorValor;
    }

    public static double[] calcularMediaPorMes(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        double[] mediasMensais = new double[colunas];

        // para cada coluna (mês)
        for (int j = 0; j < colunas; j++) {
            double soma = 0;
            for (int i = 0; i < linhas; i++) {
                soma += matriz[i][j];
            }
            mediasMensais[j] = soma / linhas;
        }
        return mediasMensais;
    }
}
