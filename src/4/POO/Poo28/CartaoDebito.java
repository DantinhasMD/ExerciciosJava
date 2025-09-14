package POO.Poo28;

public class CartaoDebito extends POO.Poo28.Cartao {
    private double saldo;

    public CartaoDebito(int numero, double limite, double saldo){
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }
    @Override
    public void processarCompra(double valor){
        if (valor < saldo){
            this.saldo -= valor;
            System.out.println(saldo);
        } else {
            System.out.println("Saldo Indisponível.");
        }

    }
}
