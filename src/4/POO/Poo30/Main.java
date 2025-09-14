/* Crie a classe abstrata Emprestimo com atributos valor e
taxaJuros e o método abstrato double calcularParcela(int
meses).
● Crie as subclasses:
○ EmprestimoPessoal → calcula parcela simples: (valor * (1
+ taxaJuros * meses)) / meses.
○ EmprestimoEmpresarial → parcela reduzida em 10% como
benefício.

● No Main, simule os dois tipos de empréstimos e compare os valores
das parcelas. */

package POO.Poo30;

public class Main {
    public static void main(String[] args) {
        POO.Poo30.Emprestimo primeiro = new POO.Poo30.EmprestimoPessoal(100, 2);
        POO.Poo30.Emprestimo segundo = new POO.Poo30.EmprestimoEmpresarial(100, 2);

        System.out.printf("%.2f\n", primeiro.calcularParcela(12));
        System.out.printf("%.2f\n",segundo.calcularParcela(12));

    }
}
