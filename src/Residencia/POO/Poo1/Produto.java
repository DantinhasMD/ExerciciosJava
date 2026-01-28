/* Crie uma classe chamada Produto com os atributos:
● nome (String)
● preco (double)
● quantidade (int)

Métodos:
● void adicionarEstoque(int quantidade)
● void removerEstoque(int quantidade)
● void exibirDados() → exibe as informações do produto.

Objetivo: instanciar dois produtos e simular a movimentação de estoque com entrada e saída. */

package Residencia.POO.Poo1;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;


    public void adicionarEstoque(int quantidade){
        System.out.println("Produto(s) adicionado(s) ao estoque");
        this.quantidade += quantidade;
        System.out.printf("Produto: %s Quantidade: %02d\n", this.nome, this.quantidade);
    }

    public void removerEstoque(int quantidade){
        System.out.println("Produto(s) removido(s) do estoque");
        this.quantidade -= quantidade;
        System.out.printf("Produto: %s Quantidade: %02d\n", this.nome, this.quantidade);

    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }
}
