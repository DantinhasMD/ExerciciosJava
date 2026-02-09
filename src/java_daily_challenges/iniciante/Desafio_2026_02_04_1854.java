package java_daily_challenges.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
========================================
Sistema de Cadastro de Alunos
Nível: iniciante
Data: 2026_02_04_1854
========================================

ENUNCIADO:
Desenvolva um sistema que permita cadastrar, editar e excluir alunos. O sistema deve armazenar a idade do
aluno e a nota na última prova.

CONCEITOS:
- variáveis
- listas

REQUISITOS:
- O sistema deve permitir a inserção de alunos com nome, idade e nota na última prova.
- O sistema deve permitir a edição de informações dos alunos.
- O sistema deve permitir a exclusão de alunos.
- O sistema deve validar se a idade do aluno é maior que 0.
- O sistema deve validar se a nota na última prova é entre 0 e 10.

EXEMPLOS:
Entrada: inserir aluno: João, idade: 15, nota: 8 | Saída esperada: {"nome":"João","idade":15,"nota":8}
Entrada: inserir aluno: João, idade: -1, nota: 8 | Saída esperada: Idade inválida
Entrada: inserir aluno: João, nota: 15 | Saída esperada: Nota inválida
Entrada: editar aluno: João, idade: 20, nota: 9 | Saída esperada: {"nome":"João","idade":20,"nota":9}
Entrada: excluir aluno: João | Saída esperada: Aluno excluído com sucesso
*/
class Alun{
    private String nome;
    private int idade;
    private double notaUltimaProva;

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getNotaUltimaProva() {
        return notaUltimaProva;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotaUltimaProva(double notaUltimaProva) {
        this.notaUltimaProva = notaUltimaProva;
    }

    public Alun(String nome, int idade, double notaUltimaProva){
        this.nome = nome;
        this.idade = idade;
        this.notaUltimaProva = notaUltimaProva;
    }
}

class Escola{
    List<Alun> alunos = new ArrayList<>();

    public void adicionar(String nome, int idade, double nota){
        if (nota > 10) {
            System.out.println("\nNota inválida!");
            return;
        }

        if (idade > 19) {
            System.out.println("\nIdade maior do que a permitida");
            return;
        }

        if (buscarAluno(nome) != null){
            System.out.println("nAluno já cadastrado");
            return;
        }

        alunos.add(new Alun(nome, idade, nota));
        System.out.println("\nAluno cadastrado com sucesso");
    }

    private Alun buscarAluno(String nome) {
        for (Alun a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                return a;
            }
        }
        return null;
    }

    public void buscar(String nome) {
        Alun aluno = buscarAluno(nome);

        if (aluno == null) {
            System.out.println("\nAluno não encontrado");
            return;
        }

        System.out.printf(
                "\nNome: %s | Idade: %d | Nota: %.2f%n",
                aluno.getNome(),
                aluno.getIdade(),
                aluno.getNotaUltimaProva()
        );
    }

    public void alterar(String nome, int idade, double notaUltimaProva){
        Alun aluno = buscarAluno(nome);

        if (aluno == null) {
            System.out.println("\nAluno não encontrado");
            return;
        }

        if (notaUltimaProva > 10) {
            System.out.println("\nNota inválida!");
            return;
        }

        if (idade > 19) {
            System.out.println("\nIdade maior do que a permitida");
        }

        aluno.setIdade(idade);
        aluno.setNotaUltimaProva(notaUltimaProva);

        System.out.println("\nAluno atualizado com sucesso");
    }

    public void excluir (String nome){
        Alun aluno = buscarAluno(nome);

        if (aluno == null) {
            System.out.println("\nAluno não encontrado");
            return;
        }

        alunos.remove(aluno);
        System.out.println("\nAluno excluído com sucesso");

    }
}

public class Desafio_2026_02_04_1854 {
    public static void main(String[] args) {
        Escola escola = new Escola();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== Sistema de Cadastro de Alunos ====");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Editar aluno");
            System.out.println("3 - Excluir aluno");
            System.out.println("4 - Buscar aluno");
            System.out.println("5 - Encerrar");
            System.out.print("Selecione a opção deseja: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Insira o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Insira a idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Insira a nota da última prova: ");
                    double notaUltimaProva = sc.nextDouble();
                    sc.nextLine();

                    if (nome.isEmpty() || idade <= 0 || notaUltimaProva < 0){
                        System.out.println("\nDados Inválidos");
                    } else {
                        escola.adicionar(nome, idade, notaUltimaProva);
                    }
                    break;

                case 2:
                    System.out.print("Insira o nome: ");
                    String nomeBuscar = sc.nextLine();

                    System.out.print("Insira a idade nova: ");
                    int idadeAlterar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Insira nova nota: ");
                    double notaUltimaProvaAlterar = sc.nextDouble();
                    sc.nextLine();

                    if (nomeBuscar.isEmpty() || idadeAlterar <= 0 || notaUltimaProvaAlterar < 0){
                        System.out.println("\nDados Inválidos");
                    } else {
                        escola.alterar(nomeBuscar, idadeAlterar, notaUltimaProvaAlterar);
                    }
                    break;

                case 3:
                    System.out.print("Insira o nome do aluno que deseja excluir: ");
                    String excluir = sc.nextLine();

                    if (excluir.isEmpty()) {
                        System.out.println("\nDado Inválido");
                    } else {
                        escola.excluir(excluir);
                    }
                    break;

                case 4:
                    System.out.print("Insira o nome: ");
                    String buscarNome = sc.nextLine();

                    if (buscarNome.isEmpty()){
                        System.out.println("\nDado Inválido");
                    } else {
                        escola.buscar(buscarNome);
                    }
                    break;

                case 5:
                    System.out.println("\nPrograma Encerrado!");
                    break;

                default:
                    System.out.println("\nOpção Inválida. Tente Novamente");
                    break;
            }
        } while (opcao != 5);
        sc.close();
    }
}
