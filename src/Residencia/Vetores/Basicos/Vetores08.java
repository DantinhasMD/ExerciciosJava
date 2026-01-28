// Receba dois vetores com as vendas diárias de dois produtos diferentes durante 7 dias.
// Crie produtoComMaisDiasLideranca(int[] produtoA, int[] produtoB), que retorna qual produto
// liderou mais dias em vendas.

package Residencia.Vetores.Basicos;

public class Vetores08 {
    public static void main(String[] args) {
        produtoComMaisDiasLideranca(new int[]{23,67,12,15,12}, new int[]{45,80,12,13,24});
    }

    public static void produtoComMaisDiasLideranca(int[] produtoA, int[] produtoB) {
        int pontosA = 0;
        int pontosB = 0;

        for (int i = 0; i < produtoA.length; i++){
            if (produtoA[i] > produtoB[i]){
                pontosA += 1;
            } else if (produtoB[i] > produtoA[i]){
                pontosB += 1;
            }
        }

        if (pontosA > pontosB){
            System.out.println("O Produto A foi o mais vendido!");
        } else if (pontosB > pontosA){
            System.out.println("O Produto B foi o mais vendido!");
        }
    }
}
