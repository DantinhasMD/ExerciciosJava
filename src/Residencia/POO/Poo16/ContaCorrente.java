package Residencia.POO.Poo16;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double limiteChequeEspecial){
        super(titular, numeroConta);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean sacarComChequeEspecial(double valor) {
        double saldoDisponivel = getSaldo() + limiteChequeEspecial;
        if (valor > 0 && valor <= saldoDisponivel) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }

}
