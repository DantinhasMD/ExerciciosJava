/* Validação de Planilha de Riscos
Crie um programa para validar uma planilha de riscos (matriz 5x5) com valores entre 0 e 1.
- Se a matriz estiver incompleta, trate ArrayIndexOutOfBoundsException.
- Se algum valor estiver fora do intervalo [0, 1], exiba mensagem de erro.

Exemplo de Entrada:
{0.2, 0.5, 1.1, 0.4, 0.3}
{0.7, 0.9, 0.1, 0.6, 0.8}
...

Saída Esperada:
Erro: Valor inválido encontrado na célula [0][2]: 1.1

👉 Dica: Use if (valor < 0 || valor > 1) para validar. */

package Residencia.TratamentoDeExcecoes;

import java.util.Scanner;

public class Tratamento03 {
    public static void verificarValores(double[][] valores){
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[i].length; j++) {
                double valor = valores[i][j];
                if (valor < 0 || valor > 1) {
                    System.out.printf("Erro: Valor inválido encontrado na célula [%d][%d]: %.1f\n", i,j, valor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] valores = new double[2][5];

        System.out.println("Digite os valores da planilha de riscos:");

        try {
            for (int i = 0; i < valores.length; i++) {
                for (int j = 0; j < valores[i].length; j++){
                    System.out.print("Tabela " + (i + 1) + "-Coluna  " + (j + 1) + ": ");
                    double entrada = sc.nextDouble();
                    valores[i][j] = entrada;
                }
            }

            verificarValores(valores);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Matriz Incompleta. Complete-a.");
        }

        sc.close();
    }
}
