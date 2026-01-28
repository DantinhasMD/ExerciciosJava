// Histórico de Compras de Clientes
// Um Map<String, List<Double>> armazena o histórico de compras dos clientes, onde a
// chave é o CPF e o valor é uma lista com os valores gastos.
// Métodos sugeridos:
// void registrarCompra(Map<String, List<Double>> compras, String cpf, double valor) –
//      registra uma nova compra para o cliente.
// double totalGastoCliente(Map<String, List<Double>> compras, String cpf) – retorna o total gasto por um cliente.
// void exibirRelatorioClientes(Map<String, List<Double>> compras) – exibe o total gasto por todos os clientes.

package Residencia.Colecoes.Map;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Colecoes02 {
    public static void main(String[] args) {
        Map<String, List<Double>> compras = new HashMap<>();

        registrarCompra(compras, "12345678911", 344.78);
        registrarCompra(compras, "12345678911", 250.78);

        registrarCompra(compras, "12345678912", 994.78);
        registrarCompra(compras, "12345678912", 345.78);
        registrarCompra(compras, "12345678912", 888.78);
        registrarCompra(compras, "12345678912", 154.78);


        registrarCompra(compras, "12345678913", 799.78);
        registrarCompra(compras, "12345678913", 126.78);

        totalGastoCliente(compras, "12345678911");
        totalGastoCliente(compras, "12345678912");
        totalGastoCliente(compras, "12345678913");
        totalGastoCliente(compras, "12345678910");

        exibirRelatorioClientes(compras);
    }

    public static void registrarCompra(Map<String, List<Double>> compras, String cpf, double valor) {
        if (compras.containsKey(cpf)){
            System.out.println("CPF já cadastrado! Adicionando compra...\n");
            compras.get(cpf).add(valor);
        } else {
            System.out.println("Novo CPF cadastrado!\n");
            List<Double> listaCompras = new ArrayList<>();
            listaCompras.add(valor);
            compras.put(cpf, listaCompras);
        }
    }

    public static void totalGastoCliente(Map<String, List<Double>> compras, String cpf) {
        if (!compras.containsKey(cpf)){
            System.out.println("Esse CPF não existe no sistema!\n");
            return;
        }

        double somaTotal = 0;
        for (double valor: compras.get(cpf)){
            somaTotal += valor;
        }

        System.out.printf("Gasto do Cliente %s: %.2f\n", cpf, somaTotal);

    }

    public static void exibirRelatorioClientes(Map<String, List<Double>> compras) {
        System.out.println("=== Relatório de Compras ===");
        for (Map.Entry<String, List<Double>> entry : compras.entrySet()) {
            String cpf = entry.getKey();
            List<Double> listaCompras = entry.getValue();

            double total = 0;
            for (double valor : listaCompras) {
                total += valor;
            }

            System.out.printf("Cliente: %s | Compras: %s | Total: %.2f%n", cpf, listaCompras, total);
        }
        System.out.println("============================");
    }
}
