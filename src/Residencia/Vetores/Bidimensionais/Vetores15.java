// A matriz int[N][D] registra as vendas diárias de cada produto. Produtos que venderam mais
//de um limite diário (ex: 10 unidades) em determinado dia devem ser marcados para
//reposição.
//Método sugerido:
//● int[][] produtosComReposicao(int[][] vendas, int limite) → retorna
//    uma matriz com 1 (reposição necessária) e 0 (estoque suficiente).

package Residencia.Vetores.Bidimensionais;

public class Vetores15 {
    public static void main(String[] args) {
        int[][] vendas = {
                {56, 7, 23, 4, 89},
                {6, 47, 21, 34, 9},
                {6, 7, 7, 4, 22}
        };

        int[][] matrizDeReposicao = produtosComReposicao(vendas, 10);
        for (int i = 0; i < matrizDeReposicao.length; i++){
            System.out.printf("Loja %d:", i + 1);
            for (int j = 0; j < matrizDeReposicao[i].length; j++){
                System.out.printf("%d ", matrizDeReposicao[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] produtosComReposicao(int[][] vendas, int limite) {
        int[][] matrizReposicao = new int[vendas.length][vendas[0].length];

        for (int i = 0; i < vendas.length; i++){
            for (int j = 0; j < vendas[i].length; j++){
                if (vendas[i][j] > limite){
                    matrizReposicao[i][j] = 1;
                } else {
                    matrizReposicao[i][j] = 0;
                }
            }
        }
        return matrizReposicao;
    }
}
