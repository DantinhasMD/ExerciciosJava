package POO.Poo19;

public class ClienteVip extends POO.Poo19.Cliente {
    private int nivel;
    private double descontoPercentual;

    public ClienteVip(String nome, String cpf, int nivel, double descontoPercentual){
        super(nome, cpf);
        this.nivel = nivel;
        this.descontoPercentual = descontoPercentual;
    }

    public int getNivel() {
        return nivel;
    }

    public double getDescontoPercentual() {
        return descontoPercentual;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setDescontoPercentual(double descontoPercentual) {
        this.descontoPercentual = descontoPercentual;
    }

    public double calcularPrecoComDesconto(double preco){
        return preco * (1 - getDescontoPercentual()/100);
    }
}
