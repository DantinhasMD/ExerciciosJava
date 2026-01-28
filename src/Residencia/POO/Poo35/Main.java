/* Interface:
public interface Emprestimo {
double calcularParcela(int meses);
double calcularTotalAPagar(int meses);
}
Classes a implementar:
● EmprestimoPessoal → juros compostos de 2% ao mês.
● EmprestimoImobiliario → juros compostos de 1% ao mês.
No Main:
● Simular empréstimo de R$ 10.000 em 24 meses.
● Mostrar valor da parcela e total a pagar em cada tipo */

package Residencia.POO.Poo35;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo35.Emprestimo primeiro = new Residencia.POO.Poo35.EmprestimoPessoal();
        Residencia.POO.Poo35.Emprestimo segundo = new Residencia.POO.Poo35.EmprestimoImobiliario();

        System.out.printf("Empréstimo Pessoal: Valor parcelas: R$%.2f | Total a Pagar R$%.2f\n", primeiro.calcularParcela(24), primeiro.calcularTotalAPagar(24));
        System.out.printf("Empréstimo Imobiliário: Valor parcelas: R$%.2f | Total a Pagar R$%.2f\n", segundo.calcularParcela(24), segundo.calcularTotalAPagar(24));
    }
}
