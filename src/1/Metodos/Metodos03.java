// Crie um método chamado calcularCrescimento() que recebe o preço de uma ação em dois dias e calcula a variação percentual.
//Exemplo: Dia 1: 100.0, Dia 2: 105.0 => Saída: Crescimento: 5.0%

package Metodos;
import java.util.Scanner;

public class Metodos03 {
    public static void main(String[] args) {
        calcularCrescimento();
    }

    public static void calcularCrescimento() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dia 1: R$ ");
        double dia1 = sc.nextDouble();

        System.out.print("Dia 2: R$ ");
        double dia2 = sc.nextDouble();

        double crescimento = ((dia2 - dia1)/ dia1) * 100;

        System.out.printf("Crescimento: %.2f%%", crescimento);
        // %% precisa ser duplicado para ser impresso normalmente
        sc.close();
    }
}
