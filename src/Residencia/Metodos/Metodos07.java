// Crie um método simularCarteira() que recebe os valores iniciais de 3 ativos e seus retornos esperados. Retorna o valor final da carteira.
//Exemplo: Valores: {1000, 2000, 1500}, Retornos: {0.05, 0.03, 0.04} => Saída: 4670.0

package Residencia.Metodos;

public class Metodos07 {
    public static void main(String[] args) {
        simularCarteira(new double[]{1000,2000,1500}, new double[]{0.05,0.03,0.04});
    }

    public static void simularCarteira(double[] valores, double[] retornos) {
        double total = 0;
        for (int i = 0; i < valores.length; i++) {
            double valorFinal = valores[i] *  (1 + retornos[i]);
            total += valorFinal;
        }
        System.out.printf("Valor Final: R$%.2f", total);
    }
}
