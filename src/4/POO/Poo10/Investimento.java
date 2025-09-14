/* Crie a classe Investimento com os atributos privados:
● tipoInvestimento (String)
● valorInicial (double)
● taxaAnual (double)

Regras de validação:
● O valor inicial não pode ser menor que R$ 1000
● A taxa anual deve estar entre 1% e 20%

Implemente:
● calcularValorFuturo(int anos) usando juros compostos
● exibirResumo() mostrando todos os dados e o valor final após os anos */

package POO.Poo10;

public class Investimento {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;

    public void setTipoInvestimento(String tipoInvestimento){
        this.tipoInvestimento = tipoInvestimento;
    }

    public void setValorInicial(double valorInicial){
        if (valorInicial > 1000){
            this.valorInicial = valorInicial;
        } else {
            System.out.println("Valor Inicial precisa ser menor que R$ 1000\n");
        }
    }

    public void setTaxaAnual(double taxaAnual){
        if (taxaAnual > 1 && taxaAnual < 20) {
            this.taxaAnual = taxaAnual;
        } else {
            System.out.println("A taxa anual deve estar entre 1% e 20%\n");
        }
    }

    public double calcularValorFuturo(int anos){
        return valorInicial * (taxaAnual * anos);
    }

    public void getExibirResumo(){
        System.out.println("Tipo de Investimento: " + this.tipoInvestimento);
        System.out.println("Valor Inicial: " + this.valorInicial);
        System.out.println("Taxa Anual: " + this.taxaAnual);
        System.out.printf("Valor Futuro (3 Anos): %.2f\n", calcularValorFuturo(3));
    }


}
