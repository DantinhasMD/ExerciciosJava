package ExercExternos.Exerc06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RelogioBrasileiro br = new RelogioBrasileiro(14, 30, 45);
        RelogioAmericano us = new RelogioAmericano(2, 30, 45, true);

        int opcao;
        do {
            System.out.println("\n===== MENU RELÓGIOS =====");
            System.out.println("1 - Ver Relógio Brasileiro");
            System.out.println("2 - Ver Relógio Americano");
            System.out.println("3 - Ajustar Relógio Brasileiro pelo Americano");
            System.out.println("4 - Ajustar Relógio Americano pelo Brasileiro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Relógio Brasileiro: " + br.getHoraFormatada());
                    break;
                case 2:
                    System.out.println("Relógio Americano: " + us.getHoraFormatada());
                    break;
                case 3:
                    br.ajustarHorario(us);
                    System.out.println("Relógio Brasileiro ajustado pelo Americano!");
                    break;
                case 4:
                    us.ajustarHorario(br);
                    System.out.println("Relógio Americano ajustado pelo Brasileiro!");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
