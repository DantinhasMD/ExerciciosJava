package ExerciciosAplicados.Exerc02;

public abstract class Produto implements ExerciciosAplicados.Exerc02.OperacoesProduto {
    private int codigo;
    private String nome;
    private double preco;
    private ExerciciosAplicados.Exerc02.Cliente comprador;

    public double getPreco() {
        return preco;
    }

    public Produto(int codigo, String nome, double preco, ExerciciosAplicados.Exerc02.Cliente comprador){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.comprador = comprador;
    }

    @Override
    public void aplicarDesconto(double percentual){
        if (percentual > 0){
            preco -= ((percentual/100) * preco);
            System.out.printf("Novo valor de produto com o desconto de %.2f%%: R$%.2f\n", percentual, preco);
        }
    }

    @Override
    public void aumentarPreco(double percentual){
        if (percentual > 0){
            preco += ((percentual/100) * preco);
            System.out.printf("Novo valor de produto com o aumento de %.2f%%: R$%.2f\n", percentual, preco);
        }
    }

    public abstract void calcularFrete();
}
