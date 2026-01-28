package Residencia.POO.Poo33;

public class PagamentoBoleto implements Residencia.POO.Poo33.Pagamento {
    private double valor;

    @Override
    public void processarPagamento(double valor) {
        this.valor = valor;
    }

    @Override
    public String getMetodo() {
        return "Pagamento de R$" + valor + " realizado via boleto bancário”.\n";
    }
}
