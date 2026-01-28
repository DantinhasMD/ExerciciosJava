package Residencia.POO.Poo33;

public class PagamentoCartaoCredito implements Residencia.POO.Poo33.Pagamento {
    private double valor;

    @Override
    public  void processarPagamento(double valor) {
        this.valor = valor;
    }

    @Override
    public String getMetodo() {
        return "Pagamento de R$" + valor + " realizado no cartão de crédito.\n";
    }
}