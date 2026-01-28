/* Crie a classe base Cliente com os atributos:
● nome (String)
● cpf (String)

Crie a subclasse ClienteVip com os atributos adicionais:

● nivel (int)
● descontoPercentual (double)

Implemente os construtores nas duas classes.
Na subclasse, adicione um método calcularPrecoComDesconto(double preco) que
retorna o valor final com o desconto aplicado. */

package Residencia.POO.Poo19;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
