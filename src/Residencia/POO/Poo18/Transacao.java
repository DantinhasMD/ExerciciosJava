/* Crie a classe Transacao com os atributos:
● id (String)
● valor (double)
● data (String)

Crie a subclasse TransferenciaBancaria com os atributos adicionais:
● contaOrigem (String)
● contaDestino (String)

Implemente os construtores nas duas classes.
Na subclasse, adicione um método resumoTransferencia() que exibe os dados da
transferência no formato:
Transferência de R$ valor de contaOrigem para contaDestino na
data */

package Residencia.POO.Poo18;

public class Transacao {
    private String id;
    private double valor;
    private String data;

    public Transacao(String id, double valor, String data){
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

    // Getters
    public String getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public String getData() {
        return data;
    }

    // Setters
    public void setData(String data) {
        this.data = data;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(String id) {
        this.id = id;
    }
}
