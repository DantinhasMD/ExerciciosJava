package ExercExternos.Exerc05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== LOJA DE ROUPAS ===");
            System.out.println("1 - Cadastrar novo usuário");
            System.out.println("2 - Acessar conta");
            System.out.println("3 - Sair");
            System.out.print("\nSeja Bem-Vindo! Selecione a opção deseja: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (Exception e){
                sc.nextLine();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou a opção 1 - Cadastrar novo usuário");
                    System.out.print("Digite o Nome do seu usuário: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o Email do seu usuário: ");
                    String email = sc.nextLine();

                    System.out.print("Digite a Senha do seu usuário: ");
                    String senha = sc.nextLine();

                    System.out.println("\n1 - Gerente");
                    System.out.println("2 - Vendedor");
                    System.out.println("3 - Atendente");
                    System.out.print("\nSelecione o tipo de usuário desejado: ");

                    int opcaoUsuario = -1;
                    try {
                        opcaoUsuario = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e){
                        sc.nextLine();
                        opcaoUsuario = -1;
                    }

                    switch (opcaoUsuario){
                        case 1:
                            usuarios.add(new Gerente(nome, email, senha));
                            break;
                        case 2:
                            usuarios.add(new Vendedor(nome, email, senha));
                            break;
                        case 3:
                            usuarios.add(new Atendente(nome, email, senha));
                            break;
                        default:
                            System.out.println("Opção Inválida! Tente Novamente.");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n Você selecionou a opção 2 - Acessar conta");
                    System.out.print("Digite seu email: ");
                    String emailValidacao = sc.nextLine();
                    System.out.print("Digite sua senha: ");
                    String senhaValidacao = sc.nextLine();

                    boolean encontrado = false;
                    for (Usuario user : usuarios) {
                        if (user.getEmail().equals(emailValidacao) && user.getSenha().equals(senhaValidacao)) {
                            encontrado = true;
                            user.realizarLogin();
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Dados incorretos. Usuário não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção Inválida! Tente Novamente");
                    break;
            }

        } while(opcao != 3);
        System.out.println("Programa Encerrado. Até mais!");

        sc.close();
    }
}
