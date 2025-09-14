// Uma matriz int[L][D] armazena a quantidade de produtos devolvidos em
// cada loja ao longo de vários dias.
//Descubra qual loja teve o maior número total de devoluções.
//Métodos sugeridos:
//● int totalDevolucoesLoja(int[][] devolucoes, int loja)
//● int lojaMaisDevolucoes(int[][] devolucoes)

package Vetores.Bidimensionais;

public class Vetores20 {
    public static void main(String[] args) {
        int[][] devolucoes = {
                {12, 25, 13, 9},
                {2, 5, 13, 19},
                {12, 5, 7, 4},
                {2, 15, 17, 3, 8},
        };

        System.out.printf("Total de Devoluções da loja: %02d\n", totalDevolucoesLoja(devolucoes, 2));
        System.out.printf("A loja com mais devoluções é a %02d\n", lojaMaisDevolucoes(devolucoes));
    }

    public static int totalDevolucoesLoja(int[][] devolucoes, int loja) {
        int totalDevolucoes = 0;

        for (int i = 0; i < devolucoes[loja - 1].length; i++){
            totalDevolucoes += devolucoes[loja - 1][i];
        }


        return totalDevolucoes;
    }

    public static int lojaMaisDevolucoes(int[][] devolucoes) {
        int maiorValor = 0;
        int maiorIndice = 0;

        for (int i = 0; i < devolucoes.length; i++){
           for(int j = 0; j < devolucoes[i].length; j++){
               if (devolucoes[i][j] > maiorValor){
                   maiorValor = devolucoes[i][j];
                   maiorIndice = i;
               }
           }
        }

        return maiorIndice + 1;
    }
}
