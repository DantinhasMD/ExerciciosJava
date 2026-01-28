// Dado um vetor com as vendas totais de 10 produtos no mês, identifique quais venderam menos
//de 20 unidades.
// Use produtosBaixaVenda(int[] vendas), que retorna um vetor com os índices desses produtos.

package Residencia.Vetores.Basicos;

import java.util.ArrayList;
import java.util.List;

public class Vetores10 {
    public static void main(String[] args) {
        System.out.println(produtosBaixaVenda(new int[]{12,24,54,20,31,7,78,21,2,19}));
    }

    public static List<Integer> produtosBaixaVenda(int[] vendas) {
        List<Integer> vetoresDeVendasMenoresQueVinte = new ArrayList<>();

        for (int i = 0; i < vendas.length; i++){
            if (vendas[i] > 20){
                vetoresDeVendasMenoresQueVinte.add(i);
            }
        }
        return vetoresDeVendasMenoresQueVinte;
    }
}
