/* Crie um programa que:  Receba os preços de fechamento de uma ação
durante 10 dias. Use os métodos:
○ maiorPreco(double[] precos) → retorna o maior preço.
○ menorPreco(double[] precos) → retorna o menor preço.*/

package Vetores.Basicos;

public class Vetores14 {
    public static void main(String[] args) {
        double[] precos = {545.67, 333.98, 86.99, 213.77, 733.22, 345.67, 233.98, 76.99, 213.77, 433.22};

        maiorPreco(precos);
        menorPreco(precos);
    }

    public static void maiorPreco(double[] precos) {
        double maiorPreco = precos[0];

        for (int i = 1; i < precos.length; i++){
            if (maiorPreco < precos[i]){
                maiorPreco = precos[i];
            }
        }

        System.out.printf("Maior Preço R$%.2f\n", maiorPreco);
    }

    public static void menorPreco(double[] precos) {
        double menorPreco = precos[0];

        for (int i = 1; i < precos.length; i++){
            if (menorPreco > precos[i]){
                menorPreco = precos[i];
            }
        }

        System.out.printf("Menor Preço R$%.2f\n", menorPreco);
    }
}
