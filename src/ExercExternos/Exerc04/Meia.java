package ExercExternos.Exerc04;

public class Meia extends Ingresso {

    public Meia(double valor, String nome, boolean legendado){
        super(valor, nome, legendado);
    }

    @Override
    public double getValorReal() {
        return getValor() / 2;
    }
}
