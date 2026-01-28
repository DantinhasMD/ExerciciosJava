// Produtos Únicos no Estoque
//Um sistema de controle de estoque precisa garantir que não existam produtos duplicados.
//Métodos sugeridos:
// void adicionarProduto(Set<String> produtos, String produto) – adiciona um produto ao estoque, se não existir.
// boolean existeProduto(Set<String> produtos, String produto) – verifica se um produto está cadastrado.
// void exibirProdutos(Set<String> produtos) – exibe todos os produtos únicos cadastrados.
package Residencia.Colecoes.Set;

import java.util.HashSet;
import java.util.Set;

public class Colecoes01 {
    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();

        adicionarProduto(produtos, "Camiseta");
        adicionarProduto(produtos, "Short");
        adicionarProduto(produtos, "Camiseta");
        adicionarProduto(produtos, "Agasalho");
        adicionarProduto(produtos, "Cachecol");


        exibirProdutos(produtos);

        boolean verificadorDeProduto = existeProduto(produtos, "Camiseta");
        System.out.println(verificadorDeProduto);
        boolean verificadorDeCliente1 = existeProduto(produtos, "Gorro");
        System.out.println(verificadorDeCliente1);

    }

    public static void adicionarProduto(Set<String> produtos, String produto) {
        if (produtos.contains(produto)){
            System.out.println("Produto cadastrado anteriormente!");
        } else {
            produtos.add(produto);
            System.out.println("Produto cadastrado com Sucesso!");
        }
    }

    public static void exibirProdutos(Set<String> produtos) {
        System.out.println(produtos);
    }

    public static boolean existeProduto(Set<String> produtos, String produto) {
        return produtos.contains(produto);
    }
}
