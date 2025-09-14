package POO.Poo27;

public class ContaPoupanca extends POO.Poo27.Conta {
    public ContaPoupanca(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    @Override
    public double atualizarMensal(){
        this.saldo *= 1.005;
        return saldo;
    }
}
