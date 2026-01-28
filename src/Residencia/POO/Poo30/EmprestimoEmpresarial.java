package Residencia.POO.Poo30;

public class EmprestimoEmpresarial extends Residencia.POO.Poo30.Emprestimo {
    public EmprestimoEmpresarial(double valor, double taxaJuros){
        this.valor = valor;
        this.taxaJuros = taxaJuros;
    }
    @Override
    public double calcularParcela(int meses){
        return (valor *(1 + taxaJuros * meses) / meses) * 0.9;
    }
}