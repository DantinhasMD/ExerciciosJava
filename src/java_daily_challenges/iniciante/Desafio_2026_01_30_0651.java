package java_daily_challenges.iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
========================================
Sistema de Votação Simples
Nível: iniciante
Data: 2026_01_30_0651
========================================

ENUNCIADO:
Desenvolva um sistema que permita votar em candidatos e exiba o vencedor da eleição.

REQUISITOS:
- Imutabilidade
- Optional

EXEMPLOS:
Entrada: votar João | Saída esperada: Candidato João recebeu 1 voto
Entrada: votar Maria | Saída esperada: Candidato Maria recebeu 1 voto
Entrada: exibir resultados | Saída esperada: Candidato João recebeu 2 votos, Candidato Maria recebeu 1 voto
*/
class Candidato{
    private String nome;
    private int numero;
    private int qtdVotos;

    public Candidato(String nome, int numero, int qtdVotos){
        this.nome = nome;
        this.numero = numero;
        this.qtdVotos = qtdVotos;
    }

    public String getNome() {
        return nome;
    }
    public int getQtdVotos() {
        return qtdVotos;
    }
    public int getNumero() {
        return numero;
    }

    protected void setQtdVotos(int qtdVotos) {
        this.qtdVotos = qtdVotos;
    }

    public void votar() {
        setQtdVotos(getQtdVotos() + 1);
    }
}

public class Desafio_2026_01_30_0651 {
    public static void main(String[] args) {
        List<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato("Gil do Vigor", 3456, 0));
        candidatos.add(new Candidato("Hytalo Santos", 8902, 0));
        candidatos.add(new Candidato("Maria Venture", 5621, 0));
        candidatos.add(new Candidato("Maisa Silva", 7939, 0));

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Votação Simples");
            System.out.println("1 - Visualizar Candidatos");
            System.out.println("2 - Votar");
            System.out.println("3 - Encerrar votações");
            System.out.print("\nOpção deseja: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Candidatos Participantes:");
                    for (Candidato c: candidatos) {
                        System.out.printf("\n %d - %s", c.getNumero(), c.getNome());
                    }
                    break;

                case 2:
                    System.out.print("\nInforme o número do Candidato que deseja votar: ");
                    int votar = sc.nextInt();
                    boolean encontrado = false;

                    for (Candidato c: candidatos){
                        if (c.getNumero() == votar){
                            c.votar();
                            System.out.printf("\nVocê votou no Candidato - %s", c.getNome());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Candidato não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Votações encerradas!!");
                    Candidato vencedor = candidatos.get(0);

                    for (Candidato c : candidatos) {
                        if (c.getQtdVotos() > vencedor.getQtdVotos()) {
                            vencedor = c;
                        }
                    }

                    if (vencedor.getQtdVotos() == 0 ) {
                        System.out.println("Nenhum candidado recebeu votos");
                        break;
                    }

                    System.out.printf("O vencedor é %s com %02d voto(s)\n", vencedor.getNome(), vencedor.getQtdVotos());
                    System.out.println("\nEncerrando o Programa! Até Mais!");
                    break;


                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcao != 3);
        sc.close();
    }
}
