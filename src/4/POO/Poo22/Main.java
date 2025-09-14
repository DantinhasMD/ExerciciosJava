/* Crie uma classe CarrinhoDeCompras com métodos sobrecarregados para calcular o valor
total de uma compra:
1. Um método que receba dois preços e retorne a soma simples.
2. Um método que receba dois preços e um valor de desconto percentual.

3. Um método que aceite um número indefinido de preços utilizando varargs
(double...).

Depois, desenvolva a classe MainCarrinhoDeCompras para testar os três métodos usando
diferentes exemplos de compras. */

package POO.Poo22;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras primeiro = new CarrinhoDeCompras();
        CarrinhoDeCompras segundo = new CarrinhoDeCompras();

        System.out.printf("%.2f\n",primeiro.somaCarrinho(1200, 200.5));
        System.out.printf("%.2f\n", segundo.somaCarrinho(1200, 200.5, 3));
    }
}
