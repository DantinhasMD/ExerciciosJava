// Uma matriz double[L][D] armazena os valores movimentados no caixa de cada loja ao
//longo dos dias.
//Determine qual loja teve o maior total arrecadado.
//Métodos sugeridos:
//● double totalCaixaLoja(double[][] transacoes, int loja)
//● int lojaMaiorArrecadacao(double[][] transacoes)

package Residencia.Vetores.Bidimensionais;

public class Vetores16 {
    public static void main(String[] args) {
        double[][] transacoes = {
                {767.89, 456.78, 333.99, 698.98},
                {17.89, 256.78, 433.99, 898.98},
                {77.89, 46.78, 33.99, 98.98}
        };

        System.out.printf("Total Movimentado na Loja R$%.2f\n", totalCaixaLoja(transacoes, 0));
        System.out.printf("Total Movimentado na Loja R$%.2f\n", totalCaixaLoja(transacoes, 1));
        System.out.printf("Total Movimentado na Loja R$%.2f\n", totalCaixaLoja(transacoes, 2));

        System.out.printf("Loja com Maior Movimentação: %02d\n", lojaMaiorArrecadacao(transacoes));
    }

    public static double totalCaixaLoja(double[][] transacoes, int loja) {
        double somaValor = 0;

        for (int i = 0; i < transacoes[loja].length; i++){
            somaValor += transacoes[loja][i];
        }
        return somaValor;
    }

    public static int lojaMaiorArrecadacao(double[][] transacoes) {
        int maiorIndice = 0;
        double maiorValor = 0;

        for (int i = 0; i < transacoes.length; i++){
            if (maiorValor < totalCaixaLoja(transacoes, i)){
                maiorValor = totalCaixaLoja(transacoes, i);
                maiorIndice = i;
            }
        }
        return maiorIndice + 1;
    }
}
