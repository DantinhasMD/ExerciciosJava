/* Cálculo de Média Móvel de Ativos
Receba os preços de uma ação nos últimos 10 dias e calcule a média móvel de 3 dias.
- Se houver menos de 3 valores no vetor, lance IllegalArgumentException.
- Se os preços forem informados incorretamente, capture NumberFormatException.

Fórmula da Média Móvel:
MM=(Patual+Panterior1+Panterior2)/3
Exemplo de Entrada:
{100.0, 102.0, 101.0, 103.0, 105.0}

Saída Esperada:
Média Móvel (dia 3): 101.0
Média Móvel (dia 4): 102.0
Média Móvel (dia 5): 103.0

👉 Dica: Valide o tamanho do vetor antes de calcular.*/

package TratamentoDeExcecoes;

import java.util.Scanner;

public class Tratamento02 {

    public static void calcularMediaMovel(double[] precos){
        if (precos.length < 3) {
            throw new IllegalArgumentException("É necessário pelo menos 3 valores para calcular a média móvel.");
        }

        for (int i = 2; i < precos.length; i++) {
            double media = (precos[i] + precos[i - 1] + precos[i - 2]) / 3.0;
            System.out.printf("Média Móvel (dia %d): %.2f%n", (i + 1), media);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precosAcoes = new double[10];

        System.out.println("Digite os preços da ação dos últimos 10 dias:");

        try {
            for (int i = 0; i < precosAcoes.length; i++) {
                System.out.print("Dia " + (i + 1) + ": ");
                String entrada = sc.next();
                precosAcoes[i] = Double.parseDouble(entrada);
            }

            calcularMediaMovel(precosAcoes);

        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor inválido informado. Use apenas números decimais.");
        }

        sc.close();
    }
}
