/*Dada uma matriz 3x3 que representa pagamentos feitos por clientes
em meses diferentes, crie um método para calcular a média total dos
pagamentos e outro para encontrar o cliente que mais pagou (máximo por
linha).
double calcularMediaTotal(double[][] matriz);
int encontrarClienteMaiorPagamento(double[][] matriz); */

package Residencia.Vetores.Bidimensionais;

public class Vetores30 {
    public static void main(String[] args) {

    }

    public static double calcularMediaTotal(double[][] matriz) {
        double somaTotal = 0;
        int totalElementos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
                totalElementos++;
            }
        }

        return somaTotal / totalElementos;
    }

    public static int encontrarClienteMaiorPagamento(double[][] matriz) {
        double maiorValor = matriz[0][0];
        int maiorIndice = 0;

        for (int i = 0; i < matriz.length; i++) {
            double somaCliente = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaCliente += matriz[i][j];
            }
            if (somaCliente > maiorValor) {
                maiorValor = somaCliente;
                maiorIndice = i;
            }
        }
        return maiorIndice + 1;
    }
}
