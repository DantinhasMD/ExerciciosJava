/* Crie a classe Emprestimo com os atributos privados:
● valor (double)
● taxaJuros (double)
● prazoMeses (int)

Implemente:
● Um construtor que receba valor e prazoMeses, inicializando taxaJuros com uma
taxa padrão (exemplo: 1.5).
● Um construtor que receba todos os três atributos. */

package Residencia.POO.Poo13;

public class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int prazoMeses;

    public Emprestimo(){
        this.valor = 0.0;
        this.taxaJuros = 1.5;
        this.prazoMeses = 0;
    }

    public Emprestimo(double valor, double taxaJuros, int prazoMeses){
        this.valor = valor;
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;
    }

    //Getters
    public double getValor() {
        return valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public int getPrazoMeses() {
        return prazoMeses;
    }

    //Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void setPrazoMeses(int prazoMeses) {
        this.prazoMeses = prazoMeses;
    }

    public void exibirInformacoes(){
        System.out.printf("Valor do Empréstimo: %.2f\n", getValor());
        System.out.printf("Taxa de Juros: %.2f%%\n", getTaxaJuros());
        System.out.printf("Prazo Mensal: %02d\n", getPrazoMeses());
    }
}
