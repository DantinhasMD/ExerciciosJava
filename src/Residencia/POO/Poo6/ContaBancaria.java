/* Crie a classe ContaBancaria com os seguintes atributos privados:
titular (String), numeroConta (String), saldo (double)

Implemente os métodos getters e setters, garantindo que:
o saldo não pode ser alterado diretamente (sem setSaldo)

o método depositar(double valor) só aceita valores positivos

o método sacar(double valor) só permite saque se houver saldo suficiente

Crie um método exibirExtrato() para mostrar os dados da conta e o saldo atual.*/

package Residencia.POO.Poo6;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;


    public void setNomeNumeroConta(String titular, int numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void setDepositar(double valor) {
        if (valor < 0){
            System.out.println("O Valor depositado precisa ser positivo\n");
        } else {
            saldo += valor;
        }
    }

    public void setSacar(double valor) {
        if (valor < 0){
            System.out.println("O Valor depositado precisa ser positivo\n");
        } else if (valor > saldo){
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
        }
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }
}
