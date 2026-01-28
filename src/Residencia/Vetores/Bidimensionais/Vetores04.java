// Uma matriz double[N][D] armazena o valor de transações feitas por N clientes durante D dias.
// Transações acima de R$10.000 devem ser sinalizadas.
// Métodos a implementar:
// boolean[][] transacoesSuspeitas(double[][] transacoes, double limite) – retorna uma matriz booleana
//    com as transações suspeitas.
// void exibirTransacoesSuspeitas(double[][] transacoes, boolean[][] flags) – exibe cliente,
//    dia e valor de cada transação acima do limite.

package Residencia.Vetores.Bidimensionais;

public class Vetores04 {
    public static void main(String[] args) {
        double[][] transacoes = {
                {3400.56, 7800.9, 2300.4, 11220.35},
                {6400.56, 17890.9, 2613.4, 1202.35},
                {4234.56, 18999.9, 11111.4, 23450.35}
        };
        double limite = 10000;

        exibirTransacoesSuspeitas(transacoes, transacoesSuspeitas(transacoes,limite));
    }

    public static boolean[][] transacoesSuspeitas(double[][] transacoes, double limite) {
        boolean[][] flags = new boolean[transacoes.length][transacoes[0].length];

        for (int i = 0; i < transacoes.length; i++){
            for (int j = 0; j < transacoes[i].length; j++){
                flags[i][j] = transacoes[i][j] > limite;
            }
        }

        return flags;
    }


    public static void exibirTransacoesSuspeitas(double[][] transacoes, boolean[][] flags) {
        for (int i = 0; i < flags.length; i++) {
            for (int j = 0; j < flags[i].length; j++) {
                if (flags[i][j]) {
                    System.out.printf("Cliente %d, Dia %d: R$ %.2f%n", i+1, j, transacoes[i][j]);
                }
            }
        }
    }
}
