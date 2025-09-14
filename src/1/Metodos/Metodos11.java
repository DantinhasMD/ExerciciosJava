// Cálculo de Desconto Progressivo - Crie um método chamado `calcularDesconto` que recebe o valor total
//  de uma compra (double) e retorna o valor com desconto aplicado conforme as seguintes regras:
//- 5% de desconto para compras de até R$100,00
//- 10% de desconto para compras acima de R$100,00 até R$500,00
//- 15% de desconto para compras acima de R$500,00

package Metodos;

public class Metodos11 {
    public static void main(String[] args) {
        calcularDesconto(100);
        calcularDesconto(1000);
        calcularDesconto(20);
        calcularDesconto(101);
        calcularDesconto(500);
        calcularDesconto(501);
        calcularDesconto(377);
    }

    public static void calcularDesconto(double compra) {
            double desconto;
        if (compra < 100) {
            desconto = compra * 0.95;
            System.out.printf("Valor das compras com Desconto R$%.2f\n", desconto);
        } else if (compra < 500) {
            desconto = compra * 0.9;
            System.out.printf("Valor das compras com Desconto R$%.2f\n", desconto);
        } else {
            desconto = compra * 0.85;
            System.out.printf("Valor das compras com Desconto R$%.2f\n", desconto);
        }

    }
}
