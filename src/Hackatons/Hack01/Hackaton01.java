package Hackatons.Hack01;// Maria Dantas, João Pavaneli e Vitória Mattos
import java.util.Scanner;

public class Hackaton01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.00; // Saldo inicial fixo
        int opcao;

        do {
            System.out.println("\n============================");
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            System.out.println("Bem-vindo ao Caixa Cidadão");
            System.out.println("1. Sacar");
            System.out.println("2. Simular pagamento de dívida");
            System.out.println("3. Planejar meta de economia");
            System.out.println("4. Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do saque: ");
                    double saque= sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo=saldo-saque;
                        System.out.println("Seu saldo atual é "+ saldo);
                    }
                    break;

                case 2:
                    System.out.println("Informe o Valor Total da sua Dívida: ");
                    double valorDivida = sc.nextDouble();
                    int mesesDivida = 0;
                    double acumulado = 0;

                    while (acumulado < valorDivida) {
                        mesesDivida ++;
                        System.out.println("\nInforme o Valor pago esse mês: ");
                        double valorPagoDivida =  sc.nextDouble();
                        acumulado = acumulado + valorPagoDivida;
                        double restanteDivida = valorDivida - acumulado;

                        if (acumulado >= valorDivida) {
                            System.out.println("\nA sua Dívida de R$" + valorDivida + " foi paga em " + mesesDivida + " mes(es)");
                            break;
                        } else {
                            System.out.println("\nNo mês " + mesesDivida + " você quitou R$" + valorPagoDivida + " de sua dívida inicial.");
                            if (restanteDivida > 0) {
                                System.out.println("\nPara quitar totalmente a Dívida falta R$" + restanteDivida);
                            } else {
                                System.out.println("\nSua dívida já foi paga!");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor da meta de economia: ");
                    double meta = sc.nextDouble();
                    System.out.print("Digite o valor que consegue economizar por mês: ");
                    double economia = sc.nextDouble();

                    int meses = 0;
                    for ( double valorGuardado = 0; valorGuardado< meta; meses++) {
                        valorGuardado = valorGuardado + economia;
                    }
                    System.out.println("O meta será atingida em " + meses + " meses");
                    break;

                case 4:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
