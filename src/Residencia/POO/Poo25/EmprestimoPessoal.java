package Residencia.POO.Poo25;

public class EmprestimoPessoal extends Emprestimo{
    public EmprestimoPessoal(double valorEmprestado){
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses){
        return (getValorEmprestado() / meses) + (getValorEmprestado() * 0.02);
    }
}
