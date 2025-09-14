/* Crie um programa que: Receba um vetor com os preços diários de uma ação durante 5 dias.
 Use o método variacaoDiaria(double[] precos), que retorne um vetor com as
variações percentuais diárias.
*/

package Vetores.Basicos;

public class Vetores15 {
    public static void main(String[] args) {
        double[] precos = {345.67, 233.98, 76.99, 213.77, 433.22};

        double[] variacoes = variacaoDiaria(precos);
        for (int i = 0; i < variacoes.length; i++){
            System.out.printf("Valor da variação do dia %02d e dia %02d: %.2f%%\n", i + 1, i + 2, variacoes[i]);
        }
    }

    public static double[] variacaoDiaria(double[] precos) {
        double[] variacoes = new double[precos.length - 1];

        for (int i = 0; i < variacoes.length; i++){
            double valorVariacao = (precos[i+1] / precos[i] - 1) * 100;
            variacoes[i] = valorVariacao;
        }

        return variacoes;
    }
}
