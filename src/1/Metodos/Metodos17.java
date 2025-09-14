// Promoção Relâmpago (For + If) - Desenvolva um método `aplicarPromocao` que:
//- Recebe o preço original de um produto (double)
//- Usa um loop for para simular 7 dias de promoção com redução diária de 5% no preço
//- A cada dia deve exibir o preço atualizado no formato: "Dia X: R$Y.YY"
//- Retorna o preço final após os 7 dias

package Metodos;

public class Metodos17 {
    public static void main(String[] args) {
        double precoFinal = aplicarPromocao(100);
        System.out.printf("Preço Final: R$%.2f\n", precoFinal);

    }

    public static double aplicarPromocao(double precoOriginal) {
        double precoAtual = precoOriginal;

        for (int i = 1; i <= 7; i++) {
            precoAtual -= precoAtual * 0.05;
            System.out.printf("Dia %d: R$%.2f\n", i, precoAtual);
        }

        return precoAtual;
    }
}
