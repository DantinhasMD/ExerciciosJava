/*  Simulador de Parcelamento de Empréstimos
Crie um método para calcular as parcelas de um empréstimo, considerando:
- 12 meses fixos.
- Taxa de juros mensal.
- Se a taxa de juros for negativa, lance IllegalArgumentException.
- Se o valor do empréstimo for 0, lance ArithmeticException.

Fórmula da Parcela Mensal (PMT):
PMT=P×r1−(1+r)−nPMT = \frac{P \times r}{1 - (1+r)^{-n}}
Onde:
- P = Valor do empréstimo
- r = Taxa de juros mensal
- n = Número de meses

Exemplo de Entrada:
Valor do empréstimo: 10000
Taxa de juros mensal: -0.02

Saída Esperada:
Erro: A taxa de juros não pode ser negativa!

👉 Dica: Verifique condições antes de aplicar a fórmula. */

package Residencia.TratamentoDeExcecoes;

import java.util.Scanner;

public class Tratamento04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nValor Emprestimo: ");
        double valorEmprestimo = sc.nextDouble();
        if (valorEmprestimo > 0){
            System.out.print("\nTaxa de Juros Mensal: ");
            double taxaJuros = sc.nextDouble();
            if (taxaJuros > 0){
                System.out.printf("Valor Parcela Mensal (12m): %.2f", calcularParcelasEmprestimo(valorEmprestimo, taxaJuros));
            } else {
                System.out.println("A taxa de juros não pode ser negativa!");
            }
        } else {
            System.out.println("O empréstimo não pode ser negativo!");
        }
        sc.close();
    }

    public static double calcularParcelasEmprestimo(double valorEmprestimo, double taxaJuros) {
        return (valorEmprestimo * taxaJuros) / (1 - Math.pow(1 + taxaJuros, -12));
    }
}
