// Crie um método chamado compararAtivos() que recebe dois retornos médios e retorna o ativo com maior retorno.
//Exemplo: Ativo 1: 5.0%, Ativo 2: 4.5% => Saída: Ativo 1

package Metodos;
import java.util.Scanner;

public class Metodos05 {
    public static void main(String[] args) {
        compararAtivos();
    }

    public static void compararAtivos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ativo 1: ");
        double ativo1 = sc.nextDouble();

        System.out.println("Ativo 2: ");
        double ativo2 = sc.nextDouble();

        if (ativo1 > ativo2) {
            System.out.println("Maior: Ativo 1");
        } else {
            System.out.println("Maior: Ativo 2");
        }
    }
}
