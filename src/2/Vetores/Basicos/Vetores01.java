// Uma loja registrou a quantidade de vendas de um produto durante 10 dias.
// Crie métodos para: diaMaisVendido(int[] vendas) → retorna o índice (dia) com a maior venda.
// diaMenosVendido(int[] vendas) → retorna o índice com a menor venda.

package Vetores.Basicos;

public class Vetores01 {
    public static void main(String[] args) {
        diaMaisVendido(new int[]{23,9,45, 57,33, 35, 89,13,15});
    }

    public static void diaMaisVendido(int[] vendas) {
        int valorMaisAlto = 0;
        int diaComMaiorValor = 0;
        for (int i = 0; i < vendas.length; i++){
            if (valorMaisAlto < vendas[i]){
                valorMaisAlto = vendas[i];
                diaComMaiorValor = i;
            }
        }
        System.out.printf("Dia mais vendido: %02d e Qtd de Vendas: %02d", diaComMaiorValor + 1, valorMaisAlto );
    }

}
