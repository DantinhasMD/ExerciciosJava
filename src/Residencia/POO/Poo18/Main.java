package Residencia.POO.Poo18;

public class Main {
    public static void main(String[] args) {
        Transacao primeira = new Transacao("001", 45.99, "23/03/1998");

        TransferenciaBancaria segunda = new TransferenciaBancaria("003", 35, "23/03/1998", "001", "002");
        segunda.resumoTransferencia();
    }
}
