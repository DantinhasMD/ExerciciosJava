/* Crie a classe Produto com os atributos privados:
● codigo (String)
● nome (String)
● preco (double)

Implemente:

● Um construtor sem parâmetros que inicialize todos os atributos com valores padrão
(strings vazias e preço zero).
● Um construtor que receba codigo e nome, inicializando preco com zero.
● Um construtor que receba todos os três atributos. */

package POO.Poo12;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;

    // Construtores
    public Produto(){
        this.codigo = "";
        this.nome = "";
        this.preco = 0.0;
    }

    public Produto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = 0.0;
    }

    public Produto(String codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    //Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibirInformacoes() {
        System.out.printf("Nome: %s\n", getNome());
        System.out.printf("Código: %s\n", getCodigo());
        System.out.printf("Preço: %.2f\n", getPreco());
    }
}
