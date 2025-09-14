/* Crie um método que calcule o total de saldos de uma matriz 3x2
(clientes x meses) e outro método que calcule o saldo médio por cliente
(média das linhas).
double calcularSaldoTotal(double[][] matriz);
double[] calcularMediaPorCliente(double[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores23 {
    public static void main(String[] args) {
        double[][] matriz = {
                {46.55, 33.89},
                {66.55, 83.89},
                {16.55, 30.89}
        };

        System.out.printf("Soma Total R$%.2f\n", calcularSaldoTotal(matriz));

        double[] mediasCliente = calcularMediaPorCliente(matriz);
        for (int i = 0; i < matriz.length; i++){
            System.out.printf("Cliente %d: R$%.2f\n", i + 1, mediasCliente[i]);
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

    public static double[] calcularMediaPorCliente(double[][] matriz) {
        double[] mediasClientes = new double[matriz.length];
        double valorTotal = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                valorTotal = matriz[i][j];
            }
            double medias = valorTotal/ matriz.length;
            mediasClientes[i] = medias;
        }

        return mediasClientes;
    }
}
