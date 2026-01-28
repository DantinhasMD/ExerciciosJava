package Residencia.POO.Poo28;

abstract class Cartao {
    protected int numero;
    protected double limite;

    public abstract void processarCompra(double valor);
}
