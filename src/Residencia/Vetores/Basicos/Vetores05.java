// Receba um vetor com vendas de 10 dias e identifique a primeira sequência de 3 dias com vendas
// em crescimento consecutivo.
// Use primeiraSequenciaCrescente(int[] vendas), que retorna os índices da sequência ou null se não houver.

package Residencia.Vetores.Basicos;
import java.util.List;
import java.util.ArrayList;

public class Vetores05 {
  public static void main(String[] args) {
      List<Integer> primeiraSequencia = primeiraSequenciaCrescente(new int[]{13,14,11,21,3,2,73,25,38,44,88,23});
      System.out.println(primeiraSequencia);
  }

  public static List<Integer> primeiraSequenciaCrescente(int[] vendas) {
      List<Integer> sequencia = new ArrayList<>();

      for (int i = 0; i < vendas.length - 2; i++) {
          if (vendas[i] < vendas[i + 1] && vendas[i + 1] < vendas[i + 2]) {
              sequencia.add(vendas[i]);
              sequencia.add(vendas[i + 1]);
              sequencia.add(vendas[i + 2]);
              return sequencia;
          }
      }

      return null;
  }
}
