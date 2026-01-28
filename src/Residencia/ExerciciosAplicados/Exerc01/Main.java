package Residencia.ExerciciosAplicados.Exerc01;

public class Main {
    public static void main(String[] args) {
        Residencia.ExerciciosAplicados.Exerc01.Cliente cliente = new Residencia.ExerciciosAplicados.Exerc01.Cliente("Ana Silva", "123.456.789-00");

        Residencia.ExerciciosAplicados.Exerc01.ContaCorrente cc = new Residencia.ExerciciosAplicados.Exerc01.ContaCorrente(1001, cliente);
        Residencia.ExerciciosAplicados.Exerc01.ContaPoupanca cp = new Residencia.ExerciciosAplicados.Exerc01.ContaPoupanca(2001, cliente);

        // Operações na conta corrente
        cc.depositar(1000);
        cc.sacar(200);
        cc.aplicarJuros();
        System.out.println("Saldo da Conta Corrente: R$" + cc.getSaldo());

        // Operações na conta poupança
        cp.depositar(2000);
        cp.aplicarJuros();
        cp.sacar(500);
        System.out.println("Saldo da Conta Poupança: R$" + cp.getSaldo());
    }
}
