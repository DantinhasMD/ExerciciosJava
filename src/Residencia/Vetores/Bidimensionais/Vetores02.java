// Uma matriz double[C][P] armazena os valores pagos por C clientes ao longo de P parcelas de seus empréstimos.
//Métodos a implementar:
// double totalPago(double[][] pagamentos, int cliente) – retorna o valor total pago por um cliente.
// double[] totalPagoTodos(double[][] pagamentos) – retorna um vetor com o total pago por cada cliente.
// int clienteMaisAdiantado(double[][] pagamentos) – retorna o índice do cliente com maior soma de pagamentos.

package Residencia.Vetores.Bidimensionais;

public class Vetores02 {
    public static void main(String[] args) {
        double[][] pagamentos = {
                {127.89,139.99,145.90,170.25,200},
                {12.89,13.99,14.90,10.25,20},
                {7.89,9.99,5.90,0.25,2}
        };

        System.out.println(totalPago(pagamentos, 1));

        double[] totais = totalPagoTodos(pagamentos);
        for(int i = 0; i < totais.length; i++){
            System.out.println("Cliente " + (i + 1) + " pagou um Total de: R$" + totais[i]);
        }

        int clienteAdiantado = clienteMaisAdiantado(pagamentos);
        System.out.println(clienteAdiantado + 1);

    }

    public static double totalPago(double[][] pagamentos, int cliente) {
        double somaTotalPago = 0;

        for (int i = 0; i < pagamentos[cliente].length; i++){
            somaTotalPago += pagamentos[cliente][i];
        }
        return somaTotalPago;
    }

    public static double[] totalPagoTodos(double[][] pagamentos) {
        double[] totalDeTodos = new double[pagamentos.length];

        for (int i = 0; i < pagamentos.length; i++){
            totalDeTodos[i] = totalPago(pagamentos, i);
        }

        return totalDeTodos;
    }

    public static int clienteMaisAdiantado(double[][] pagamentos) {
        double[] totaisClientes = totalPagoTodos(pagamentos);

        double maiorValor = totaisClientes[0];
        int indiceMaiorValor = 0;

        for (int i = 1; i < totaisClientes.length; i++){
            if (maiorValor < totaisClientes[i]){
                maiorValor = totaisClientes[i];
                indiceMaiorValor = i;
            }
        }

        return indiceMaiorValor;
    }
}
