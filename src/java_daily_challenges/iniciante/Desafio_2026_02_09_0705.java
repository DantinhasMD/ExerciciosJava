package java_daily_challenges.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
========================================
Sistema de Gerenciamento de Estoque
Nível: iniciante
Data: 2026_02_09_0705
========================================

ENUNCIADO:
Um sistema de gerenciamento de estoque precisa manter a quantidade de produtos em estoque e
atualizar a quantidade quando um produto é comprado ou vendido. O sistema deve verificar se
há produtos suficientes em estoque antes de realizar a venda.

CONCEITOS:
- excecoes
- mapas

REQUISITOS:
- O sistema deve verificar se há produtos suficientes em estoque antes de realizar a venda.
- O sistema deve atualizar a quantidade de produtos em estoque após cada operação de compra ou venda.
- O sistema deve lançar uma exceção se não houver produtos suficientes em estoque para realizar a venda.

EXEMPLOS:
Entrada: comprar 10 unidades de produto A | Saída esperada: Quantidade de produto A em estoque: 100
Entrada: vender 20 unidades de produto A | Saída esperada: Erro: Não há produtos suficientes em estoque para realizar a venda.
Entrada: comprar 10 unidades de produto B | Saída esperada: Quantidade de produto B em estoque: 50
*/

class Produu {
    private String nome;
    private int qtd;

    public Produu (String nome, int qtd) {
        this.nome = nome;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}

class Estoqque {
    Map<String, Produu> produtos = new HashMap<>();

    public void adicionarProduto(String nome, int qtd){
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (qtd < 0) {
            throw new IllegalArgumentException("\nCampo quantidade inválido!");
        }

        boolean existe = false;
        for (Produu p: produtos.values()){
            if (p.getNome().equalsIgnoreCase(nome)){
                System.out.println("\nProduto já cadastrado no sistema!");
                existe = true;
            }
        }

        if (!existe){
            produtos.put(nome, new Produu(nome, qtd));
            System.out.println("\nProduto adicionado!");
        }
    }

    public void realizarCompra(String nome, int qtd) {
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (qtd < 0) {
            throw new IllegalArgumentException("\nCampo quantidade inválido!");
        }

        boolean existe = false;
        for (Produu p: produtos.values()){
            if (p.getNome().equalsIgnoreCase(nome)){
                p.setQtd(p.getQtd() + qtd);
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("\nProduto não encontrado!");
        }
    }

    public void realizarVenda(String nome, int qtd){
        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (qtd < 0) {
            throw new IllegalArgumentException("\nCampo quantidade inválido!");
        }

        boolean existe = false;
        for(Produu p: produtos.values()){
            if (p.getNome().equalsIgnoreCase(nome)){
                if (p.getQtd() < qtd) {
                    throw new IllegalArgumentException("\nQuantidade de venda indisponível");
                }
                p.setQtd(p.getQtd() - qtd);
                existe = true;
            }
        }

        if (!existe) {
            System.out.println("\nProduto não encontrado!");
        }
    }

    public void visualizarEstoque(){
        boolean tem = false;
        for(Produu p: produtos.values()){
            System.out.printf("Nome: %s | Quantidade: %s", p.getNome(), p.getQtd());
            tem = true;
        }

        if(!tem){
            System.out.println("Não há produtos no estoque!");
        }


    }

}

public class Desafio_2026_02_09_0705 {
    public static void main(String[] args) {
        Estoqque estoque = new Estoqque();

        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\nSistema de Gerenciamento de Estoque");
            System.out.println("1 - Adicionar novo Produto");
            System.out.println("2 - Registrar Compra de Produto");
            System.out.println("3 - Registrar Venda de Produto");
            System.out.println("4 - Visualizar Estoque");
            System.out.println("5 - Encerrar");
            System.out.print("Selecione a opção desejada: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("Insira o nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Insira o quantidade inicial do produto: ");
                    int qtd = sc.nextInt();

                    try {
                        estoque.adicionarProduto(nome, qtd);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Insira o nome do produto: ");
                    String prod = sc.nextLine();

                    System.out.print("Insira o quantidade que deseja adicionar: ");
                    int adicionar = sc.nextInt();

                    try {
                        estoque.realizarCompra(prod, adicionar);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Insira o nome do produto: ");
                    String produ = sc.nextLine();

                    System.out.print("Insira o quantidade que deseja remover: ");
                    int remover = sc.nextInt();

                    try {
                        estoque.realizarVenda(produ, remover);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    estoque.visualizarEstoque();
                    break;

                case 5:
                    System.out.println("Encerrando Programa. Até Mais");
                    break;

                default:
                    System.out.println("Opção Inválida. Tente Novamente");
                    break;
            }
        } while (opc != 5);
        sc.close();
    }
}
