// A meta diária de vendas de um produto é de 80 unidades.
// Crie métodos: diasMetaAtingida(int[] vendas) → retorna quantos dias a meta foi atingida ou superada.
// percentualMetaAtingida(int[] vendas) → retorna o percentual de dias com meta alcançada.

package Residencia.Vetores.Basicos;

public class Vetores07 {
    public static void main(String[] args) {
        int diasAtingidos = diasMetaAtingida(80, new int[]{23,85,12,86,28,14,17});
        double percentual = percentualMetaAtingida(80, new int[]{23,85,12,86,28,14,17});
    }

    public static int diasMetaAtingida(int meta, int[] vendas) {
        int diasComMeta = 0;

        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] >= meta) {
                diasComMeta++;
            }
        }

        return diasComMeta;
    }

    public static double percentualMetaAtingida(int meta, int[] vendas) {
        int diasComMeta = diasMetaAtingida(meta, vendas);
        int totalDias = vendas.length;

        double percentual = (diasComMeta * 100.0) / totalDias;

        return percentual;
    }
}
