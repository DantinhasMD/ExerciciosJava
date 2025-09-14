package POO.Poo19;

public class Main {
    public static void main(String[] args) {
        Cliente maicon = new Cliente("Michael", "12345678911");

        ClienteVip golias = new ClienteVip("Golias", "12345678912", 2, 10);
        System.out.printf("Valor Final: R$%.2f", golias.calcularPrecoComDesconto(30));
    }
}
