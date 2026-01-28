/* Crie a classe ContaBancaria com os atributos:
● titular (String)
● numeroConta (String)
● saldo (double)

Métodos:

● void depositar(double valor)
● void sacar(double valor)
● void exibirSaldo()

Objetivo: criar duas contas bancárias, realizar saques e depósitos e exibir os saldos
atualizados. */

package Residencia.POO.Poo2;

public class ContaBancaria {
    public String titular;
    public int numeroConta;
    public double saldo;


    public void depositar(double valor){
        System.out.println("Valor depositado da conta com Sucesso!");
        this.saldo += valor;
        System.out.printf("Nome: %s, Número Conta: %02d, Saldo: %.2f\n", this.titular, this.numeroConta, this.saldo);

    }

    public void sacar(double valor){
        if (valor < this.saldo) {
            System.out.println("Valor sacado da conta com Sucesso!");
            this.saldo -= valor;
            System.out.printf("Nome: %s, Número Conta: %02d, Saldo: %.2f\n", this.titular, this.numeroConta, this.saldo);
        } else {
            System.out.println("O valor desejado para Sacar excede o saldo da conta!");
        }

    }

    public void exibirSaldo(){
        System.out.println("Titular: " + this.titular);
        System.out.println("numeroConta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
