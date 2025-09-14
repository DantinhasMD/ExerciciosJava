package POO.Poo18;

public class TransferenciaBancaria extends Transacao{
    private String contaOrigem;
    private String contaDestino;

    public TransferenciaBancaria(String id, double valor, String data, String contaOrigem, String contaDestino){
        super(id, valor, data);
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    // Getters
    public String getContaOrigem() {
        return contaOrigem;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    // Setters
    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public void setContaOrigem(String contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public void resumoTransferencia(){
        System.out.printf("Transferência de R$%.2f de Conta-%s para Conta-%s na data de %s", getValor(), getContaOrigem(), getContaDestino(), getData());
    }

}
