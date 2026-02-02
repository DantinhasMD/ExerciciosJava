package java_daily_challenges;

/*
========================================
Gerenciamento de Estoque de Produtos
Nível: iniciante
Data: 2026_02_02_0704
========================================

ENUNCIADO:
Um loja online está procurando por uma solução para gerenciar seu estoque de produtos. O sistema deve permitir a
inclusão de novos produtos, a atualização de estoque e a consulta de produtos por categoria. Além disso, o sistema
deve verificar se o estoque de um produto é suficiente para realizar uma venda. Se o estoque for insuficiente,
o sistema deve lançar uma exceção.

REQUISITOS:
- O sistema deve permitir a inclusão de novos produtos
- O sistema deve permitir a atualização de estoque de produtos
- O sistema deve permitir a consulta de produtos por categoria
- O sistema deve verificar se o estoque de um produto é suficiente para realizar uma venda
- Se o estoque for insuficiente, o sistema deve lançar uma exceção

EXEMPLOS:
Entrada: incluir produto 'Camiseta' com estoque 10 | Saída esperada: Produto 'Camiseta' incluído com sucesso
Entrada: atualizar estoque de 'Camiseta' para 5 | Saída esperada: Estoque de 'Camiseta' atualizado com sucesso
Entrada: consultar produtos por categoria 'Roupas' | Saída esperada: ['Camiseta', 'Calça']
Entrada: vender 15 unidades de 'Camiseta' | Saída esperada: Erro: Estoque insuficiente para realizar a venda
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Prod{
    private String nome;
    private String categoria;
    private int qtd;

    public Prod(String nome, String categoria, int qtd){
        this.nome = nome;
        this.categoria = categoria;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String exibirInformacoes(){
        return "Produto: " + getNome() + "| Categoria: " + getCategoria() + "| Quantidade: "+ getQtd();
    }
}

class EstoqueInsuficienteException extends RuntimeException {
    public EstoqueInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

class Estoque{
    List<Prod> produtos = new ArrayList<>();

    public boolean adicionarProduto(String nome, String categoria, int qtd){
        if (produtoExiste(nome)) {
            System.out.println("Produto já existe no estoque.");
            return false;
        }

        produtos.add(new Prod(nome,categoria, qtd));
        System.out.println("Produto " + nome + " incluído com sucesso!");
        return true;
    }

    public boolean produtoExiste(String nome){
        for (Prod p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void visualizarProdutos(){
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        for (Prod p: produtos){
            System.out.println(p.exibirInformacoes());
        }
    }

    public void visualizarPorCategoria(String categoria){
        if (produtos.isEmpty()){
            System.out.println("Estoque Vazio");
            return;
        }

        for (Prod p: produtos){
            if (p.getCategoria().equalsIgnoreCase(categoria)){
                System.out.println(p.exibirInformacoes());
            }
        }
    }

    public void adicionar(String nome, int valorAdicionado){
        for (Prod p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)){
                p.setQtd(p.getQtd() + valorAdicionado);
                System.out.println(p.exibirInformacoes());
            }
        }
    }

    public void remover(String nome, int valorRemover){
        for (Prod p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)){
                if (p.getQtd() < valorRemover){
                    throw new EstoqueInsuficienteException(
                            "Estoque insuficiente para realizar a venda"
                    );
                }
                p.setQtd(p.getQtd() - valorRemover);
                System.out.println(p.exibirInformacoes());
                return;
            }
        }
    }

}

class Loja{
    Estoque estoque = new Estoque();

    public boolean novoProduto(String nome, String categoria, int qtd){
        if (nome.isEmpty() || categoria.isEmpty() || qtd < 0) {
            System.out.println("Valores Inválidos para adicionar produto");
            return false;
        }
        return estoque.adicionarProduto(nome, categoria, qtd);
    }

    public void visualizarEstoque(){
        estoque.visualizarProdutos();
    }

    public void filtrarPorCategoria(String categoria){
        if (categoria.isEmpty()){
            System.out.println("Categoria Inválida");
            return;
        }

        estoque.visualizarPorCategoria(categoria);
    }

    public void adicionarEstoque(String nome, int valorAdicionado){
        if (nome.isEmpty() || valorAdicionado <= 0){
            System.out.println("Dados Inválidos");
        } else if (estoque.produtoExiste(nome)){
            estoque.adicionar(nome, valorAdicionado);
        }
    }

    public void removerEstoque(String nome, int valorRemover){
        if (nome.isEmpty() || valorRemover <= 0){
            System.out.println("Dados Inválidos");
        } else if (estoque.produtoExiste(nome)){
            estoque.remover(nome, valorRemover);
        }
    }


}

public class Desafio_2026_02_02_0704 {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n==== GERENCIAMENTO DE ESTOQUE ====");
            System.out.println("1 - Adicionar novo Produto");
            System.out.println("2 - Visualizar Produtos do Estoque");
            System.out.println("3 - Consultar Produtos por Categoria");
            System.out.println("4 - Adicionar ao Estoque");
            System.out.println("5 - Retirar do Estoque");
            System.out.println("6 - Encerrar Programa");
            System.out.print("Selecione uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("\nInsira o nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Insira a Categoria do Produto: ");
                    String categoria = sc.nextLine();

                    System.out.print("Insira a quantidade inicial: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    loja.novoProduto(nome, categoria, quantidade);
                    break;

                case 2:
                    loja.visualizarEstoque();
                    break;

                case 3:
                    System.out.print("Insira a Categoria do Produto: ");
                    String pesquisar = sc.nextLine();

                    loja.filtrarPorCategoria(pesquisar);
                    break;

                case 4:
                    System.out.print("\nInsira o nome do Produto: ");
                    String adicionar = sc.nextLine();

                    System.out.print("\nInsira a qtd que deseja adiconar: ");
                    int valorAdicionar = sc.nextInt();
                    sc.nextLine();

                    loja.adicionarEstoque(adicionar, valorAdicionar);
                    break;

                case 5:
                    System.out.print("\nInsira o nome do Produto: ");
                    String remover = sc.nextLine();

                    System.out.print("\nInsira a qtd que deseja remover: ");
                    int valorRemover = sc.nextInt();
                    sc.nextLine();

                    loja.removerEstoque(remover, valorRemover);
                    break;

                case 6:
                    System.out.println("Programa encerrado. Até mais");
                    break;

                default:
                    System.out.println("Opção Inválida. Tente Novamente");
                    break;
            }
        } while (opcao != 6);
        sc.close();
    }
}
