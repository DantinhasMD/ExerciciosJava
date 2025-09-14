public class RendaVariavel extends Investimento {
    public RendaVariavel(double valorInicial){
       super(valorInicial);
    }
    //Método para Calcular Rendimento
    @Override
    public double calcularRendimento(double valorInicial){
        return valorInicial * 1.10;
    }
}
