package Residencia.POO.Poo13;

public class Main {
    public static void main(String[] args) {
        Emprestimo primeiro = new Emprestimo();
        primeiro.exibirInformacoes();
        primeiro.setValor(4900.33);
        primeiro.setPrazoMeses(14);
        primeiro.exibirInformacoes();
        primeiro.setTaxaJuros(3.45);
        primeiro.exibirInformacoes();

        Emprestimo segundo = new Emprestimo(3899.45, 2.19, 17);
        segundo.exibirInformacoes();
    }
}
