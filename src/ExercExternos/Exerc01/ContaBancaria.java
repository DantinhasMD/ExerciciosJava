package ExercExternos.Exerc01;

import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;

    //Construtor
    public ContaBancaria(double depositoInicial){
        this.saldo = depositoInicial;
        if (depositoInicial < 500){
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial / 2;
        }
    }

    //Getters
    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    //Setters
    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Metódos da Conta
    public void consultarSaldo() {
        System.out.println("Saldo: R$" + getSaldo());
    }

    public void consultarChequeEspecial() {
        System.out.println("Cheque especial: R$" + getChequeEspecial());
    }

    public void depositar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto deseja depositar: R$\n");
        double deposito = sc.nextDouble();

        setSaldo(getSaldo() + deposito);
        System.out.println("Depósito de R$" + deposito + " realizado. Novo saldo: R$" + getSaldo());
    }

    public void sacar(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto deseja sacar: R$");
        double valorSaque = sc.nextDouble();

        if (valorSaque <= 0) {
            System.out.println("Valor inválido!\n");
            return;
        }

        double saldoAtual = getSaldo();
        double chequeDisponivel = getChequeEspecial();

        if (valorSaque <= saldoAtual) {
            // Saque normal, dentro do saldo
            setSaldo(saldoAtual - valorSaque);
            System.out.printf("Saque de R$%.2f realizado. Novo saldo: R$%.2f\n", valorSaque, getSaldo());
        } else if (valorSaque <= saldoAtual + chequeDisponivel) {
            // Saque usando cheque especial
            double valorChequeUsado = valorSaque - saldoAtual;
            double taxa = valorChequeUsado * 0.2; // 20% de taxa
            setSaldo(saldoAtual - valorSaque - taxa);
            setChequeEspecial(getChequeEspecial() - valorChequeUsado); // diminui o cheque usado

            System.out.printf("Saque com cheque especial. Saque de R$%.2f, taxa de R$%.2f aplicado. Novo saldo: R$%.2f\n",
                    valorSaque, taxa, getSaldo());
        } else {
            System.out.println("Saldo insuficiente, incluindo cheque especial!\n");
        }
    }

    public void pagarBoleto(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do pagamento: R$\n");
        double pagar = sc.nextDouble();

        if (pagar > 0 && pagar <= getSaldo() + getChequeEspecial()){
            setSaldo(getSaldo() - pagar);
            System.out.printf("Conta no valor de R$%.2f paga. Saldo de R$%.2f", pagar, getSaldo());
        } else {
            System.out.println("Valor inválido ou Insuficiente!\n");
        }
    }

    public void verificarChequeEspecial(){
        if (saldo < 0) {
            System.out.println("Você está usando cheque especial!");
        } else {
            System.out.println("Você NÃO está usando cheque especial.");
        }
    }

}
