// Implemente calcularVolatilidade() que recebe um array de retornos diários e retorna o desvio padrão dos retornos.
//Exemplo: {0.01, 0.02, -0.01, 0.03, -0.02} => Saída: 0.018

package Metodos;
import java.util.Scanner;

public class Metodos06 {
    public static void main(String[] args) {
        calcularVolatilidade();
    }

    public static void calcularVolatilidade() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos retornos diários deseja informar?");
        int n = sc.nextInt();
        double[] retornosDiarios = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o retorno do dia " + (i + 1) + ": ");
            retornosDiarios[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < retornosDiarios.length; i++) {
            soma += retornosDiarios[i];
        }
        double media = soma / retornosDiarios.length;

        // Passo 2: Calcular soma dos quadrados das diferenças
        double somaDiferencasQuadrado = 0;
        for (int i = 0; i < retornosDiarios.length; i++) {
            double diferenca = retornosDiarios[i] - media;
            somaDiferencasQuadrado += diferenca * diferenca;
        }

        // Passo 3: Tirar a raiz quadrada da variância
        double variancia = somaDiferencasQuadrado / retornosDiarios.length;
        double desvioPadrao = Math.sqrt(variancia);

        System.out.printf("A volatilidade (desvio padrão) é: %.3f%n", desvioPadrao);
    }
}
