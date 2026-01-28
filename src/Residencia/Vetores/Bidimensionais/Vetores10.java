// Uma matriz double[N][M] armazena movimentações diárias de N contas bancárias
//   (valores positivos são depósitos, negativos são saques).
// Métodos a implementar:
// double totalSaques(double[][] mov) – retorna o total sacado em todas as contas.
// double totalDepositos(double[][] mov) – retorna o total depositado.
// double[] saldoFinalContas(double[][] mov) – retorna o saldo final de cada conta.

package Residencia.Vetores.Bidimensionais;

public class Vetores10 {
    public static void main(String[] args) {
        double[][] mov = {
                {1500, -233.98, -560},
                {3000, -1567.98, -340, -459.98},
                {6000, -2567.98, -390.65, -959.98, -451.22}
        };

        System.out.printf("R$ %.2f\n", totalSaques(mov));
        System.out.printf("R$ %.2f\n", totalDepositos(mov));

        double[] saldos = saldoFinalContas(mov);
        for (int i = 0; i < saldos.length; i++){
            System.out.printf("Cliente %d: R$%.2f\n", i+1, saldos[i]);
        }

    }

    public static double totalSaques(double[][] mov) {
        double totalDeSaques = 0;

        for (int i = 0; i < mov.length; i++){
            for (int j = 0; j < mov[i].length; j++) {
                if (mov[i][j] > 0){
                    totalDeSaques += mov[i][j];
                }
            }
        }

        return totalDeSaques;
    }

    public static double totalDepositos(double[][] mov) {
        double totalDeDepositos = 0;

        for (int i = 0; i < mov.length; i++){
            for (int j = 0; j < mov[i].length; j++) {
                if (mov[i][j] < 0){
                    totalDeDepositos += mov[i][j];
                }
            }
        }

        return totalDeDepositos;
    }

    public static double[] saldoFinalContas(double[][] mov) {
        double[] saldoFinal = new double[mov.length];
        double somarValores = 0;

        for (int i = 0; i < mov.length; i++){
           for (int j = 0; j < mov[i].length; j++){
               somarValores += mov[i][j];
           }
           saldoFinal[i] = somarValores;
        }

        return saldoFinal;
    }
}
