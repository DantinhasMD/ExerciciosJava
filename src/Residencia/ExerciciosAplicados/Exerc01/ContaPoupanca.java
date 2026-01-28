package Residencia.ExerciciosAplicados.Exerc01;

public class ContaPoupanca extends Residencia.ExerciciosAplicados.Exerc01.Conta {
    public ContaPoupanca(int numeroConta, Residencia.ExerciciosAplicados.Exerc01.Cliente titular){
        super(numeroConta, titular);
    }

    @Override
    public void aplicarJuros() {
        saldo *= 1.01;
        System.out.println("Juros aplicados. Novo saldo: R$" + saldo);
    }
}
