// Clientes com Cartões Fidelidade
//A loja registra clientes com cartões fidelidade, garantindo que cada CPF apareça apenas uma vez.
//Métodos sugeridos:
// void cadastrarCliente(Set<String> clientes, String cpf) – cadastra um novo cliente.
// boolean clienteCadastrado(Set<String> clientes, String cpf) – verifica se um cliente já está cadastrado.
// void exibirClientes(Set<String> clientes) – lista todos os clientes com cartão fidelidade.

package Residencia.Colecoes.Set; //Set - Coleções que não podem se repetir
import java.util.Set;
import java.util.HashSet;

public class Colecoes02 {
    public static void main(String[] args) {
        Set<String> clientes = new HashSet<>();

        cadastrarCliente(clientes, "12345678911");
        cadastrarCliente(clientes, "12345678911");
        cadastrarCliente(clientes, "12345678912");

        boolean verificadorDeCliente = clienteCadastrado(clientes, "12345678911");
        System.out.println(verificadorDeCliente);
        boolean verificadorDeCliente1 = clienteCadastrado(clientes, "12345678913");
        System.out.println(verificadorDeCliente1);


        exibirClientes(clientes);
    }

    public static void cadastrarCliente(Set<String> clientes, String cpf) {
        if (clientes.contains(cpf)){
            System.out.println("Cliente já existente no sistema!");
        } else {
            clientes.add(cpf);
            System.out.println("Cliente Cadastrado com sucesso");
        }
    }

    public static boolean clienteCadastrado(Set<String> clientes, String cpf) {
        if (clientes.contains(cpf)){
            return true;
        } else {
            return false;
        }
    }

    public static void exibirClientes(Set<String> clientes) {
        System.out.println(clientes);
    }
}
