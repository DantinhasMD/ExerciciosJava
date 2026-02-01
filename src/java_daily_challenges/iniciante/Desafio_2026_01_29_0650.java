package java_daily_challenges.iniciante;

/*
========================================
Sistema de Cadastro de Clientes
Nível: iniciante
Data: 2026_01_29_0650
========================================

ENUNCIADO:
Desenvolva um sistema que permita cadastrar clientes com nome, sobrenome e idade. O sistema deve verificar se o cliente já existe antes de realizar o cadastro. Se o cliente existir, o sistema deve exibir uma mensagem indicando que o cliente já está cadastrado.

REQUISITOS:
- Validar entrada de dados
- Verificar existência de cliente

EXEMPLOS:
Entrada: nome=João, sobrenome=Pereira, idade=30 | Saída esperada: Cliente João Pereira já existe no sistema.
Entrada: nome=João, sobrenome=Pereira, idade=30 | Saída esperada: Cliente João Pereira cadastrado com sucesso!
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Cliente{
    private String nome;
    private String sobrenome;
    private int idade;

    public Cliente(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public int getIdade() {
        return idade;
    }
}

public class Desafio_2026_01_29_0650 {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\nSistema de Cadastro de Clientes");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Você deseja adicionar um novo Cliente!");
                    System.out.print("\nNome do Cliente: ");
                    String nome = sc.nextLine();

                    System.out.print("\nSobrenome do Cliente: ");
                    String sobrenome = sc.nextLine();

                    if (nome.isEmpty() || sobrenome.isEmpty()){
                        System.out.println("Digite um nome e sobrenome válidos");
                        break;
                    }

                    System.out.print("\nIdade do Cliente: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    String nomeCompleto = nome + " " + sobrenome;

                    boolean existe = false;
                    for (Cliente c: clientes) {
                        if (nomeCompleto.equals(c.getNome() + " " + c.getSobrenome())) {
                            System.out.println("Usuário já cadastrado!");
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        clientes.add(new Cliente(nome, sobrenome, idade));
                        System.out.println("Cliente cadastrado!");
                    }
                    break;

                case 2:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        } while(opcao != 2);
        System.out.println("Programa Encerrado. Até mais!");

        sc.close();
    }
}
