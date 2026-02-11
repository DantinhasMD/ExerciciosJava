package java_daily_challenges.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
========================================
Sistema de Cadastro de Clientes
Nível: iniciante
Data: 2026_02_11_0702
========================================

ENUNCIADO:
Desenvolva um sistema que permita cadastrar clientes com nome, sobrenome, idade e endereço. O sistema
deve verificar se o cliente já está cadastrado e se a idade é válida.

CONCEITOS:
- excecoes
- mapas

REQUISITOS:
- O sistema deve verificar se o cliente já está cadastrado antes de criar um novo cadastro.
- O sistema deve verificar se a idade do cliente é válida (entre 0 e 150).
- O sistema deve armazenar os dados de cada cliente em um mapa com o nome do cliente como chave.
- O sistema deve lançar uma exceção se o cliente não for encontrado ou se a idade for inválida.

EXEMPLOS:
Entrada: nome=João, sobrenome=Santos, idade=30, endereço=Rua ABC, 123 | Saída esperada: {"nome":"João","sobrenome":"Santos","idade":30,"endereço":"Rua ABC, 123"}
Entrada: nome=João, sobrenome=Santos, idade=-1, endereço=Rua ABC, 123 | Saída esperada: Exceção: Idade inválida
Entrada: nome=João, sobrenome=Santos, idade=30, endereço=Rua ABC, 123 | Saída esperada: Exceção: Cliente já cadastrado
*/
class CCliente {
    private String nome;
    private String sobrenome;
    private int idade;
    private String endereco;

    public CCliente(String nome, String sobrenome, int idade, String endereco){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }
}

class Sistema {
    Map<String, CCliente> clientes = new HashMap<>();

    public void adicionar(String nome, String sobrenome, int idade, String endereco){

        if (nome.isEmpty() || nome == null) {
            throw new IllegalArgumentException("\nCampo nome inválido!");
        }

        if (sobrenome.isEmpty() || sobrenome == null) {
            throw new IllegalArgumentException("\nCampo sobrenome inválido!");
        }

        if (endereco.isEmpty() || endereco == null) {
            throw new IllegalArgumentException("\nCampo endereço inválido!");
        }

        if (idade < 0 || idade > 150) {
            throw new IllegalArgumentException("\nCampo idade inválido!");
        }

        boolean existe = false;
        for (CCliente c: clientes.values()){
            if (c.getNome().equalsIgnoreCase(nome)){
                System.out.println("\nCliente já cadastrado no sistema!");
                existe = true;
            }
        }

        if (!existe){
            clientes.put(nome, new CCliente(nome, sobrenome, idade, endereco));
            System.out.println("\nCliente adicionado!");
        }
    }

    public void visualizar(){
        boolean existe = false;
        for (CCliente c: clientes.values()){
            System.out.printf("Nome: %s|| Sobrenome: %s || Idade: %02d || Endereço: %s",
                    c.getNome(), c.getSobrenome(), c.getIdade(), c.getEndereco());
            existe = true;
        }
        System.out.println("\n");

        if (!existe){
            System.out.println("\nNão há clientes cadastrados!");
        }
    }
}


public class Desafio_2026_02_11_0702 {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Scanner sc = new Scanner(System.in);
        int opc;

        do{
            System.out.println("\nSistema de Cadastro de Clientes");
            System.out.println("1 - Adiconar Cliente");
            System.out.println("2 - Buscar Clientes");
            System.out.println("3 - Encerrar");
            System.out.print("Selecione a opção deseja: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.print("Nome do Cliente: ");
                    String nome = sc.nextLine();

                    System.out.print("Sobrenome do Cliente: ");
                    String sobrenome = sc.nextLine();

                    System.out.print("Idade do Cliente: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Endereço do Cliente: ");
                    String endereco = sc.nextLine();

                    try {
                        sistema.adicionar(nome, sobrenome, idade, endereco);
                    } catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    sistema.visualizar();
                    break;
                case 3:
                    System.out.println("Programa Encerrado!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while(opc != 3);
        sc.close();
    }
}
