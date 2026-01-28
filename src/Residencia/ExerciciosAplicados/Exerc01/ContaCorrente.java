package Residencia.ExerciciosAplicados.Exerc01;

public class ContaCorrente extends Residencia.ExerciciosAplicados.Exerc01.Conta {
    public ContaCorrente(int numeroConta, Residencia.ExerciciosAplicados.Exerc01.Cliente titular){
        super(numeroConta, titular);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Conta Corrente não possui aplicação de juros.");
    }
}
