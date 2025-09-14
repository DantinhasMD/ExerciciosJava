// Uma matriz double[A][S] representa o total de receitas obtidas por A agências em S
//   segmentos (crédito, tarifas, câmbio etc.).
// Métodos a implementar:
// double[] totalPorAgencia(double[][] receitas) – retorna um vetor com o total arrecadado por cada agência.
// double[] percentualPorSegmento(double[][] receitas) – retorna o percentual que cada
//    segmento representa no total geral.

package Vetores.Bidimensionais;

public class Vetores06 {
    public static void main(String[] args) {
        double[][] receitas = {
                {1, 3, 4, 7},
                {2345.37, 13299.76, 5555.89, 8892.22},
                {2345.37, 3299.76, 15555.89, 9892.22},
                {1345.37, 3299.76, 4555.89, 9992.22}
        };

        double[] totais = totalPorAgencia(receitas);

        System.out.println("Total por Agência:");
        for (int i = 0; i < totais.length; i++) {
            System.out.printf("Agência %d: R$ %.2f%n", i + 1, totais[i]);
        }

        double[][] percentuais = percentualPorSegmento(receitas);

        System.out.println("\nPercentual por Segmento (por Agência):");
        for (int i = 0; i < percentuais.length; i++) {
            System.out.print("Agência " + (i + 1) + ": ");
            for (int j = 0; j < percentuais[i].length; j++) {
                System.out.printf("%.2f%% ", percentuais[i][j]);
            }
            System.out.println();
        }
    }

    public static double[] totalPorAgencia(double[][] receitas) {
            double[] agenciasReceitaTotal = new double[receitas.length];
            double total = 0;

            for (int i = 0; i < receitas.length; i++){
                for (int j = 0; j < receitas[i].length; j++){
                    total += receitas[i][j];
                }
                agenciasReceitaTotal[i] = total;
            }

        return agenciasReceitaTotal;
    }

    public static double[][] percentualPorSegmento(double[][] receitas) {
        double[][] percentual = new double[receitas.length][receitas[0].length];
        double[] totalPorAgencia = totalPorAgencia(receitas);

        for (int i = 0; i < receitas.length; i++) {
            for (int j = 0; j < receitas[i].length; j++) {
                percentual[i][j] = (receitas[i][j] / totalPorAgencia[i]) * 100;
            }
        }

        return percentual;
    }
}
