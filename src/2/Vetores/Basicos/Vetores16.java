/*Crie um programa que: Receba os preços diários de uma ação durante 10 dias.
Use os métodos:
○ contarDiasAlta(double[] precos) → retorna a quantidade de dias de
alta.
○ contarDiasQueda(double[] precos) → retorna a quantidade de dias de
queda. */

package Vetores.Basicos;

public class Vetores16 {
    public static void main(String[] args) {
        double[] precos = {345.67, 233.98, 76.99, 213.77, 433.22, 345.67, 233.98, 76.99, 213.77, 433.22};

        contarDiasAlta(precos);
        contarDiasQueda(precos);
    }

    public static void contarDiasAlta(double[] precos) {
        int qtdDiasAlta = 0;

        for (int i = 0; i < precos.length - 1; i++){
            if (precos[i] < precos[i + 1]){
                qtdDiasAlta++;
            }
        }

        System.out.printf("Quantidade de Dias em alta %02d\n", qtdDiasAlta);
    }

    public static void contarDiasQueda(double[] precos) {
        int qtdDiasQueda = 0;

        for (int i = 0; i < precos.length - 1; i++){
            if (precos[i] > precos[i + 1]){
                qtdDiasQueda++;
            }
        }

        System.out.printf("Quantidade de Dias em queda %02d\n", qtdDiasQueda);

    }
}
