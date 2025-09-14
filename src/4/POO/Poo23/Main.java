/* Crie uma classe Pagamento com:
● Atributo valor (double).

● Método processarPagamento() que exibe "Processando pagamento genérico".

Depois, crie duas subclasses:
● PagamentoCartaoCredito (contendo numeroCartao e sobrescrevendo processarPagamento() para exibir
mensagem de pagamento no cartão).

● PagamentoPix (contendo chavePix e sobrescrevendo processarPagamento() para exibir mensagem de
pagamento via Pix).

No Main, crie um vetor de Pagamento com diferentes objetos e percorra chamando
processarPagamento() em cada um. */

package POO.Poo23;

public class Main {
    public static void main(String[] args) {
        PagamentoCartaoCredito primeiro = new PagamentoCartaoCredito(233.45, 1234564);
        primeiro.processarPagamento();

        PagamentoPix segundo = new PagamentoPix(233.45, "1234564");
        segundo.processarPagamento();
    }
}
