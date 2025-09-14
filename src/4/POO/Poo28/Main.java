/* Crie a classe abstrata Cartao com atributos numero e limite e o
método abstrato void processarCompra(double valor).
● Crie as subclasses:
○ CartaoCredito → compra reduz do limite disponível.
○ CartaoDebito → compra reduz diretamente do saldo (atributo
adicional saldoConta).

● No Main, simule compras nos dois tipos de cartão e mostre os
saldos/limites finais. */

package POO.Poo28;

public class Main {
    public static void main(String[] args) {
        POO.Poo28.Cartao primeiro = new POO.Poo28.CartaoCredito(12345, 100);
        POO.Poo28.Cartao segundo = new POO.Poo28.CartaoDebito(12344, 100, 30);

        primeiro.processarCompra(100);
        segundo.processarCompra(100);
        segundo.processarCompra(29);

    }
}
