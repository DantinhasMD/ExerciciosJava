// Uma loja faz reposição quando as vendas ultrapassam 50 unidades no dia.
// Use diasReposicao(int[] vendas), que retorna um vetor com os dias que exigiram reposição de estoque.

package Residencia.Vetores.Basicos;

import java.util.ArrayList;
import java.util.List;

public class Vetores04 {
    public static void main(String[] args) {
        List<Integer> dias = diasReposicao(new int[]{23,67,98,13,15,50,54,12,76,68,87,23});
        System.out.println(dias);
    }

    public static List<Integer> diasReposicao(int[] vendas) {
        List<Integer> diasComReposicao = new ArrayList<>();

        for (int i = 0; i < vendas.length; i++){
            if (vendas[i] > 50){
                diasComReposicao.add(i + 1);
            }
        }
        return diasComReposicao;
    }
}
