package ExercExternos.Exerc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println("Carro criado com sucesso!Segue suas informações Atuais:\n");
        System.out.printf("Status: %s\n", carro.getStatus());
        System.out.printf("Velocidade: %02d\n", carro.getVelocidade());
        System.out.printf("Marcha Atual: %02d\n", carro.getMarcha());
        menu(carro);
    }

    public static void menu(Carro carro){
        Scanner sc = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ligar o carro");
            System.out.println("2 - Desligar o carro");
            System.out.println("3 - Acelerar Velocidade");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda/direita");
            System.out.println("6 - Verificar velocidade");
            System.out.println("7 - Trocar a marcha");
            System.out.println("8 - Sair");
            System.out.println("Selecione a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Opção Ligar o Carro Selecionada!");
                    carro.ligarCarro();
                    break;
                case 2:
                    System.out.println("Opção Desligar o carro Selecionada!");
                    carro.desligarCarro();
                    break;
                case 3:
                    System.out.println("Opção Acelerar Selecionada!");
                    carro.acelerarVelocidade();
                    break;
                case 4:
                    System.out.println("Opção Diminuir velocidade Selecionada!");
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    System.out.println("Opção Virar para esquerda/direita Selecionada!");
                    carro.virarCarro();
                    break;
                case 6:
                    System.out.println("Opção Verificar velocidade Selecionada!");
                    carro.verificarVelocidade();
                    break;
                case 7:
                    System.out.println("Opção Trocar a marcha Selecionada!");
                    carro.trocarMarcha();
                    break;
            }

        } while (opcao != 8);
        System.out.println("Programa Encerrado. Até mais!");
        sc.close();
    }
}
