/* Crie a classe Investimento com os atributos:
● codigo (String)
● valorInicial (double)

Crie a subclasse InvestimentoRendaFixa, com os atributos adicionais:
● taxaAnual (double)
● periodoMeses (int)

Implemente os construtores nas duas classes.
Na subclasse, implemente o método calcularValorFinal() que aplica juros compostos
valorFinal = valorInicial * (1 + taxaAnual * (periodoMeses /12)) */

package POO.Poo20;

public class Investimento {
    private String codigo;
    private double valorInicial;

    public Investimento(String codigo, double valorInicial){
        this.codigo = codigo;
        this.valorInicial = valorInicial;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
