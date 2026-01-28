// Receba um vetor com as quantidades de um produto vendidas em 7 dias.
// Use mediaVendas(int[] vendas), que retorna a média de vendas no período.

package Residencia.Vetores.Basicos;

public class Vetores02 {
    public static void main(String[] args) {
        int valorFinal = mediaVendas(new int[]{23,35,67,15,18,29,41});
        System.out.println(valorFinal);
    }

    public static int mediaVendas(int[] vendas) {
        int somaQtds = 0;
        for (int i = 0; i < vendas.length; i++){
           somaQtds += vendas[i];
        }

        return (int) somaQtds / vendas.length;
    }
}
