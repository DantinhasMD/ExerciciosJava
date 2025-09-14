package POO.Poo30;

public class EmprestimoPessoal extends POO.Poo30.Emprestimo {
    public EmprestimoPessoal(double valor, double taxaJuros){;
        this.valor = valor;
        this.taxaJuros = taxaJuros;
    }
    @Override
    public double calcularParcela(int meses){
        return valor *(1 + taxaJuros * meses) / meses;
    }
}
