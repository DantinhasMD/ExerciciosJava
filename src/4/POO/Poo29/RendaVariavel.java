package POO.Poo29;

public class RendaVariavel extends POO.Poo29.Investimento {
    public RendaVariavel(double valorAplicado){
        this.valorAplicado = valorAplicado;
    }
    @Override
    public double calcularRendimento(){
        this.valorAplicado *= 1.1;
        return valorAplicado;
    }
}