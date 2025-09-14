package ExercExternos.Exerc05;

import java.util.*;

public class Vendedor extends Usuario{
    private List<Venda> minhasVendas = new ArrayList<>();

    public Vendedor(String nome, String email, String senha){
        super(nome,email,senha);
        this.administrador = false;
        this.logado = false;
    }

    @Override
    public void realizarLogin(){
        System.out.println("\nBem-vindo, " + getNome() + "!");
        mostrarMenu();
    }

    @Override
    public void mostrarMenu(){
        setLogado(true);
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===INFORMAÇÕES DE ACESSO===");
            System.out.printf("USUÁRIO: %s\n", getNome());
            System.out.printf("EMAIL: %s\n", getEmail());
            System.out.printf("SENHA DE ACESSO: %s\n", getSenha());
            System.out.printf("ADMINISTRADOR: %s\n", getAdministrador());
            System.out.println("====================\n");

            System.out.println("\n=== MENU VENDEDOR ===");
            System.out.println("1 - Alterar dados");
            System.out.println("2 - Alterar senha");
            System.out.println("3 - Consultar vendas");
            System.out.println("4 - Realizar vendas");
            System.out.println("5 - Logout");
            System.out.print("\nSelecione a opção desejada: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Alterando dados...");
                    alterarDados();
                    break;

                case 2:
                    System.out.println("Alterando senha...");
                    alterarSenha();
                    break;

                case 3:
                    System.out.println("Consultando vendas...");
                    consultarVendas();
                    break;

                case 4:
                    System.out.println("Realizar vendas...");
                    realizarVenda();
                    break;

                case 5:
                    realizarLogoff();
                    System.out.println("Logout realizado!");
                    break;
            }
        } while (opcao != 5);
        System.out.println("Conta Deslogada! Até mais");
    }

    @Override
    public void alterarDados(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDeseja alterar o email? Y/N: ");
        String opcaoEmail = sc.nextLine();

        if (opcaoEmail.equalsIgnoreCase("y")) {
            System.out.print("\nDigite o novo Email:");
            String novoEmail = sc.nextLine();
            setEmail(novoEmail);

            System.out.print("Email Alterado com Sucesso!\n");
        }

        System.out.print("\nDeseja alterar o nome? Y/N: ");
        String opcaoNome = sc.nextLine();
        if (opcaoNome.equalsIgnoreCase("y")) {
            System.out.print("\nDigite o novo Nome:");
            String novoNome = sc.nextLine();
            setNome(novoNome);

            System.out.println("Nome Alterado com Sucesso!\n");
        }
    }

    @Override
    public void alterarSenha(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite a nova senha: ");
        String novaSenha = sc.nextLine();
        setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso!");
    }


    public void realizarVenda(){
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor da venda: ");
        double valor = sc.nextDouble();

        Venda venda = new Venda(getNome(), valor);
        minhasVendas.add(venda);
        SistemaVendas.registrarVenda(venda);

        System.out.println("Registo: " + venda);
    }

    public void consultarVendas(){
        System.out.println("\n=== MINHAS VENDAS ===");
        for (Venda venda : minhasVendas) {
            System.out.println("Venda " + venda.getNumero() + " - R$ " + venda.getValor());
        }
        System.out.println();
    }

    @Override
    public void realizarLogoff(){
        setAdministrador(false);
    }
}
