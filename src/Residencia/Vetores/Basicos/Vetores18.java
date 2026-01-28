/*Crie um programa que: Receba vetores com os preços de compra e de venda
de 5 ativos. Use os métodos:
○ lucroPorAtivo(double[] compra, double[] venda) → retorna um
vetor com o lucro ou perda de cada ativo.
○ lucroTotal(double[] compra, double[] venda) → retorna o lucro total.
○ calcularImposto(double lucroTotal) → retorna o imposto devido (0 se não ultrapassar R$ 20.000). */

package Residencia.Vetores.Basicos;

public class Vetores18 {
    public static void main(String[] args) {
        double[] compra = {7250.67, 3408.56, 1106.98, 2000.89, 1745.65};
        double[] venda = {9854.67, 5414.56, 7419.98, 8229.89, 6211.65};

        double[] lucroDeCadaAtivo = lucroPorAtivo(compra, venda);
        for (int i = 0; i < compra.length; i++){
            System.out.printf("Lucro %02d ativo: R$%.2f\n", i+1, lucroDeCadaAtivo[i]);
        }

        double totalLucro = lucroTotal(compra, venda);
        System.out.printf("Total de Lucro: R$%.2f\n", totalLucro);

        double valorImposto = calcularImposto(totalLucro);
        System.out.printf("Valor do Imposto: %.2f\n", valorImposto);
    }

    public static double[] lucroPorAtivo(double[] compra, double[] venda) {
        double[] lucroPorAtivo = new double[compra.length];

        for (int i = 0; i < compra.length; i++){
            lucroPorAtivo[i] = venda[i] - compra[i];
        }

        return lucroPorAtivo;
    }

    public static double lucroTotal(double[] compra, double[] venda) {
        double[] listaLucros = lucroPorAtivo(compra, venda);
        double lucroTotal = 0;

        for (int i = 0; i < listaLucros.length; i++){
            lucroTotal += listaLucros[i];
        }

        return lucroTotal;
    }

    public static double calcularImposto(double lucroTotal) {
        if (lucroTotal < 20000){
            return 0;
        } else {
            return lucroTotal * 0.15;
        }
    }
}
