/* Crie a classe Funcionario com:
● nome (String)
● salarioBruto (double)
● descontoINSS (double)
● descontoIR (double)

Métodos:
● double calcularSalarioLiquido()
● void exibirFolhaPagamento()

Objetivo: calcular o salário líquido de um funcionário e imprimir a folha de pagamento com os
descontos aplicados. */

package Residencia.POO.Poo5;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;
    public double descontoIR;


    public double calcularSalarioLiquido(){
        return this.salarioBruto - this.descontoIR - this.descontoINSS;
    }

    public void exibirFolhaPagamento(){
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Salário Bruto: %.2f\n", salarioBruto);
        System.out.printf("Desconto INSS: %.2f\n", descontoINSS);
        System.out.printf("Desconto IR: %.2f\n", descontoIR);
        System.out.printf("TOTAL A RECEBER: %.2f\n", calcularSalarioLiquido());
    }
}
