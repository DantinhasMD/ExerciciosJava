package POO.Poo16;

public class Main {
    public static void main(String[] args) {
        POO.Poo16.ContaBancaria maria = new POO.Poo16.ContaBancaria("Maria Dantas", "002");
        maria.exibirInformacoes();
        maria.depositar(1222.45);
        System.out.printf("Transação Concluída: %s",maria.sacar(2000));
        System.out.printf("Transação Concluída: %s", maria.sacar(200));

        POO.Poo16.ContaCorrente vitor = new POO.Poo16.ContaCorrente("Vitor Cortez", "001", 345.67);
        vitor.exibirInformacoes();
        vitor.setNumeroConta("003");
        vitor.setTitular("Vitor Dantas Cortez");
        vitor.depositar(300);
        vitor.exibirInformacoes();
        System.out.printf("Cheque Especial: %.2f", vitor.getLimiteChequeEspecial());
        System.out.printf("Saque Concluído: %s", vitor.sacarComChequeEspecial(150));
        System.out.printf("Saque Concluído: %s", vitor.sacarComChequeEspecial(1500));
        vitor.setLimiteChequeEspecial(900);
        System.out.printf("Saque Concluído: %s", vitor.sacarComChequeEspecial(500));
    }
}
