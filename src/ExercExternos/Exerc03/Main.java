package ExercExternos.Exerc03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaquinaDeBanho maquinaDeBanho = new MaquinaDeBanho();
        menu(maquinaDeBanho);
    }

    public static void menu(MaquinaDeBanho maquinaDeBanho){
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==========MENU==========");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer com água");
            System.out.println("3 - Abastecer com shampoo");
            System.out.println("4 - Verificar nivel de água");
            System.out.println("5 - Verificar nivel de shampoo");
            System.out.println("6 - Verificar se tem pet no banho");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("10 - Sair");
            System.out.print("Selecione a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    maquinaDeBanho.banhoPet();
                    break;
                case 2:
                    maquinaDeBanho.abastecerAgua();
                    break;
                case 3:
                    maquinaDeBanho.abastecerShampoo();
                case 4:
                    maquinaDeBanho.verificarNivelAgua();
                    break;
                case 5:
                    maquinaDeBanho.verificarNivelShampoo();
                    break;
                case 6:
                    maquinaDeBanho.verificarPetNoBanho();
                    break;
                case 7:
                    maquinaDeBanho.colocarPetMaquina();
                    break;
                case 8:
                    maquinaDeBanho.retirarPetMaquina();
                    break;
                case 9:
                    maquinaDeBanho.limparMaquina();
                    break;
            }

        } while(opcao != 10);
        System.out.println("Programa encerrado. Até Mais!");
        sc.close();
    }
}
