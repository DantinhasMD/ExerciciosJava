package Residencia.POO.Poo20;

public class InvestimentoRendaFixa extends Investimento{
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodoMeses){
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public int getPeriodoMeses() {
        return periodoMeses;
    }

    public void setPeriodoMeses(int periodoMeses) {
        this.periodoMeses = periodoMeses;
    }

    public void setTaxaAnual(double taxaAnual) {
        this.taxaAnual = taxaAnual;
    }

    public double calcularValorFinal(){
        return getValorInicial() * Math.pow(1 + getTaxaAnual(), (getPeriodoMeses()/12.0));
    }
}
