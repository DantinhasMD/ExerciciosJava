package Residencia.POO.Poo32;

public class ContaCorrente implements Residencia.POO.Poo32.ContaBancaria {
    private double saldo;

    @Override
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }
    @Override
    public void sacar(double valor){
        if (valor > 0 && valor < saldo){
            System.out.println("Taxa de saque de R$2,5");
            this.saldo -= valor + 2.5;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
    @Override
    public double consultarSaldo(){
        return saldo;
    }
}
