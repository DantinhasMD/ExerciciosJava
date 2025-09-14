package POO.Poo24;

public class CDB extends Investimento{
    public CDB(double valorRendimento){
        super(valorRendimento);
    }

    @Override
    public double calcularRendimento(){
        return (getValorAplicado() * 0.01) + getValorAplicado();
    }
}
