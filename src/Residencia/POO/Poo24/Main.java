/* Crie uma classe Investimento com:
● Atributo valorAplicado.

● Método calcularRendimento() que retorna sempre 0.

Crie duas subclasses:
● Poupanca (sobrescreve calcularRendimento() para retornar 0.5% ao mês).

● CDB (sobrescreve calcularRendimento() para retornar 1% ao mês).

No Main, crie um array de Investimento e exiba o rendimento de cada investimento chamando
calcularRendimento(). */

package Residencia.POO.Poo24;

public class Main {
    public static void main(String[] args) {
        Poupanca  primeiro = new Poupanca(233.45);
        System.out.printf("%.2f\n", primeiro.calcularRendimento());

        CDB segundo = new CDB(233.45);
        System.out.printf("%.2f\n", segundo.calcularRendimento());
    }
}
