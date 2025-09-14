/* Crie a classe base Produto com os atributos privados:
● codigo (String)
● nome (String)
● preco (double)

Crie a subclasse ProdutoPerecivel, com o atributo adicional:
● dataValidade (String)
Implemente os construtores nas duas classes.
Na subclasse, adicione um método estaVencido(String dataAtual) que retorna true
se a data de validade for anterior à data atual.*/

package POO.Poo17;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;

    // Construtor
    public Produto(String codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
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

    public void exibirInformacoes(){
        System.out.printf("Nome do Produto: %s\n", getNome());
        System.out.printf("Código do Produto: %s\n", getCodigo());
        System.out.printf("Valor do Produto: %.2f\n", getPreco());
    }
}
