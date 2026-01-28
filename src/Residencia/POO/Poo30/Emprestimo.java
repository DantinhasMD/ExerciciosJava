package Residencia.POO.Poo30;

abstract class Emprestimo {
    protected double valor;
    protected double taxaJuros;

    public abstract double calcularParcela(int meses);
}
