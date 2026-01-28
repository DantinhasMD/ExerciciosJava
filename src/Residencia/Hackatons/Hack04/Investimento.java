abstract class Investimento {
    protected double valorInicial;

    public Investimento(double valorInicial) {
      this.valorInicial = valorInicial;
    }

    public abstract double calcularRendimento(double valorInicial);
}
