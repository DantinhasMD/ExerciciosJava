package POO.Poo34;

public class TesouroDireto implements POO.Poo34.Investimento {
    private double valor;
    private int meses;

    @Override
    public double calcularRetorno(double valor, int meses){
        this.valor = valor;
        this.meses = meses;
        return valor + ((valor * 0.007) * meses);
    }

    @Override
    public String getNomeInvestimento(){
        return "Tesouro Direto: Investimento de R$" + valor + " terá retorno de R$" + calcularRetorno(valor, meses) + "\n";
    }
}
