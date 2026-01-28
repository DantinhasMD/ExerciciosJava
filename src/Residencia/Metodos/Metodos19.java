// Relatório de Desempenho (For + Switch) - Implemente um método `gerarRelatorio` que:
//- Recebe o número de meses (int) e um array com o total de vendas por mês (double[])
//- Usa um loop for para percorrer os meses e switch para classificar cada mês:
//- "Ótimo" - vendas > R$10.000
//- "Bom" - vendas > R$5.000
//- "Ruim" - vendas ≤ R$5.000
//- Exibe no console a classificação de cada mês no formato: "Mês X: Y" (onde Y é a
//classificação)

package Residencia.Metodos;

public class Metodos19 {
    public static void main(String[] args) {
        gerarRelatorio(6, new double[]{6056, 3200, 13567.89, 5000, 1000, 10000});
    }

    public static void gerarRelatorio(int meses, double[] vendasMensais) {
        for (int i = 0; i < vendasMensais.length; i++){
            if (vendasMensais[i] > 10000){
                System.out.printf("Mês %d: Ótimo\n", i + 1);
            } else if (vendasMensais[i] > 5000){
                System.out.printf("Mês %d: Bom\n", i + 1);
            } else {
                System.out.printf("Mês %d: Ruim\n", i + 1);
            }
        }
    }
}
