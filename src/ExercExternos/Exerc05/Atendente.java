package ExercExternos.Exerc05;

import java.util.*;

public class Atendente extends Usuario{
    private double valorEmCaixa = 0;

    public Atendente(String nome, String email, String senha){
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

            System.out.println("\n=== MENU ATENDENTE ===");
            System.out.println("1 - Alterar dados");
            System.out.println("2 - Alterar senha");
            System.out.println("3 - Receber Pagamentos");
            System.out.println("4 - Fechar Caixa");
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
                    System.out.println("Receber pagamentos...");
                    receberPagamentos(SistemaVendas.getTodasAsVendas());
                    break;

                case 4:
                    System.out.println("Fechar caixa...");
                    fecharCaixa();
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

    public void receberPagamentos(List<Venda> vendas){
        for (Venda v : vendas) {
            if (!v.isPago()) {
                v.receberPagamento();
                valorEmCaixa += v.getValor();
                v.setPago(true);
            }
        }

        if (valorEmCaixa > 0) {
            System.out.println("Pagamentos recebidos no total de: R$ " + valorEmCaixa);
        } else {
            System.out.println("Nenhum pagamento pendente encontrado.");
        }
    }

    public void fecharCaixa(){
        boolean temPendentesPagamento = false;
        for (Venda v : SistemaVendas.getTodasAsVendas()){
            if (!v.isPago()){
                temPendentesPagamento = true;
                break;
            }
        }
        if (temPendentesPagamento){
            System.out.println("Não é possível fechar o caixa com vendas pendentes!");
            return; // sai sem fechar
        }

        SistemaVendas.registrarCaixaDoDia(valorEmCaixa);
        System.out.println("Caixa fechado do dia: R$ " + valorEmCaixa);
        valorEmCaixa = 0;
    }

    @Override
    public void realizarLogoff(){
        setAdministrador(false);
    }
}
