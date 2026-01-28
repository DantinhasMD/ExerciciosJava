package Residencia.POO.Poo2;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo2.ContaBancaria bernardo = new Residencia.POO.Poo2.ContaBancaria();
        Residencia.POO.Poo2.ContaBancaria maria = new Residencia.POO.Poo2.ContaBancaria();

        maria.titular = "Mariazinha";
        maria.numeroConta = 1;

        bernardo.titular = "Bernardinho";
        bernardo.numeroConta = 2;

        bernardo.depositar(1000);
        maria.depositar(2000);

        bernardo.sacar(34);
        maria.sacar(2100);
        maria.sacar(1980);

        bernardo.exibirSaldo();
        maria.exibirSaldo();
    }
}
