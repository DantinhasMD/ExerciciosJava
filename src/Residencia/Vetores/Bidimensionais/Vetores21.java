/* Crie um método para preencher uma matriz 2x2 com receitas e
despesas. Depois, crie um método que calcule a soma total de todos os
elementos da matriz.
void preencherMatriz(double[][] matriz);
double calcularSomaTotal(double[][] matriz); */

package Residencia.Vetores.Bidimensionais;

import java.util.Scanner;

public class Vetores21 {
    public static void main(String[] args) {
        double[][] matriz = new double[2][2];

        preencherMatriz(matriz);


        System.out.printf("Total da Matriz: R$%.2f", calcularSomaTotal(matriz));
        
    }

    public static void preencherMatriz(double[][] matriz) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Digite o valor para a posição [%d][%d]: R$", i, j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        
    }

    public static double calcularSomaTotal(double[][] matriz) {
        double somaTotal = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaTotal += matriz[i][j];
            }
        }

        return somaTotal;
    }

}
