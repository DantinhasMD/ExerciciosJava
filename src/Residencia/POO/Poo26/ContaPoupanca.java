package Residencia.POO.Poo26;

public class ContaPoupanca extends Residencia.POO.Poo26.ContaBancaria {
    public ContaPoupanca(String titular, double saldo){
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio(){
        System.out.printf("Titular: %s\n", getTitular());
        System.out.printf("Saldo: R$%.2f\n", getSaldo());
        System.out.println("Rendimento Mensal: 0.5%\n");
    }
}
