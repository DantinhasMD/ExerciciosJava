// Uma loja possui 5 produtos, e cada índice do vetor representa o total vendido no mês.
// Crie métodos: maisVendido(int[] produtos) → retorna o índice do produto mais vendido.
// menosVendido(int[] produtos) → retorna o índice do produto menos vendido.

package Residencia.Vetores.Basicos;

public class Vetores06 {
    public static void main(String[] args) {
        int maisVendidoProduto = maisVendido(new int[]{23,56,78,12,34});
        System.out.println(maisVendidoProduto);
        int menosVendidoProduto = menosVendido(new int[]{23,56,78,12,34});
        System.out.println(menosVendidoProduto);
    }

    public static int maisVendido(int[] produtos) {
        int prodMaisVendido = produtos[0];
        for (int i = 1; i < produtos.length; i++){
            if (produtos[i] > prodMaisVendido){
                prodMaisVendido = produtos[i];
            }
        }
        return prodMaisVendido;
    }

    public static int menosVendido(int[] produtos) {
        int prodMenosVendido = produtos[0];
        for (int i = 1; i < produtos.length; i++){
            if (produtos[i] < prodMenosVendido){
                prodMenosVendido = produtos[i];
            }
        }
        return prodMenosVendido;
    }
}
