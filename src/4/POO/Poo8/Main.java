package POO.Poo8;

public class Main {
    public static void main(String[] args) {
        ClienteVip maria = new ClienteVip();
        ClienteVip vitor = new ClienteVip();


        maria.setNome("Mariazinha");
        vitor.setNome("Vitanos");

        maria.setCPF("12345678***");
        maria.setCPF("123456789111");
        maria.setCPF("12345678911");
        vitor.setCPF("12345678912");

        maria.setLimiteCredito(5);
        maria.setLimiteCredito(5000);
        vitor.setLimiteCredito(50000);


        maria.getExibirCliente();
        vitor.getExibirCliente();
    }
}
