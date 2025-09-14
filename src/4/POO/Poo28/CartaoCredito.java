package POO.Poo28;

public class CartaoCredito extends POO.Poo28.Cartao {
    public CartaoCredito(int numero, double limite){
        this.numero = numero;
        this.limite = limite;
    }
    @Override
    public void processarCompra(double valor){
        this.limite -= valor;
        System.out.println(limite);
    }
}
