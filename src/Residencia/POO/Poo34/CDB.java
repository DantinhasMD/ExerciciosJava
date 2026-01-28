package Residencia.POO.Poo34;

public class CDB implements Residencia.POO.Poo34.Investimento {
    private double valor;
    private int meses;

    @Override
    public double calcularRetorno(double valor, int meses){
        this.valor = valor;
        this.meses = meses;
        return valor + ((valor * 0.01) * meses);
    }

    @Override
    public String getNomeInvestimento(){
        return "CDB: Investimento de R$" + valor + " terá retorno de R$" + calcularRetorno(valor, meses) + "\n";
    }

}
