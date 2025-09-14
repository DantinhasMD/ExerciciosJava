package ExercExternos.Exerc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o depósito inicial: ");
        double depositoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        menu(conta);
        sc.close();
    }

    public static void menu(ContaBancaria conta){
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar um boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("7 - Sair");
            System.out.print("Selecione a opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção Consultar Saldo selecionada!\n");
                    conta.consultarSaldo();
                    break;

                case 2:
                    System.out.println("Opção Consultar cheque especial selecionada!\n");
                    conta.consultarChequeEspecial();
                    break;

                case 3:
                    System.out.println("Opção Depositar selecionada!\n");
                    conta.depositar();
                    break;

                case 4:
                    System.out.println("Opção Sacar selecionada!\n");
                    conta.sacar();
                    break;

                case 5:
                    System.out.println("Opção Pagar selecionada!\n");
                    conta.pagarBoleto();
                    break;

                case 6:
                    System.out.println("Opção Verificar se a conta está usando cheque especial selecionada!\n");
                    conta.verificarChequeEspecial();
                    break;
            }

        } while (opcao != 7);
        System.out.println("Programa Encerrado!");
        sc.close();
    }
}
