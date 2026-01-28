/* Crie a classe Produto com os atributos privados:
● nome (String)
● preco (double)
● estoque (int)

Implemente os métodos get e set, com as seguintes regras:

● O preço não pode ser negativo
● O estoque só pode ser alterado via adicionarEstoque() ou removerEstoque()

Crie um método exibirProduto() para imprimir nome, preço e estoque atual.*/

package Residencia.POO.Poo7;

public class Produto {
    private String nome;
    private int estoque;
    private double preco;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setAdicionarEstoque(int valor) {
        if (valor < 0){
            System.out.println("Insira um valor válido!");
        } else {
            this.estoque += valor;
        }


    }
    public void setRemoverEstoque(int valor) {
        if (valor < 0){
            System.out.println("Insira um valor válido!");
        } else if (valor > estoque) {
            System.out.println("Não é possível remover essa quantidade!");
        } else {
            estoque -= valor;
        }
    }

    public void getExibirExtrato() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preco: " + this.preco);
        System.out.println("Estoque: " + this.estoque);
    }
}
