// Dado um vetor com as vendas diárias de um produto, identifique quantos dias tiveram vendas acima da média.
// Use diasAcimaMedia(int[] vendas), que retorna a quantidade de dias com vendas superiores à média.

package Residencia.Vetores.Basicos;
import java.util.ArrayList;
import  java.util.List;

public class Vetores03 {
    public static void main(String[] args) {
        List<Integer> qtdDias = diasAcimaMedia(new int[]{23,56,32,15,21,90,34,57,16,66});
        System.out.println(qtdDias);
    }

    public static List<Integer> diasAcimaMedia(int[] vendas) {
        int somaQtdDias = 0;
        List<Integer> diasSuperiores = new ArrayList<>();

        for (int i = 0; i < vendas.length; i++){
            somaQtdDias += vendas[i];
        }

        int valorMedio = (int) somaQtdDias / vendas.length;
        for (int i = 0; i < vendas.length; i++){
            if (vendas[i] > valorMedio){
                diasSuperiores.add(i + 1);
            }
        }

        return diasSuperiores;
    }
}
