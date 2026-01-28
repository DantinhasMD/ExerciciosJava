/* Crie um programa que: Receba os preços de fechamento de uma ação
durante 10 dias. Use os métodos:
○ drawdowns(double[] precos) → retorna um vetor com os drawdowns diários.
○ maiorDrawdown(double[] precos) → retorna o maior (menor valor percentual) drawdown do período. */

package Residencia.Vetores.Basicos;

public class Vetores20 {
    public static void main(String[] args) {
        double[] precos = {23.67, 34.67, 122.89, 45.6, 77.8, 30.89, 39.98, 92.88, 67.45, 70};

        drawdowns(precos);
        maiorDrawdown(precos);
    }

    public static void drawdowns(double[] precos) {
        System.out.println("Drawdowns diários");
        for (int i = 0; i < precos.length; i++){
            System.out.println(precos[i]);
        }
    }

    public static void maiorDrawdown(double[] precos){
        double maiorValor = precos[0];
        int indiceMaior = 0;

        // Descobrir o Maior Valor
        for (int i = 1; i < precos.length; i++){
            if (precos[i] > maiorValor){
                maiorValor = precos[i];
                indiceMaior = i;
            }
        }
        double menorValor = precos[indiceMaior];

        // Descobrir o Menor Valor depois do Maior
        for (int i = indiceMaior; i < precos.length; i++){
            if (precos[i] < menorValor){
                menorValor = precos[i];
            }
        }

        double drawdown = ((menorValor - maiorValor) / maiorValor) * 100;

        System.out.printf("Drawdown: %.2f%%", drawdown);
    }
}
