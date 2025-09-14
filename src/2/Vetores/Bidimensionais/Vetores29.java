/* Crie um método que calcule o saldo total acumulado numa matriz 2x3 e
outro método que calcule o saldo máximo por conta (máximo por linha).
double calcularSaldoTotal(double[][] matriz);
double[] encontrarMaximoPorConta(double[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores29 {
    public static void main(String[] args) {
        double[][] matriz = {
                {36, 122, 99},
                {66, 10022, 224}
        };

        double total = calcularSaldoTotal(matriz);
        System.out.println("Saldo total acumulado: " + total);

        double[] maximos = encontrarMaximoPorConta(matriz);
        for (int i = 0; i < maximos.length; i++) {
            System.out.println("Máximo da conta " + (i + 1) + ": " + maximos[i]);
        }
    }

    public static double calcularSaldoTotal(double[][] matriz) {
        double somaTotal = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaTotal += matriz[i][j];
            }
        }

        return somaTotal;
    }

    public static double[] encontrarMaximoPorConta(double[][] matriz) {
        double[] maiorValorMatriz = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++){
            double maiorValor = matriz[i][0];
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                }
            }
            maiorValorMatriz[i] = maiorValor;
        }
        return maiorValorMatriz;
    }
}
