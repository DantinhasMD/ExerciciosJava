package Residencia.POO.Poo9;


public class Main {
    public static void main(String[] args) {
        ItemCarrinho chinelo = new ItemCarrinho();
        ItemCarrinho computador = new ItemCarrinho();


        chinelo.setProduto("Chinelo");
        computador.setProduto("Computador");

        chinelo.setPrecoUnitario(45.77);
        computador.setPrecoUnitario(1333.33);
        computador.setPrecoUnitario(-1333.33);


        chinelo.setAdicionarQuantidade(15);
        computador.setAdicionarQuantidade(14);

        chinelo.setRemoverQuantidade(16);
        chinelo.setRemoverQuantidade(10);
        computador.setRemoverQuantidade(10);

        chinelo.getExibirCarrinho();
        computador.getExibirCarrinho();

        chinelo.calcularSubtotal();
        computador.calcularSubtotal();
    }
}
