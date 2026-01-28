// Uma matriz int[N][C] armazena as vendas totais de cada produto em diferentes categorias
//(ex.: mercado, bebidas, limpeza).
//Normalize os valores para que fiquem entre 0 e 1, dividindo cada valor pelo maior valor do
//respectivo produto.
//Métodos sugeridos:
//● int maximoCategoria(int[][] vendas, int produto)
//● double[][] normalizarVendas(int[][] vendas)

package Residencia.Vetores.Bidimensionais;

public class Vetores18 {
    public static void main(String[] args) {
        int[][] vendas = {
                {23, 15, 45, 9},
                {33, 35, 15, 8},
                {43, 25, 25, 12},
                {53, 45, 31, 17},
        };

        double[][] normalizacao = normalizarVendas(vendas);
        System.out.println("Normalização dos valores de cada Categoria:");
        for (int i = 0; i < normalizacao.length; i++){
            System.out.printf("Produto %d: ", i+1);
            for (int j = 0; j < normalizacao[i].length; j++){
                System.out.printf("%.2f ", normalizacao[i][j]);
            }
            System.out.println();
        }
    }

    public static int maximoCategoria(int[][] vendas, int produto) {
        int valorMaiorCategoria = 0;

        for (int i = 0; i < vendas[produto].length; i++){
            if (valorMaiorCategoria < vendas[produto][i]){
                valorMaiorCategoria = vendas[produto][i];
            }
        }
        return valorMaiorCategoria;
    }

    public static double[][] normalizarVendas(int[][] vendas) {
        double[][] valoresNormalizados = new double[vendas.length][vendas[0].length];

        for (int i = 0; i < vendas.length; i++){
            double maiorValor = maximoCategoria(vendas, i);

            for (int j = 0; j < vendas[i].length; j++){
                valoresNormalizados[i][j] = vendas[i][j] / maiorValor;
            }
        }
        return valoresNormalizados;
    }
}
