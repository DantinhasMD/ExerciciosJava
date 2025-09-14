/* Crie um programa que: Receba os valores de ações de um ativo em 5 dias.
 Use o método calcularCrescimentoAcumulado(double[] precos), que retorne o
  crescimento percentual acumulado em 5 dias. */

package Vetores.Basicos;

public class  Vetores12 {
    public static void main(String[] args) {
        double[] precos = {345.67, 233.98, 76.99, 213.77, 433.22};

        calcularCrescimentoAcumulado(precos);
    }

    public static void calcularCrescimentoAcumulado(double[] precos) {

        for (int i = 0; i < precos.length - 1; i++){
            double valorCrescimentoPercentual = (precos[i+ 1] / precos[i] - 1) * 100;
            System.out.printf("Crecimento Percentual do dia %d e dia %d: %.2f\n", i + 1, i+ 2, valorCrescimentoPercentual);
        }
    }
}
