/* Crie uma classe ContaBancaria com:
● Atributos titular e saldo.

● Método gerarRelatorio() que exibe "Relatório genérico".

Crie duas subclasses:
● ContaCorrente → sobrescreve gerarRelatorio() para mostrar titular, saldo e
desconto de taxa de manutenção (R$20).

● ContaPoupanca → sobrescreve gerarRelatorio() para mostrar titular, saldo e rendimento
mensal de 0.5%.

No Main, crie uma lista de ContaBancaria e percorra chamando gerarRelatorio() para cada conta. */

package Residencia.POO.Poo26;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo26.ContaCorrente primeiro = new Residencia.POO.Poo26.ContaCorrente("Maria", 2333.45);
        primeiro.gerarRelatorio();

        Residencia.POO.Poo26.ContaPoupanca segundo = new Residencia.POO.Poo26.ContaPoupanca("Maria", 2333.45);
        segundo.gerarRelatorio();
    }
}
