/* Interface:
public interface Pagamento {
void processarPagamento(double valor);
String getMetodo();
}
Classes a implementar:
● PagamentoCartaoCredito → imprime “Pagamento de X realizado no cartão de
crédito”.
● PagamentoBoleto → imprime “Pagamento de X realizado via boleto bancário”.
No Main:
● Criar um array/lista de Pagamento.
● Processar R$ 200 no cartão e R$ 350 no boleto.
● Mostrar o método de pagamento usado. */

package Residencia.POO.Poo33;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo33.Pagamento primeiro = new Residencia.POO.Poo33.PagamentoCartaoCredito();
        Residencia.POO.Poo33.Pagamento segundo = new Residencia.POO.Poo33.PagamentoBoleto();

        primeiro.processarPagamento(200);
        segundo.processarPagamento(350);

        System.out.printf(primeiro.getMetodo());
        System.out.printf( segundo.getMetodo());

    }
}
