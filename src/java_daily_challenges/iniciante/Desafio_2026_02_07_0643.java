package java_daily_challenges.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
========================================
Sistema de Cadastro de Produtos
Nível: iniciante
Data: 2026_02_07_0643
========================================

ENUNCIADO:
Desenvolva um sistema que permite o cadastro de produtos em uma loja virtual. O sistema deve validar a
entrada de dados e armazenar os produtos em um mapa.

CONCEITOS:
- excecoes
- mapas

REQUISITOS:
- O sistema deve permitir o cadastro de produtos com nome, descrição e preço.
- O sistema deve validar a entrada de dados para evitar campos vazios ou preços negativos.
- O sistema deve armazenar os produtos em um mapa com o nome do produto como chave e o objeto de
produto como valor.

EXEMPLOS:
Entrada: nome=Produto 1&descricao=Descrição do produto 1&preco=10.99 | Saída esperada: {"nome":"Produto 1","descricao":"Descrição do produto 1","preco":10.99}
Entrada: nome=Produto 1&descricao=&preco=10.99 | Saída esperada: Campo descricao vazio ou inválido.
Entrada: nome=Produto 1&descricao=Descrição do produto 1&preco=-10.99 | Saída esperada: Preço inválido.
Entrada: nome= | Saída esperada: Campo nome vazio ou inválido.
*/
class Produ {
    private String nome;
    private String descricao;
    private double preco;

    public Produ(String nome, String descricao, double preco){
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }
}

class Lojaa {
    Map<String, Produ> produMap = new HashMap<>();

    public void adicionar(String nome, String descricao, double preco){
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (descricao == null || descricao.isEmpty()){
            throw new IllegalArgumentException("\nCampo descrição inválido!");
        }

        if (preco < 0){
            throw new IllegalArgumentException("\nPreço inválido!");
        }

        boolean existe = false;
        for (Produ p: produMap.values()){
            if (p.getNome().equalsIgnoreCase(nome)){
                System.out.println("\nProduto já cadastrado no sistema!");
                existe = true;
            }
        }

        if (!existe){
            produMap.put(nome, new Produ(nome,descricao, preco));
            System.out.println("Produto cadastrado com Sucesso!");
        }
    }

    public void remover(String nome){
        if (nome.isEmpty() || nome == null){
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        boolean encontrado = false;
        for (Produ p: produMap.values()){
            if (p.getNome().equalsIgnoreCase(nome)){
                produMap.remove(nome);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("\nProduto não encontrado!");
        }
    }

    public void buscarProdutos(){
        boolean encontrado = false;

        for (Produ p: produMap.values()){
            System.out.printf("\nNome: %s || Descrição: %s || Preço: %.2f\n", p.getNome(), p.getDescricao(), p.getPreco());
            encontrado = true;
        }
        if (!encontrado){
            System.out.println("Nenhum produto adicionado!");
        }
    }
}

public class Desafio_2026_02_07_0643 {
    public static void main(String[] args) {
        Lojaa loja = new Lojaa();

        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\nSistema de Cadastro de Produtos");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Buscar produtos");
            System.out.println("4 - Encerrar");
            System.out.print("Selecione a Opção Desejada: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    try {
                        loja.adicionar(nome, descricao, preco);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Nome do Produto: ");
                    String remover = sc.nextLine();

                    try {
                        loja.remover(remover);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    loja.buscarProdutos();
                    break;

                case 4:
                    System.out.println("Encerrando programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opc != 4);
        sc.close();
    }
}
