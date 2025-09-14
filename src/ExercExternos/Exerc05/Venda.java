package ExercExternos.Exerc05;

public class Venda {
    private String nomeVendedor;
    private int numero;
    private double valor;
    private static int contador = 1; //IDs para as vendas
    private boolean pago;

    public Venda(String nomeVendedor, double valor) {
        this.nomeVendedor = nomeVendedor;
        this.numero = contador++;
        this.valor = valor;
        this.pago = false;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    @Override //Filha da classe Object
    public String toString() {
        return nomeVendedor + ": Venda " + numero + " - R$ " + valor;
    }

    public void receberPagamento() {
        this.pago = true;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
