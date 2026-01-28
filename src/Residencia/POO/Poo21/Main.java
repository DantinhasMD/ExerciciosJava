/* Implemente uma classe CalculadoraFinanceira que seja capaz de calcular juros simples
usando sobrecarga de métodos (overloading). A classe deve oferecer três versões do
método calcularJuros:
1. Que receba o capital, a taxa de juros mensal e o tempo em meses.
2. Que receba apenas o capital e a taxa, assumindo que o tempo padrão seja de 12
meses.
3. Que receba apenas o capital, assumindo taxa padrão de 1.5% ao mês e tempo de 12
meses.

Em seguida, crie a classe MainCalculadoraFinanceira para testar as três variações do
método. */

package Residencia.POO.Poo21;

public class Main {
    public static void main(String[] args) {
        CalculadoraFinanceira primeiro = new CalculadoraFinanceira();
        CalculadoraFinanceira segundo = new CalculadoraFinanceira();
        CalculadoraFinanceira terceiro = new CalculadoraFinanceira();

        System.out.printf("%.2f\n",primeiro.calcularJuros(1200, 2.5, 3));
        System.out.printf("%.2f\n", segundo.calcularJuros(1200, 2.5));
        System.out.printf("%.2f\n", terceiro.calcularJuros(1200));
    }
}
