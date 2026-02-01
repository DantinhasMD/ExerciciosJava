package java_daily_challenges.iniciante;

/*
========================================
Sistema de Controle de Estoque
Nível: iniciante
Data: 2026_01_28_2233
========================================

ENUNCIADO:
Desenvolva um sistema que lida com o controle de estoque de uma loja. O sistema deve permitir a adição, remoção e consulta de produtos no estoque. Além disso, o sistema deve calcular o saldo atual do estoque.

REQUISITOS:
- O sistema deve permitir a adição de produtos com nome, quantidade e preço
- O sistema deve permitir a remoção de produtos do estoque
- O sistema deve calcular o saldo atual do estoque
- O sistema deve retornar a lista de produtos no estoque

EXEMPLOS:
Entrada: Adicionar produto com nome 'Camiseta', quantidade 10 e preço 20.00 | Saída esperada: Produto adicionado com sucesso!
Entrada: Remover produto com nome 'Camiseta' | Saída esperada: Produto removido com sucesso!
Entrada: Consultar saldo do estoque | Saída esperada: Saldo atual do estoque: 10 unidades
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produto {
    protected String nome;
    protected double quantidade;
    protected double preco;

    public Produto(String nome, double quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }
}

public class Desafio_2026_01_28_2233 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("\n=== Sistema de Controle de Estoque ===");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Consultar saldo do Estoque");
            System.out.println("4 - Consultar produtos do Estoque");
            System.out.println("5 - Sair");
            System.out.print("\nSeja Bem-Vindo! Selecione a opção deseja: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();
            } catch (Exception e){
                sc.nextLine();
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n Você selecionou a opção 1 - Cadastrar novo produto");

                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade: ");
                    double quantidade = sc.nextDouble();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    sc.nextLine();

                    if (!nome.isEmpty() && quantidade > 0 && preco > 0) {
                        produtos.add(new Produto(nome, quantidade, preco));
                        System.out.println("Produto cadastrado com sucesso!\n");
                    } else {
                        System.out.println("Dados inválidos.\n");
                    }
                    break;

                case 2:
                    System.out.println("\n Você selecionou a opção 2 - Remover produto");
                    System.out.print("\n Qual produto deseja remover: ");
                    String remover = sc.nextLine();
                    boolean removido = false;

                    for (Produto p : produtos) {
                        if (p.getNome().equalsIgnoreCase(remover)) {
                            produtos.remove(p);
                            removido = true;
                            break;
                        }
                    }

                    if (removido) {
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("\n Você selecionou a opção 3 -  Consultar saldo do Estoque");
                    double totalUnidades = 0;
                    for (Produto p : produtos) {
                        totalUnidades += p.getQuantidade();
                    }
                    System.out.println("Saldo total do estoque: " + totalUnidades + " unidades");
                    break;

                case 4:
                    System.out.println("\n Você selecionou a opção 4 -  Consultar produtos do Estoque");
                    int contador = 1;
                    for (Produto p : produtos) {
                        System.out.printf("%d - %s\n", contador, p.getNome());
                        contador++;
                    }
                    break;

                case 5:
                    System.out.println("\n Encerrando...");
                    break;

                default:
                    System.out.println("Opção Inválida! Tente Novamente");
                    break;
            }

        } while(opcao != 5);
        System.out.println("Programa Encerrado. Até mais!");

        sc.close();

    }
}