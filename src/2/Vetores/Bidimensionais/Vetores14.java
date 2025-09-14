// Uma rede varejista registra as vendas diárias de cada loja em uma matriz int[L][D], onde
//cada linha representa uma loja.
//Calcule a média de vendas por loja no período.
//Método sugerido:
//● double[] mediaVendasPorLoja(int[][] vendas)

package Vetores.Bidimensionais;

public class Vetores14 {
    public static void main(String[] args) {
        int[][] vendas = {
                {55, 78, 34, 22},
                {65, 18, 55, 42},
                {12, 38, 84, 59},
        };

        double[] matrizVendas = mediaVendasPorLoja(vendas);
        for (int i = 0; i < matrizVendas.length; i++){
            System.out.printf("Loja %d: média de vendas = %.2f%n", i + 1, matrizVendas[i]);
        }
    }

    public static double[] mediaVendasPorLoja(int[][] vendas) {
        double[] matrizDeMedias = new double[vendas.length];


        for (int i = 0; i < vendas.length; i++){
            double soma = 0;
            int contador = 0;
            for (int j = 0; j < vendas[i].length; j++){
                soma += vendas[i][j];
                contador++;
            }
            matrizDeMedias[i] = soma/contador;
        }
        return matrizDeMedias;
    }
}
