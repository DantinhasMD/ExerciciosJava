package ExerciciosAplicados.Exerc02;

public class ProdutoFisico extends ExerciciosAplicados.Exerc02.Produto {
    public ProdutoFisico(int codigo, String nome, double preco, ExerciciosAplicados.Exerc02.Cliente comprador){
        super(codigo,  nome,  preco,  comprador);
    }

    public void calcularFrete(){
        System.out.println("Frete fixo de R$20.0\n");
    }
}
