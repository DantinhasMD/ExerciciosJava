package Residencia.POO.Poo7;

public class Main {
    public static void main(String[] args) {
        Produto camiseta = new Produto();
        Produto sapato = new Produto();


        camiseta.setNome("Camiseta");
        sapato.setNome("Sapato");

        camiseta.setPreco(2);
        sapato.setPreco(5);


        camiseta.setAdicionarEstoque(2000);
        sapato.setAdicionarEstoque(2000);

        camiseta.setRemoverEstoque(2100);
        sapato.setRemoverEstoque(200);

        camiseta.setRemoverEstoque(1989);

        camiseta.getExibirExtrato();
        sapato.getExibirExtrato();
    }
}
