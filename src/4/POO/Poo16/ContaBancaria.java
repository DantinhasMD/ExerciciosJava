/* Crie a classe base ContaBancaria com os atributos privados:
● titular (String)
● numeroConta (String)
● saldo (double)

Crie a classe ContaCorrente, que herda de ContaBancaria, e adicione o atributo:
● limiteChequeEspecial (double)

Implemente os construtores nas duas classes.
Na subclasse, adicione um método sacarComChequeEspecial(double valor) que
permite saque até o limite do cheque especial. */

package POO.Poo16;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Getters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    // Setters
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void exibirInformacoes(){
        System.out.printf("Titular: %s\n", getTitular());
        System.out.printf("Número Conta: %s\n", getNumeroConta());
        System.out.printf("Saldo: R$%.2f\n", getSaldo());
    }
}
