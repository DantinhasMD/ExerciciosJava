package POO.Poo6;

public class Main {
    public static void main(String[] args) {
        ContaBancaria carlos = new ContaBancaria();
        ContaBancaria pedro = new ContaBancaria();


        // Definindo os valores usando setters
        carlos.setNomeNumeroConta("Carlos", 1);
        pedro.setNomeNumeroConta("Pedrinho", 2);


        // Exibindo as informações da pessoa
        carlos.setDepositar(2000);
        pedro.setDepositar(2000);

        carlos.setSacar(2100);
        carlos.setSacar(200);

        pedro.setSacar(1989);

        pedro.exibirExtrato();
        carlos.exibirExtrato();
    }
}
