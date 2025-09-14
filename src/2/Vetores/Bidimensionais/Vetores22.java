/* Dada uma matriz 3x4 que representa dívidas mensais de 3 clientes em 4
meses, crie um método para encontrar o maior valor da matriz.
double encontrarMaiorValor(double[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores22 {
    public static void main(String[] args) {
        double[][] matriz = {
                {46.55, 33.89, 122.99, 12.22},
                {66.55, 83.89, 22.99, 33.22},
                {16.55, 3.89, 888.99, 39.22}
        };

        System.out.printf("O Maior valor da Matriz é R$%.2f", encontrarMaiorValor(matriz));
    }

    public static double encontrarMaiorValor(double[][] matriz) {
        double maiorValor = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                }
            }
        }
        return maiorValor;
    }
}
