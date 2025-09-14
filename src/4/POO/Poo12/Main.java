package POO.Poo12;

public class Main {
    public static void main(String[] args) {
        Produto camiseta = new Produto();
        camiseta.exibirInformacoes();
        camiseta.setCodigo("001");
        camiseta.setNome("Camiseta");
        camiseta.setPreco(49.99);
        camiseta.exibirInformacoes();

        Produto botas = new Produto("002", "Botas de Couro");
        botas.exibirInformacoes();
        botas.setPreco(69.99);
        botas.exibirInformacoes();

        Produto bone = new Produto("003", "Boné", 29.99);
        bone.exibirInformacoes();
    }
}
