/* Dada uma matriz 3x2 com valores investidos em fundos durante 2
trimestres, crie um método que calcule o total investido em cada fundo
(soma das linhas).
double[] calcularTotalPorFundo(double[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores26 {
    public static void main(String[] args) {
        double[][] matriz = {
                {46.55, 33.89, 122.99},
                {66.55, 83.89, 22.99},
                {1, 3, 6}
        };

        double[] somasFundo = calcularTotalPorFundo(matriz);
        for (int i = 0; i < matriz.length; i++){
            System.out.printf("Fundo %d: R$%.2f\n", i + 1, somasFundo[i]);
        }
    }

    public static double[] calcularTotalPorFundo(double[][] matriz){
        double[] somasFundo = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++){
            double valorTotal = 0;
            for (int j = 0; j < matriz[i].length; j++){
                valorTotal += matriz[i][j];
            }
            somasFundo[i] = valorTotal;
        }

        return somasFundo;
    }
}
