/* Crie a classe abstrata Conta com atributos numero e saldo e o
método abstrato void atualizarMensal().
● Crie as subclasses:
○ ContaCorrente → desconta R$ 15,00 de taxa mensal.
○ ContaPoupanca → aumenta o saldo em 0,5%.
● No Main, crie uma conta corrente e uma poupança, faça depósito
inicial e aplique a atualização mensal. */

package Residencia.POO.Poo27;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo27.Conta primeiro = new Residencia.POO.Poo27.ContaCorrente(12345, 100);
        Residencia.POO.Poo27.Conta segundo = new Residencia.POO.Poo27.ContaPoupanca(12344, 100);

        System.out.printf("%.2f\n", primeiro.atualizarMensal());
        System.out.printf("%.2f\n", segundo.atualizarMensal());

    }
}
