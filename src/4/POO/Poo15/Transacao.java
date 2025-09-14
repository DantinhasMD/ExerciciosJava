/* Crie a classe Transacao com os atributos privados:
● id (String)
● tipo (String)
● valor (double)

Implemente:
● Um construtor que receba id e tipo, inicializando valor com zero.
● Um construtor que receba todos os três atributos. */

package POO.Poo15;

public class Transacao {
    private String id;
    private String tipo;
    private double valor;

    public Transacao(){
        this.id = "";
        this.tipo = "";
        this.valor = 0.0;
    }

    public Transacao(String id, String tipo, double valor){
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    // Setters
    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void exibirInformacoes(){
        System.out.printf("ID da Transação: %s\n", getId());
        System.out.printf("Tipo de Transações: %s\n", getTipo());
        System.out.printf("Valor: %.2f\n", getValor());
    }
}
