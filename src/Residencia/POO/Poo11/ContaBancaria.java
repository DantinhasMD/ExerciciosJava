/* Exercício 1 – Conta Bancária (Finanças)
Crie a classe ContaBancaria com os atributos privados:
● titular (String)
● numeroConta (String)
● saldo (double)

Implemente os seguintes construtores:
● Um construtor sem parâmetros que inicialize titular e numeroConta com strings
vazias e saldo com zero.
● Um construtor que receba titular e numeroConta, inicializando saldo com zero.
● Um construtor que receba todos os três atributos. */

package Residencia.POO.Poo11;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(){
        this.titular = "";
        this.numeroConta = "";
        this.saldo = 0;
    }

    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void adicionarSaldo(double valor) {
        this.saldo += valor;
    }

    public void removerSaldo(double valor) {
        if (valor > saldo){
            System.out.println("Quantidade insuficiente no saldo!\n");
        } else {
            this.saldo -= valor;
        }
    }

    public void exibirConta() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número Conta: " + this.numeroConta);
        System.out.printf("Saldo: R$%.2f\n", this.saldo);
    }
}
