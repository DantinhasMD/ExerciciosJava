/* Crie a classe ItemCarrinho com os atributos privados:
● produto (String)
● quantidade (int)
● precoUnitario (double)

Implemente os métodos de acesso e validação:

● Quantidade não pode ser menor que 1
● Preço unitário deve ser positivo

Adicione um método calcularSubtotal() que retorna quantidade * precoUnitario. */

package Residencia.POO.Poo9;

public class ItemCarrinho {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public void setProduto(String produto){
        this.produto = produto;
    }

    public void setPrecoUnitario(double precoUnitario){
        if (precoUnitario > 0) {
            this.precoUnitario = precoUnitario;
        } else {
            System.out.println("Coloque um valor válido!\n");
        }
    }

    public void setAdicionarQuantidade(int valor) {
        if (valor < 0){
            System.out.println("Insira um valor válido!\n");
        } else {
            this.quantidade += valor;
        }
    }

    public void setRemoverQuantidade(int valor) {
        if (valor < 0){
            System.out.println("Insira um valor válido!\n");
        } else if (valor > quantidade) {
            System.out.println("Não é possível remover essa quantidade!\n");
        } else {
            quantidade -= valor;
        }
    }

    public void getExibirCarrinho(){
        System.out.println("Produto: " + this.produto);
        System.out.println("Preço: " + this.precoUnitario);
        System.out.println("Quantidade: " + this.quantidade);
    }

    public void calcularSubtotal(){
        System.out.printf("Valor Total dos itens: %.2f\n", quantidade * precoUnitario);
    }
}
