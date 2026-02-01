package java_daily_challenges.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
========================================
Sistema de Cadastro de Alunos
Nível: iniciante
Data: 2026_01_30_0024
========================================

ENUNCIADO:
Desenvolva um sistema que permita cadastrar alunos, armazenando seus dados em um array.
O sistema deve permitir adicionar, remover e buscar alunos por nome.

REQUISITOS:
- O sistema deve armazenar os dados dos alunos em um array
- O sistema deve permitir adicionar um novo aluno
- O sistema deve permitir remover um aluno pelo nome
- O sistema deve permitir buscar um aluno pelo nome

EXEMPLOS:
Entrada: add Aluno 1 | Saída esperada: Aluno 1 adicionado com sucesso
Entrada: remove Aluno 1 | Saída esperada: Aluno 1 removido com sucesso
Entrada: buscar Aluno 1 | Saída esperada: Aluno 1 encontrado
*/
class Aluno{
    private String nome;
    private int idade;
    private int anoLetivo;

    public Aluno(String nome, int idade, int anoLetivo){
        this.nome = nome;
        this.idade = idade;
        this.anoLetivo = anoLetivo;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public int getAnoLetivo() {
        return anoLetivo;
    }
}

public class Desafio_2026_01_30_0024 {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Cadastro de Alunos");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Remover Aluno");
            System.out.println("3 - Buscar Aluno");
            System.out.println("4 - Sair");
            System.out.print("Selecione a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("\nNome do Aluno: ");
                    String nome = sc.nextLine();

                    if (nome.isEmpty()){
                        System.out.println("Coloque um nome válido!");
                        break;
                    }

                    System.out.println("\nIdade do Aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    if (idade > 20 || idade < 5){
                        System.out.println("Idade inválida par ao sistema escolar!");
                        break;
                    }

                    System.out.println("\nSérie Escolar: ");
                    int anoLetivo = sc.nextInt();
                    sc.nextLine();

                    if (anoLetivo > 9){
                        System.out.println("Ano escolar Inválido!");
                        break;
                    }

                    System.out.println("Aluno adicionado com sucesso!");
                    alunos.add(new Aluno(nome, idade, anoLetivo));
                    break;

                case 2:
                    System.out.print("\nNome do Aluno: ");
                    String remover = sc.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < alunos.size(); i++) {
                        if (alunos.get(i).getNome().equalsIgnoreCase(remover)) {
                            alunos.remove(i);
                            removido = true;
                            System.out.println("Aluno removido com sucesso!");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 3:
                    System.out.print("\nNome do Aluno: ");
                    String buscar = sc.nextLine();
                    boolean encontrado = false;

                    for (Aluno a : alunos){
                        if (a.getNome().equalsIgnoreCase(buscar)){
                            System.out.printf("\nAluno: %s | Idade: %d | Série escolar: %d° - ano Fundamental", a.getNome(), a.getIdade(), a.getAnoLetivo());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa!");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while(opcao != 4);
        sc.close();
    }
}
