/* Crie a classe Aluno com:
● nome (String)
● nota1 (double)
● nota2 (double)

Métodos:
● double calcularMedia()
● String verificarSituacao() → retorna "Aprovado", "Reprovado" ou
"Recuperação" com base na média.
● void exibirRelatorio()

Objetivo: instanciar um ou mais alunos e apresentar o boletim com notas e situação final. */

package Residencia.POO.Poo3;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;


    public double calcularMedia(){
        return (this.nota1 + this.nota2) / 2;
    }

    public String verificarSituacao(){
        double mediaAluno = calcularMedia();
        if (mediaAluno > 5) {
            return "O aluno passou de ano!";
        } else {
            return "O aluno Reprovou!";
        }
    }

    public void exibirRelatorio(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.printf("Média: %.2f\n", calcularMedia());
        System.out.println(verificarSituacao());
    }
}
