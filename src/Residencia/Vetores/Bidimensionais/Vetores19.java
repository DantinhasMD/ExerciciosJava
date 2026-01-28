// Com base em uma matriz int[N][M] de vendas e um vetor double[N] com os preços
//unitários dos produtos, identifique qual produto gerou maior faturamento no período.
//Métodos sugeridos:
//● double rentabilidadeProduto(int[][] vendas, double[] precos, int produto)
//● int produtoMaisRentavel(int[][] vendas, double[] precos)

package Residencia.Vetores.Bidimensionais;

public class Vetores19 {
    public static void main(String[] args) {
        int[][] vendas = {
                {23, 15, 45, 9},
                {33, 35, 15, 8},
                {43, 25, 25, 12},
                {53, 45, 31, 17},
        };

        double[] precos = {3.78, 5.65, 2.49, 3.19};

        System.out.printf("Rentabilidade do produto: R$%.2f\n", rentabilidadeProduto(vendas, precos, 4));
        System.out.printf("O Produto mais rentavél é o %02d\n", produtoMaisRentavel(vendas, precos));
    }

    public static double rentabilidadeProduto(int[][] vendas, double[] precos, int produto) {
        double rentabilidade = 0;

        for (int i = 0; i < vendas[produto - 1].length; i++){
            for (int j = 0; j < precos.length; j++){
                rentabilidade += vendas[produto - 1][j] * precos[j];
            }
        }
        return rentabilidade;
    }

    public static int produtoMaisRentavel(int[][] vendas, double[] precos) {
        double maiorValor = 0;
        int maiorIndice = 0;


        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                for (int k = 0; k < precos.length; k++){
                    double valor = vendas[i][j] * precos[k];
                    if (maiorValor < valor){
                        maiorValor = valor;
                        maiorIndice = i;
                    }
                }
            }
        }

        return maiorIndice + 1;
    }
}
