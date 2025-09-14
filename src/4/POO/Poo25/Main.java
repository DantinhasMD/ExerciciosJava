/* Crie uma classe Emprestimo com:
● Atributo valorEmprestado.

● Método calcularParcela(int meses) que retorna valorEmprestado / meses.

Crie duas subclasses:
● EmprestimoPessoal (sobrescreve calcularParcela aplicando juros simples de 2% ao mês).

● EmprestimoEmpresarial (sobrescreve calcularParcela aplicando juros
de 1% ao mês + taxa fixa de R$100 por parcela).

No Main, crie um array de Emprestimo e exiba o valor das parcelas em 12 meses. */

package POO.Poo25;

public class Main {
    public static void main(String[] args) {
        EmprestimoPessoal  primeiro = new EmprestimoPessoal(2333.45);
        System.out.printf("%.2f\n", primeiro.calcularParcela(12));

        EmprestimoEmpresarial segundo = new EmprestimoEmpresarial(2333.45);
        System.out.printf("%.2f\n", segundo.calcularParcela(12));
    }
}
