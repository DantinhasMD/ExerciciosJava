// Simulação de Parcelamento com For - Crie um método `exibirParcelas` que:
//- Recebe o valor total da compra (double) e o número de parcelas (int)
//- Usa um loop for para calcular e exibir cada parcela com juros de 1% ao mês (juros
//compostos)
//- Deve exibir no console cada parcela no formato: "Parcela X: R$Y.YY"
//- Não é necessário retornar valor, apenas exibir as parcelas

package Residencia.Metodos;

public class Metodos14 {
    public static void main(String[] args) {
        exibirParcelas(15, 15);
        exibirParcelas(3789.98, 17);
    }

    public static void exibirParcelas(double compra, int parcelas) {
        for (int i = 1; i <= parcelas; i++) {
            double valorParcela = (compra * Math.pow(1.01, i)) / parcelas;
            System.out.printf("Parcela %02d: R$%.2f\n", i, valorParcela);
        }
    }
}
