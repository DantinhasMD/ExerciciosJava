package POO.Poo3;

public class Main {
    public static void main(String[] args) {
        POO.Poo3.Aluno bia = new POO.Poo3.Aluno();
        POO.Poo3.Aluno joao = new POO.Poo3.Aluno();

        bia.nome = "Biazinha";
        bia.nota1 = 7.8;
        bia.nota2 = 4.9;

        joao.nome = "João";
        joao.nota1 = 3.3;
        joao.nota2 = 6.7;


        bia.exibirRelatorio();
        joao.exibirRelatorio();
    }
}
