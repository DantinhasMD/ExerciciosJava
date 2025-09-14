package POO.Poo1;

public class Main {
    public static void main(String[] args) {
        POO.Poo1.Produto camiseta = new POO.Poo1.Produto();
        POO.Poo1.Produto bermuda = new POO.Poo1.Produto();


        camiseta.exibirDados();

        camiseta.nome = "Camiseta da renner";
        bermuda.nome = "Bermuda da Riachuello";
        camiseta.preco = 20.89;
        bermuda.preco = 34.98;
        camiseta.adicionarEstoque(100);
        bermuda.adicionarEstoque(20);
        camiseta.removerEstoque(18);
        bermuda.removerEstoque(10);
        camiseta.exibirDados();
        bermuda.exibirDados();
    }
}
