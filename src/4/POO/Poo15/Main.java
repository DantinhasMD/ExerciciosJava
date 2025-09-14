package POO.Poo15;

public class Main {
    public static void main(String[] args) {
        Transacao debito = new Transacao();
        debito.exibirInformacoes();
        debito.setId("001");
        debito.setTipo("Débito");
        debito.setValor(122.87);
        debito.exibirInformacoes();

        Transacao credito = new Transacao("002", "Crédito", 2456.77);
        credito.exibirInformacoes();
    }
}
