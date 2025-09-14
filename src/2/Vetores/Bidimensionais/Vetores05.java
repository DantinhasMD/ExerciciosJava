// Uma matriz double[C][M] armazena os saldos mensais de C clientes, considerando juros compostos.
// Métodos a implementar:
// double calcularJurosMensal(double saldoAnterior, double saldoAtual) – retorna a taxa de juros mensal implícita.
// double[] jurosMediosClientes(double[][] saldos) – retorna a média de juros mensais de cada cliente.

package Vetores.Bidimensionais;
import java.util.Arrays;

public class Vetores05 {
    public static void main(String[] args) {
        double[][] saldos = {
                {2300.45, 4355, 8798.99},
                {230.45, 435, 878.99},
                {23.45, 1000, 1100}
        };

        System.out.printf("Taxa de Juros de %.2f%%\n", calcularJurosMensal(1000, 1100));
        System.out.printf("Taxa de Juros de %.2f%%\n", calcularJurosMensal(saldos[1][1], saldos[1][2]));

        System.out.println(Arrays.deepToString(jurosMediosClientes(saldos)));
    }

    public static double calcularJurosMensal(double saldoAnterior, double saldoAtual) {
        return ((saldoAtual / saldoAnterior) - 1) * 100;
    }

    public static double[][] jurosMediosClientes(double[][] saldos) {
        double[][] mediasJurosClientes = new double[saldos.length][saldos[0].length - 1];

        for (int i = 0; i < saldos.length; i++){
            for(int j = 0; j < saldos[i].length - 1; j++){
                double valorMedia = (((saldos[i][j + 1] / saldos[i][j])) - 1) * 100;
                mediasJurosClientes[i][j] = valorMedia;
            }

        }

        return mediasJurosClientes ;
    }
}
