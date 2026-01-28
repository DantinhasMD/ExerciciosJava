/* Crie um programa que: Receba os preços de um ativo nos últimos 7 dias.
 Use o método mediaMovel(double[] precos, int dias), que calcule a média
móvel simples dos últimos n dias. */

package Residencia.Vetores.Basicos;


public class Vetores13 {
    public static void main(String[] args) {
        double[] precos = {345.67, 233.98, 76.99, 213.77, 433.22, 655, 198.89};
        int dias = 4;

        double[] medias = mediaMovel(precos, dias);

        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Média %d (dias %d-%d): %.2f\n",
                    i + 1, i + 1, i + dias, medias[i]);
        }
    }

    public static double[] mediaMovel(double[] precos, int dias) {
        int qtdMedias = precos.length - dias + 1;
        double[] medias = new double[qtdMedias];

        for (int i = 0; i < qtdMedias; i++) {
            double soma = 0.0;
            for (int j = 0; j < dias; j++) {
                soma += precos[i + j];
            }
            medias[i] = soma / dias;
        }

        return medias;
    }
}
