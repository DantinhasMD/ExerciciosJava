/* Crie uma matriz 3x3, onde cada linha representa um portfólio e cada coluna um ativo financeiro.
Calcule a média dos retornos de cada portfólio.
- Se um valor não for numérico, capture NumberFormatException.
- Se um portfólio estiver incompleto, capture ArrayIndexOutOfBoundsException.

Exemplo de Entrada:
{0.05, 0.08, "A"}
{0.07, 0.06, 0.09}
{0.02, 0.03, 0.04}

Saída Esperada:
Erro: Valor inválido encontrado na célula [0][2]

👉 Dica: Use try { Double.parseDouble(...) } catch(NumberFormatException e).*/

package Residencia.TratamentoDeExcecoes;

import java.util.Scanner;

public class Tratamento05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] valores = new double[3][3];

        System.out.println("Digite os valores financeiros (3 portfólios × 3 ativos):");

        try {
            for (int i = 0; i < valores.length; i++) {
                for (int j = 0; j < valores[i].length; j++) {
                    System.out.print("Portfólio " + (i + 1) + " - Ativo " + (j + 1) + ": ");
                    try {
                        String entrada = sc.next();
                        valores[i][j] = Double.parseDouble(entrada);
                    } catch (NumberFormatException e) {
                        System.out.printf("Erro: Valor inválido encontrado na célula [%d][%d]\n", i, j);
                        return; // encerra o programa
                    }
                }
            }

            calcularMedias(valores);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Matriz incompleta. Complete-a.");
        }

        sc.close();
    }

    public static void calcularMedias(double[][] valores) {
        for (int i = 0; i < valores.length; i++) {
            double soma = 0;
            for (int j = 0; j < valores[i].length; j++) {
                soma += valores[i][j];
            }
            double media = soma / valores[i].length;
            System.out.printf("Média do Portfólio %d: %.4f\n", i + 1, media);
        }
    }
}