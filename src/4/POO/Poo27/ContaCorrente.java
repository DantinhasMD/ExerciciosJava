package POO.Poo27;

public class ContaCorrente extends POO.Poo27.Conta {
    public ContaCorrente(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public double atualizarMensal(){
        this.saldo -= 15;
        return saldo;
    }
}
