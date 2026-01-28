public class RendaFixa extends Investimento {
    public RendaFixa(double valorInicial){
        super(valorInicial);
    }
    //Método para Calcular Rendimento
    @Override
    public double calcularRendimento(double valorInicial){
        return valorInicial * 1.05;
    }
}
