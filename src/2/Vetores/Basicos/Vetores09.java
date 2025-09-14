// Um vetor contém as vendas totais de 8 produtos.
// Use ordenarProdutosPorVenda(int[] vendas), que retorna um novo vetor ordenado do mais
// vendido para o menos vendido.

package Vetores.Basicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Vetores09 {
    public static void main(String[] args) {
        ordenarProdutosPorVenda(new int[]{23,45,12,78,10,22,63,5});
    }

    public static List<Integer> ordenarProdutosPorVenda(int[] vendas) {
        List<Integer> numerosOrdenados = new ArrayList<>();

        for (int venda: vendas){
            numerosOrdenados.add(venda);
        }
        numerosOrdenados.sort(Collections.reverseOrder());

        return numerosOrdenados;
    }
}
