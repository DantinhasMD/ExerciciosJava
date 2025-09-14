package ExercExternos.Exerc04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== COMPRA DE INGRESSO ===");
        System.out.print("Digite o nome do filme: ");
        String nome = sc.nextLine();

        System.out.print("O filme é legendado? (s/n): ");
        boolean legendado = sc.nextLine().equalsIgnoreCase("s");

        System.out.print("Digite o valor base do ingresso: ");
        double valor = sc.nextDouble();

        System.out.println("\nEscolha o tipo de ingresso:");
        System.out.println("1 - Comum");
        System.out.println("2 - Meia Entrada");
        System.out.println("3 - Ingresso Família");
        int opcao = sc.nextInt();

        Ingresso ingresso;

        switch (opcao) {
            case 1:
                ingresso = new Ingresso(valor, nome, legendado);
                break;
            case 2:
                ingresso = new Meia(valor, nome, legendado);
                break;
            case 3:
                System.out.print("Digite a quantidade de pessoas: ");
                int qtd = sc.nextInt();
                ingresso = new Familia(valor, nome, legendado, qtd);
                break;
            default:
                System.out.println("Opção inválida! Criando ingresso comum...");
                ingresso = new Ingresso(valor, nome, legendado);
        }

        System.out.println();
        ingresso.exibirInformacoes();

        sc.close();
    }
}
