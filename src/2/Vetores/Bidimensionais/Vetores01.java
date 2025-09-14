// Um banco monitora os saldos diários de N clientes durante M dias em uma matriz double[N][M].
// Crie um programa que permita:
// double saldoFinal(double[][] saldos, int cliente) – retorna o saldo do cliente ao final do período.
// double[] saldoFinalTodos(double[][] saldos) – retorna o saldo final de todos os clientes.
// void imprimirExtratoClientes(double[][] saldos) – exibe todos os saldos por cliente em formato tabular.

package Vetores.Bidimensionais;

public class Vetores01 {
    public static void main(String[] args) {
        double[][] saldos ={
                {100, 150,200},
                {80,120,130},
                {50,60,70}
        };
        System.out.println("Saldo final do cliente 1: " + saldoFinal(saldos, 1));

        System.out.println("\nSaldo final de todos os clientes:");
        double[] saldosFinais = saldoFinalTodos(saldos);
        for (int i = 0; i < saldosFinais.length; i++) {
            System.out.println("Cliente " + (i+1) + ": " + saldosFinais[i]);
        }

        System.out.println("\nExtrato de todos os clientes:");
        imprimirExtratoClientes(saldos);
    }

    public static double saldoFinal(double[][] saldos, int cliente) {
        int ultimoDia = saldos[cliente].length - 1;
        return saldos[cliente][ultimoDia];
    }

    public static double[] saldoFinalTodos(double[][] saldos) {
        double[] finais = new double[saldos.length];
        for (int i = 0; i < saldos.length; i++){
            finais[i] = saldoFinal(saldos, i);
        }
        return finais;
    }

    public static void imprimirExtratoClientes(double[][] saldos) {
        for (int i = 0; i < saldos.length; i++){
            System.out.print("Cliente " + (i+1) + ":\n");
            for (int j = 0; j < saldos[i].length; j++){
                System.out.print(saldos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
