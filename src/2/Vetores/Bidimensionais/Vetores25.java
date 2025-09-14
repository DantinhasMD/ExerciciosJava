/* Crie um método que calcule a média geral de vendas numa matriz 3x3 e
outro que calcule a soma total de vendas por vendedor (soma das linhas).
double calcularMediaTotal(double[][] matriz);
double[] somarVendasPorVendedor(double[][] matriz); */

package Vetores.Bidimensionais;

public class Vetores25 {
    public static void main(String[] args) {
        double[][] matriz = {
                {46.55, 33.89, 122.99},
                {66.55, 83.89, 22.99},
                {1, 3, 6}
        };

        System.out.printf("Média Total: R$%.2f\n", calcularMediaTotal(matriz));


        double[] somasVendedor = somarVendasPorVendedor(matriz);
        for (int i = 0; i < matriz.length; i++){
            System.out.printf("Cliente %d: R$%.2f\n", i + 1, somasVendedor[i]);
        }

    }

    public static double calcularMediaTotal(double[][] matriz) {
        double[] mediaLinhas = new double[matriz.length];
        double somaTotal = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                somaTotal += matriz[i][j];
            }
            mediaLinhas[i] = somaTotal/matriz[i].length;
        }

        for (int i = 0; i < mediaLinhas.length; i++){
            somaTotal += mediaLinhas[i];
        }
        double mediaTotal = somaTotal/mediaLinhas.length;

        return mediaTotal;
    }

    public static double[] somarVendasPorVendedor(double[][] matriz) {
        double[] somasClientes = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++){
            double valorTotal = 0;
            for (int j = 0; j < matriz[i].length; j++){
                valorTotal += matriz[i][j];
            }
            somasClientes[i] = valorTotal;
        }

        return somasClientes;
    }
}
