package ExercExternos.Exerc04;

public class Familia extends Ingresso {
    private int qtdPessoas;

    public Familia(double valor, String nome, boolean legendado, int qtdPessoas){
        super(valor, nome, legendado);
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double getValorReal() {
        double valorFinal = qtdPessoas * getValor();
        if (qtdPessoas > 3) {
            valorFinal *= 0.95; // 5% de desconto
        }
        return valorFinal;
    }
}
