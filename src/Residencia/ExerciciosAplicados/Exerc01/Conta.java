package Residencia.ExerciciosAplicados.Exerc01;

public abstract class Conta implements Residencia.ExerciciosAplicados.Exerc01.OperacoesBancarias {
    private int numeroConta;
    protected double saldo;
    private Residencia.ExerciciosAplicados.Exerc01.Cliente titular;

    public Conta(int numeroConta, Residencia.ExerciciosAplicados.Exerc01.Cliente titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    //Getters
    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Residencia.ExerciciosAplicados.Exerc01.Cliente getTitular() {
        return titular;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.println("Valor depositado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public abstract void aplicarJuros();
}
