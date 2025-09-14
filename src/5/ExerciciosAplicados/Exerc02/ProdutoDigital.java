package ExerciciosAplicados.Exerc02;

public class ProdutoDigital extends ExerciciosAplicados.Exerc02.Produto {
    public ProdutoDigital(int codigo, String nome, double preco, ExerciciosAplicados.Exerc02.Cliente comprador){
        super(codigo,  nome,  preco,  comprador);
    }

    public void calcularFrete(){
        System.out.println("Não tem frete\n");
    }
}
