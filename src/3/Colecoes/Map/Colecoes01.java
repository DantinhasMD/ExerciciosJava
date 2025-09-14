// Controle de Preços dos Produtos
// A loja armazena o preço de cada produto em um Map<String, Double>, onde a chave é o
//nome do produto e o valor é o preço.
//Métodos sugeridos:
// void adicionarProduto(Map<String, Double> precos, String produto, double preco) –
//   adiciona ou atualiza o preço de um produto.
// void atualizarPreco(Map<String, Double> precos, String produto, double novoPreco) –
//   altera o preço de um produto já existente.
// void exibirPrecos(Map<String, Double> precos) – lista todos os produtos com seus preços.

package Colecoes.Map;
import java.util.HashMap;
import java.util.Map;


public class Colecoes01 {
    public static void main(String[] args) {
        Map<String, Double> precos = new HashMap<>(); //Map - Mapear: Par e valor

        adicionarProduto(precos, "Camiseta", 59.90);
        adicionarProduto(precos, "Calça", 69.90);
        adicionarProduto(precos, "Camiseta", 39.90);

        utilizarPreco(precos, "Camiseta", 39.90);
        utilizarPreco(precos, "Short", 39.90);


        exibirPrecos(precos);
    }

    public static void adicionarProduto(Map<String, Double> precos, String produto, double preco) {
        if (precos.containsKey(produto)){
            System.out.println("Produto já cadastrado anteriormente!");
        } else {
            precos.put(produto, preco);
            System.out.println("Produto cadastrado com sucesso!");
        }

    }

    public static void utilizarPreco(Map<String, Double> precos, String produto, double novoPreco) {
        if (precos.containsKey(produto)){
            precos.put(produto, novoPreco);
            System.out.printf("O Produto " + produto + " sofreu alteração em seu valor para %.2f\n", novoPreco);
        } else {
            System.out.println("O produto não existe no sistema!");
        }
    }

    public static void exibirPrecos(Map<String, Double> precos) {
        System.out.println(precos);
    }
}
