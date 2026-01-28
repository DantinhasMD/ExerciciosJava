package Residencia.POO.Poo11;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo11.ContaBancaria maria = new Residencia.POO.Poo11.ContaBancaria();
        Residencia.POO.Poo11.ContaBancaria vitor = new Residencia.POO.Poo11.ContaBancaria("Vitor", "002");
        Residencia.POO.Poo11.ContaBancaria joao = new Residencia.POO.Poo11.ContaBancaria("João", "002", 3000);

        maria.exibirConta();
        maria.setTitular("Maria");
        maria.setNumeroConta("003");
        maria.exibirConta();

        vitor.exibirConta();
        vitor.adicionarSaldo(1200);
        System.out.printf("%.2f\n", vitor.getSaldo());
        System.out.printf("%s\n", vitor.getTitular());
        System.out.printf("%s\n", vitor.getNumeroConta());

        joao.exibirConta();
        joao.removerSaldo(3100);
        joao.removerSaldo(300.99);
        joao.exibirConta();
    }
}
