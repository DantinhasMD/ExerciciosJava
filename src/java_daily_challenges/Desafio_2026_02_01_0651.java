package java_daily_challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
========================================
Sistema de Gerenciamento de Pedidos
Nível: iniciante
Data: 2026_02_01_0651
========================================

ENUNCIADO:
Desenvolva um sistema que gerencie pedidos de produtos de uma loja online. O sistema deve
permitir a criação de pedidos, adicionar produtos a cada pedido e calcular o total de cada
pedido.

REQUISITOS:
- O sistema deve permitir a criação de pedidos com até 10 produtos.
- O sistema deve calcular o total de cada pedido com base no preço de cada produto.
- O sistema deve lançar uma exceção se o preço de um produto for inválido.

EXEMPLOS:
Entrada: Criar pedido com 2 produtos: 1 x produto A ($10) e 1 x produto B ($20) | Saída esperada: Pedido criado com sucesso. Total: $30
Entrada: Criar pedido com 10 produtos: 5 x produto A ($10) e 5 x produto B ($20) | Saída esperada: Pedido criado com sucesso. Total: $150
Entrada: Criar pedido com produto inválido (preço negativo) | Saída esperada: Erro: preço inválido para produto A
*/
class Produto{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Erro: preço inválido para produto " + nome);
        }
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }

    public String exibirInformacoes() {
        return "Produto: " + nome + " | Preço: $" + preco;
    }
}

class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida para o produto " + produto.getNome());
        }
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public String exibirInformacoes() {
        return produto.getNome() + " | Qtd: " + quantidade + " | Subtotal: $" + calcularSubtotal();
    }
}

class Pedido{
    private static int contador = 0;
    private int idPedido;
    private String cliente;
    private List<ItemPedido> itens;

    public Pedido(String cliente){
        this.idPedido = ++contador;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        if (itens.size() >= 10) {
            throw new IllegalStateException("Pedido não pode ter mais de 10 produtos.");
        }
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("\nPedido #" + idPedido + " | Cliente: " + cliente);
        for (ItemPedido item : itens) {
            System.out.println(item.exibirInformacoes());
        }
        System.out.println("TOTAL DO PEDIDO: $" + calcularTotal());
    }
}

class Loja{
    List<Produto> produtos = new ArrayList<>();
    List<Pedido> pedidos = new ArrayList<>();

    public void adicionarProduto(String nome, double preco) {
        Produto produto = new Produto(nome, preco);
        produtos.add(produto);
    }

    public Produto buscarProdutoPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void listarProdutos() {
        System.out.println("\nProdutos disponíveis:");
        for (Produto p : produtos) {
            System.out.println(p.exibirInformacoes());
        }
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}

public class Desafio_2026_02_01_0651 {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.adicionarProduto("Camiseta", 10);
        loja.adicionarProduto("Calça", 20);
        loja.adicionarProduto("Sapato", 50);

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();

        Pedido pedido = new Pedido(cliente);

        while (true) {
            loja.listarProdutos();

            System.out.print("\nNome do produto (ou 'fim'): ");
            String nomeProduto = sc.nextLine();
            if (nomeProduto.equalsIgnoreCase("fim")) break;

            Produto produto = loja.buscarProdutoPorNome(nomeProduto);
            if (produto == null) {
                System.out.println("Produto não encontrado!\n");
                continue;
            }

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();
            sc.nextLine();

            try {
                pedido.adicionarItem(new ItemPedido(produto, qtd));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        loja.adicionarPedido(pedido);
        pedido.exibirResumo();

        sc.close();
    }
}
