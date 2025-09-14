package POO.Poo23;

public class PagamentoPix extends Pagamento{
    private String chavePix;

    public PagamentoPix(double valor, String chavePix){
        super(valor);
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento no PIX!\n");
    }
}
