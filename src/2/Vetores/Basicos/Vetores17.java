/* Crie um programa que: Armazene em um vetor os valores de 5 ações
diferentes na carteira de um investidor.Use os métodos:
○ totalInvestido(double[] carteira) → retorna a soma total investida.
○ percentualPorAcao(double[] carteira) → retorna um vetor com o
percentual de cada ação na carteira. */

package Vetores.Basicos;

public class Vetores17 {
    public static void main(String[] args) {
        double[] carteira = {345.67, 233.98, 76.99, 213.77, 433.22};

        System.out.printf("Investimento Total: R$%.2f\n", totalInvestido(carteira));

        percentualPorAcao(carteira);
    }

    public static double totalInvestido(double[] carteira) {
        double totalInvestido = 0;

        for (int i = 0; i < carteira.length; i++){
            totalInvestido += carteira[i];
        }

        return totalInvestido;
    }

    public static void percentualPorAcao(double[] carteira) {
        double totalInvestido = totalInvestido(carteira);

        for (int i = 0; i < carteira.length; i++){
            double percentualAtivo = (carteira[i] / totalInvestido) * 100;
            System.out.printf("Percentual do %02d Ativo: %.2f%%\n", i+1, percentualAtivo);
        }
    }
}
