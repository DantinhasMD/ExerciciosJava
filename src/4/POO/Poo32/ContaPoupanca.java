package POO.Poo32;

public class ContaPoupanca implements POO.Poo32.ContaBancaria {
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
            this.saldo -= valor;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }
    @Override
    public double consultarSaldo(){
        return saldo;
    }
}

