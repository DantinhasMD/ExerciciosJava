package Residencia.POO.Poo26;

public class ContaCorrente extends Residencia.POO.Poo26.ContaBancaria {
    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio(){
        System.out.printf("Titular: %s\n", getTitular());
        System.out.printf("Saldo: R$%.2f\n", getSaldo());
        System.out.println("Desconto de Taxa Manutenção: R$20\n");
    }
}
