// Cada linha da matriz double[F][M] representa a evolução mensal da cota de um fundo
// de investimento ao longo de M meses.
// Métodos a implementar:
// double rentabilidade(double[][] fundos, int fundo) – retorna a variação percentual do fundo entre
//    o 1o e o último mês.
// int fundoMaisRentavel(double[][] fundos) – retorna o índice do fundo com maior rentabilidade.

package Vetores.Bidimensionais;

public class Vetores03 {
    public static void main(String[] args) {
        double[][] fundos = {
                {2.45, 3.25, 4.12},
                {1.4, 3.2, 0.1},
                {0.45, 0.25, 2.12}
        };

        System.out.printf("%.2f\n", rentabilidade(fundos, 1));
        System.out.println(fundoMaisRentavel(fundos));

    }

    public static double rentabilidade(double[][] fundos, int fundo) {
        double primeiroValor = fundos[fundo][0];
        double ultimoValor = fundos[fundo][fundos[fundo].length -1];

        return ((ultimoValor - primeiroValor) * 100) / primeiroValor;
    }

    public static int fundoMaisRentavel(double[][] fundos) {
        double valorMaisAlto = 0;
        int maiorIndice = 0;

        for (int i = 0; i < fundos.length; i++){
            if (rentabilidade(fundos, i) > valorMaisAlto) {
                valorMaisAlto = rentabilidade(fundos, i);
                maiorIndice = i;
            }
        }

        return maiorIndice;
    }
}
