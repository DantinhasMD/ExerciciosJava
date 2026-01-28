package Residencia.POO.Poo17;

public class Main {
    public static void main(String[] args) {
        Produto chocolate = new Produto("NSAIONFJE", "Chocolate", 7.99);
        chocolate.exibirInformacoes();

        ProdutoPerecivel leite = new ProdutoPerecivel("BISONOI", "Leite", 7.88, 2, 9, 2025);
        leite.exibirInformacoes();
        leite.setCodigo("OKLMKCIO");
        leite.setPreco(9.88);
        System.out.printf("Está Vencido: %s\n", leite.estaVencido(3,9,2025));
        System.out.printf("Está Vencido: %s\n", leite.estaVencido(1,1,2026));
        leite.exibirInformacoes();
    }
}
