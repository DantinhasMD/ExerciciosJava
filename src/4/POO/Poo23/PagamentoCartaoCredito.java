package POO.Poo23;

public class PagamentoCartaoCredito extends Pagamento{
    private int numeroCartao;

    public PagamentoCartaoCredito(double valor, int numeroCartao){
        super(valor);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento no Cartão de Crédito!\n");
    }
}
