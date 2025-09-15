package ExercExternos.Exerc05;

public class Venda {
    private String nomeVendedor;
    private int numero;
    private double valor;
    private int dia;
    private static int contador = 1; //IDs para as vendas
    private boolean pago;

    public Venda(String nomeVendedor, double valor) {
        this.nomeVendedor = nomeVendedor;
        this.numero = contador++;
        this.valor = valor;
        this.pago = false;
        this.dia = 0;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    @Override //Filha da classe Object
    public String toString() {
        return nomeVendedor + ": Venda " + numero + " - R$ " + valor  + (dia > 0 ? " (Dia " + dia + ")" : "");
    }

    public void receberPagamento(int diaAtual) {
        this.pago = true;
        this.dia = diaAtual;
    }

    public boolean isPago() {
        return pago;
    }

    public int getDia() {
        return dia;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
