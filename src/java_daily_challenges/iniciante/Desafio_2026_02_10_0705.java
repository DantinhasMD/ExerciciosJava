package java_daily_challenges.iniciante;

import java.util.*;

/*
========================================
Gerenciamento de estoque de produtos
Nível: iniciante
Data: 2026_02_10_0705
========================================

ENUNCIADO:
Um sistema de gerenciamento de estoque de produtos deve permitir que os usuários adicionem e removam
produtos do estoque, e também devem verificar se há produtos suficientes para atender
a uma ordem de compra.

CONCEITOS:
- exceções
- mapas

REQUISITOS:
- O estoque não pode conter produtos com quantidades negativas
- O sistema deve verificar se há produtos suficientes para atender a uma ordem de compra
- O sistema deve permitir que os usuários adicionem e removam produtos do estoque

EXEMPLOS:
Entrada: adicionarproduto {'produto': 'Camisa', 'quantidade': 10} | Saída esperada: {"produto":"Camisa","quantidade":10}
Entrada: adicionarproduto {'produto': 'Camisa', 'quantidade': -5} | Saída esperada: {"erro":"Quantidade inválida"}
Entrada: removerproduto {'produto': 'Camisa', 'quantidade': 5} | Saída esperada: {"produto":"Camisa","quantidade":5}
Entrada: removerproduto {'produto': 'Camisa', 'quantidade': 15} | Saída esperada: {"erro":"Quantidade insuficiente"}
Entrada: verificarestoque {'produto': 'Camisa'} | Saída esperada: {"produto":"Camisa","quantidade":10}
Entrada: verificarestoque {'produto': 'Camisa'} | Saída esperada: {"produto":"Camisa","quantidade":0}
*/
class Prodt {
    private String nome;
    private int qtd;

    public Prodt (String nome, int qtd) {
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

class Estoq {
    Map<String, Prodt> produtos = new HashMap<>();

    public void adicionarProduto(String nome, int qtd){
        if(nome.isEmpty()){
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (qtd < 0){
            throw new IllegalArgumentException("\nCampo quantidade inválido!");
        }

        boolean existe = false;
        for (Prodt p: produtos.values()){
            if (p.getNome().equalsIgnoreCase(nome)){
                System.out.println("\nProduto já cadastrado!");
                existe = true;
            }
        }

        if(!existe){
            produtos.put(nome, new Prodt(nome, qtd));
        }

    }

    public void removerProduto(String nome, int qtdRemover) {
        if(nome.isEmpty()){
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        boolean encontrado = false;
        for(Prodt p: produtos.values()){
            if(p.getNome().equalsIgnoreCase(nome)){
                encontrado = true;
                if (p.getQtd() < qtdRemover) {
                    throw new IllegalArgumentException("Quantidade Insuficiente");
                } else {
                    p.setQtd(p.getQtd() - qtdRemover);
                    System.out.println("\nQuantidade Removida!");
                    System.out.printf("\nInformações Atuais - Produto: %s || Qtd: %02d", p.getNome(), p.getQtd());
                }
            }
        }


    }

    public void verificarEstoque(String nome){
        boolean tem = false;
        for (Prodt p: produtos.values()){
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.printf("\nProduto: %s || Quantidade: %02d", p.getNome(), p.getQtd());
                tem = true;
            }
        }
        if(!tem){
            System.out.println("Nenhum produto para visualizar");
        }
    }
}

public class Desafio_2026_02_10_0705 {
    public static void main(String[] args) {
        Estoq estoque = new Estoq();

        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\nGerenciamento de estoque de produtos");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Buscar por produto");
            System.out.println("4 - Encerrar Programa");
            System.out.print("Digite a Opção desejada: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("Digite o nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite a qtd de Produto: ");
                    int qtd = sc.nextInt();
                    sc.nextLine();

                    try {
                        estoque.adicionarProduto(nome, qtd);
                    } catch (IllegalArgumentException e){

                    }

                    break;

                case 2:
                    System.out.print("Digite o nome do Produto: ");
                    String remover = sc.nextLine();

                    System.out.print("Digite a qtd para remover: ");
                    int qtdRemover = sc.nextInt();
                    sc.nextLine();

                    try {
                        estoque.removerProduto(remover, qtdRemover);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do Produto: ");
                    String buscar = sc.nextLine();

                    try {
                        estoque.verificarEstoque(buscar);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Programa Encerrado!");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while(opc != 4);
        sc.close();
    }
}
