package java_daily_challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
========================================
Biblioteca de Livros
Nível: iniciante
Data: 2026_01_31_1651
========================================

ENUNCIADO:
Desenvolva uma aplicação que armazene informações sobre livros, incluindo título, autor e ano de publicação.
A aplicação deve permitir a adição, remoção e busca de livros.

REQUISITOS:
- O sistema deve ter uma classe para representar um livro
- A classe deve ter métodos para adicionar, remover e buscar livros
- Os livros devem ser armazenados em uma estrutura de dados
- A aplicação deve ter uma interface para interagir com o usuário

EXEMPLOS:
Entrada: add livro 'O Conto da Aia' autor='João' ano='2020' | Saída esperada: Livro adicionado com sucesso!
Entrada: buscar livro 'O Conto da Aia' | Saída esperada: Título: O Conto da Aia, Autor: João, Ano: 2020
Entrada: remover livro 'O Conto da Aia' | Saída esperada: Livro removido com sucesso!
*/
class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String exibirInformacoes(){
        return "Titulo: "+ titulo + " | Autor: " + autor + " | Ano: " + anoPublicacao;
    }
}

class Biblioteca {
    List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoPublicao){
        livros.add(new Livro(titulo, autor, anoPublicao));
        System.out.println("Livro Adicionado!");
    }

    public void removerLivro(String titulo){
        boolean encontrado = false;

        for (Livro l : livros){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                livros.remove(l);
                System.out.println("Livro removido!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("Livro não encontrado!");
        }
    }

    public void buscarLivros(){
        if (livros.isEmpty()){
            System.out.println("Não há livros na Biblioteca!");
        } else {
            for (Livro l: livros){
                System.out.println(l.exibirInformacoes());
            }
        }
    }

    public void buscarLivro(String titulo){
        boolean encontrado = false;

        for (Livro l: livros){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(l.exibirInformacoes());
                encontrado = true;
            }
        }
        if (!encontrado){
            System.out.println("Livro não encontrado!\n");
        }
    }
}

public class Desafio_2026_01_31_1651 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nBiblioteca de Livros");
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Remover Livro");
            System.out.println("3 - Visualizar Acervo");
            System.out.println("4 - Buscar Livro");
            System.out.println("5 - Encerrar");
            System.out.print("Selecione uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("\nTítulo: ");
                    String titulo = sc.nextLine();

                    System.out.print("Autor: ");
                    String autor = sc.nextLine();

                    System.out.print("Ano de Publicação: ");
                    int anoPublicacao = sc.nextInt();
                    sc.nextLine();

                    if(titulo.isEmpty() || autor.isEmpty() || anoPublicacao < 0){
                        System.out.println("Informações Inválidas\n");
                        break;
                    } else {
                        biblioteca.adicionarLivro(titulo, autor, anoPublicacao);
                    }
                    break;

                case 2:
                    System.out.print("\nTítulo: ");
                    String remover = sc.nextLine();

                    if(remover.isEmpty()){
                        System.out.println("Informação Inválida\n");
                        break;
                    } else {
                        biblioteca.removerLivro(remover);
                    }
                    break;

                case 3:
                    biblioteca.buscarLivros();
                    break;

                case 4:
                    System.out.print("\nTitulo: ");
                    String buscar = sc.nextLine();
                    if (buscar.isEmpty()){
                        System.out.println("Campo Inválido");
                    } else {
                        biblioteca.buscarLivro(buscar);
                    }
                    break;

                case 5:
                    System.out.println("Encerrando Programa. Até mais!");
                    break;

                default:
                    System.out.println("Opção Inválida!\n");
                    break;
            }
        } while (opcao != 5);
        sc.close();
    }
}
