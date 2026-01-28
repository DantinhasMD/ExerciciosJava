package Residencia.POO.Poo21;

public class CalculadoraFinanceira {
    public double calcularJuros(double capital, double juros, int meses){
        return capital * (juros / 100) * meses;
    }

    public double calcularJuros(double capital, double juros){
        return capital * (juros / 100) * 12;
    }

    public double calcularJuros(double capital){
        return capital * 0.15 * 12;
    }
}
