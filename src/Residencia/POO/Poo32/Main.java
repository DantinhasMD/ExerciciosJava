/*Interface:
public interface ContaBancaria {
void depositar(double valor);
void sacar(double valor);
double consultarSaldo();
}

Classes a implementar:
● ContaCorrente → taxa de saque de R$ 2,50.
● ContaPoupanca → não cobra taxa, mas só permite saque se houver saldo.
No Main:
● Criar uma conta de cada tipo.
● Depositar R$ 500.
● Sacar R$ 100 em cada uma.
● Exibir saldo final.*/

package Residencia.POO.Poo32;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo32.ContaBancaria primeiro = new Residencia.POO.Poo32.ContaCorrente();
        Residencia.POO.Poo32.ContaBancaria segundo = new Residencia.POO.Poo32.ContaPoupanca();

        primeiro.depositar(500);
        segundo.depositar(500);

        primeiro.sacar(100);
        segundo.sacar(100);

        System.out.printf("%.2f\n", primeiro.consultarSaldo());
        System.out.printf("%.2f\n", segundo.consultarSaldo());

    }
}
