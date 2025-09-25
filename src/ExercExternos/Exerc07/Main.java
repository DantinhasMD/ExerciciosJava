package ExercExternos.Exerc07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mensagem msg = null;
        int opcao;

        do {
            System.out.println("\n===== OPÇÃO DE MENSAGEM =====");
            System.out.println("1 - Adicionar mensagem");
            System.out.println("2 - Verificar mensagem");
            System.out.println("3 - Alterar mensagem");
            System.out.println("4 - Enviar via SMS");
            System.out.println("5 - Enviar via E-mail");
            System.out.println("6 - Enviar via WhatsApp");
            System.out.println("7 - Enviar via Redes Sociais");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite sua mensagem: ");
                    String txt = sc.nextLine();
                    msg = new Email(txt);
                    System.out.println("Mensagem adicionada!");
                    break;

                case 2:
                    if (msg != null) {
                        System.out.println("Texto: " + msg.getTexto());
                    } else {
                        System.out.println("Nenhuma mensagem cadastrada.");
                    }
                    break;

                case 3:
                    if (msg != null) {
                        System.out.print("Insira o novo texto: ");
                        String newTx = sc.nextLine();
                        msg.setTexto(newTx);
                        System.out.println("Texto alterado com sucesso!");
                    } else {
                        System.out.println("Nenhuma mensagem para alterar.");
                    }
                    break;

                case 4:
                    if (msg != null) new SMS(msg.getTexto()).enviarMensagem(sc);
                    else System.out.println("Nenhuma mensagem cadastrada.");
                    break;

                case 5:
                    if (msg != null) new Email(msg.getTexto()).enviarMensagem(sc);
                    else System.out.println("Nenhuma mensagem cadastrada.");
                    break;

                case 6:
                    if (msg != null) new WhatsApp(msg.getTexto()).enviarMensagem(sc);
                    else System.out.println("Nenhuma mensagem cadastrada.");
                    break;

                case 7:
                    if (msg != null) new RedesSociais(msg.getTexto()).enviarMensagem(sc);
                    else System.out.println("Nenhuma mensagem cadastrada.");
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