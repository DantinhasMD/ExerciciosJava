package POO.Poo29;

public class RendaFixa extends POO.Poo29.Investimento {
    public RendaFixa(double valorAplicado){;
        this.valorAplicado = valorAplicado;
    }
    @Override
    public double calcularRendimento(){
        this.valorAplicado *= 1.05;
        return valorAplicado;
    }
}
