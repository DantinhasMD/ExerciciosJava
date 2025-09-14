package POO.Poo25;

public class EmprestimoEmpresarial extends Emprestimo{
    public EmprestimoEmpresarial(double valorEmprestado){
        super(valorEmprestado);
    }

    @Override
    public double calcularParcela(int meses){
        return (getValorEmprestado() / meses) + (getValorEmprestado() * 0.1) + 100;
    }
}
