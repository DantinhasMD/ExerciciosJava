/* Dada uma matriz 3x2 com quantidade de produtos vendidos por
vendedor e mês, crie um método para somar o total vendido por mês
(soma das colunas).
int[] somarVendasPorMes(int[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores28 {
    public static void main(String[] args) {
        int[][] matriz = {
                {36, 122},
                {66, 10022},
                {99, 224}
        };

        int[] vendasPorMes = somarVendasPorMes(matriz);
        for (int i = 0; i < vendasPorMes.length; i++) {
            System.out.println("Mês " + (i + 1) + ": " + vendasPorMes[i]);
        }
    }

    public static int[] somarVendasPorMes(int[][] matriz) {
        int[] somaDosMeses = new int[matriz[0].length];

            for(int i = 0; i < matriz[0].length; i++){
                int valorTotalMes = 0;
                for (int j = 0; j < matriz.length; j++){
                    valorTotalMes += matriz[j][i];
                }
                somaDosMeses[i] = valorTotalMes;
            }
        return somaDosMeses;
    }
}
