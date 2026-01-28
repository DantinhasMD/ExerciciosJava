// Crie um método chamado converterMoeda() que recebe um valor em reais (R$) e uma taxa de conversão para dólares (USD) e retorna o valor convertido.
//Exemplo: Valor em reais: 100.0 / Taxa de conversão: 4.90 => Saída: 100.0 reais equivalem a 20.41 dólares.

package Residencia.Metodos;
import java.util.Scanner;

public class Metodos01 {
    public static void converterMoeda() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor (R$) para ser convertido (USD): ");
        double valorReais = sc.nextDouble();

        System.out.println("Digite a taxa de conversão Atual (USD): ");
        double taxaConversaoDolar = sc.nextDouble();

        double valorDolar = valorReais / taxaConversaoDolar;
        System.out.println(valorReais + " reais equivalem a " + valorDolar + " doláres.");

        sc.close();
    }

    public static void main(String[] args) {
        converterMoeda();
    }
}
