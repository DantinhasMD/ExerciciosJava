package POO.Poo5;

public class Main {
    public static void main(String[] args) {
        POO.Poo5.Funcionario marcela = new POO.Poo5.Funcionario();
        POO.Poo5.Funcionario cassio = new POO.Poo5.Funcionario();

        marcela.nome = "Marcela Fontes";
        marcela.salarioBruto = 1512;
        marcela.descontoIR = 100;
        marcela.descontoINSS = 23;

        cassio.nome = "Cassio Roberto";
        cassio.salarioBruto = 6048;
        cassio.descontoIR = 400;
        cassio.descontoINSS = 92;

        marcela.exibirFolhaPagamento();
        cassio.exibirFolhaPagamento();
    }
}
