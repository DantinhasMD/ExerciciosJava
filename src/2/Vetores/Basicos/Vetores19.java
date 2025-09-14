/* Crie um programa que: Calcule os valores futuros de um investimento
de R$ 1.000,00 aplicados em juros compostos por 6 meses a 2% ao mês.
● Use o método calcularJurosCompostos(double valorInicial, double
taxa, int meses), que retorne um vetor com os valores futuros mês a mês. */

package Vetores.Basicos;

public class Vetores19 {
    public static void main(String[] args) {
        double valorInicial = 1000;
        int meses = 6;
        double taxa = 0.02;

        calcularJurosCompostos(valorInicial, taxa, meses);
    }

    public static void calcularJurosCompostos(double valorInicial, double taxa, int meses) {
        for (int i = 0; i < meses; i++){
            double valorMensal =  valorInicial * Math.pow((1 + taxa), i);
            System.out.printf("Valor %02d mês: R$%.2f\n", i+1, valorMensal);
        }
    }
}
