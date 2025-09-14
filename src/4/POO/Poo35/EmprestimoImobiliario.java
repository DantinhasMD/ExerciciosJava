package POO.Poo35;

public class EmprestimoImobiliario implements POO.Poo35.Emprestimo {
    private double valor = 10000;

    @Override
    public double calcularParcela(int meses){
        return (valor * Math.pow(1 + 0.01, meses)) / meses;
    }

    @Override
    public double calcularTotalAPagar(int meses){
        return calcularParcela(meses) * meses;
    }
}
