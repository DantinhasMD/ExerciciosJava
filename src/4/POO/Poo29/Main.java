/* Crie a classe abstrata Investimento com atributo valorAplicado e
o método abstrato double calcularRendimento().
● Crie as subclasses:
○ RendaFixa → rendimento de 5%.
○ RendaVariavel → rendimento de 10%.
● No Main, crie os dois investimentos e mostre o valor final de cada
um. */

package POO.Poo29;

public class Main {
    public static void main(String[] args) {
        POO.Poo29.Investimento primeiro = new POO.Poo29.RendaFixa(100);
        POO.Poo29.Investimento segundo = new POO.Poo29.RendaVariavel(100);

        System.out.printf("%.2f\n", primeiro.calcularRendimento());
        System.out.printf("%.2f\n",segundo.calcularRendimento());

    }
}
