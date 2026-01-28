// Uma matriz double[C][M] registra os gastos de C clientes com cartões de crédito durante M meses.
// Métodos a implementar:
// double gastoTotalCliente(double[][] gastos, int cliente) – retorna o gasto total de um cliente.
// int clienteMaiorGasto(double[][] gastos) – retorna o índice do cliente com maior gasto acumulado.

package Residencia.Vetores.Bidimensionais;

public class Vetores07 {
    public static void main(String[] args) {
        double[][] gastos = {
                {1200, 985.85, 1134.98},
                {100, 285.85, 194.98},
                {2, 5, 2134.98}
        };

        System.out.println(gastoTotalCliente(gastos, 0));
        System.out.println(gastoTotalCliente(gastos, 1));
        System.out.println(gastoTotalCliente(gastos, 2));

        System.out.println(clienteMaiorGasto(gastos));
    }

    public static double gastoTotalCliente(double[][] gastos, int cliente) {
        double totalGastoPorCliente = 0;

        for (int i = 0; i < gastos[cliente].length; i++){
            totalGastoPorCliente += gastos[cliente][i];
        }

        return totalGastoPorCliente;
    }

    public static int clienteMaiorGasto(double[][] gastos) {
        int indiceClienteMaiorGasto = 0;
        double maiorGasto = gastoTotalCliente(gastos, 0);

        for (int i = 1; i < gastos.length; i++){
            if (maiorGasto < gastoTotalCliente(gastos, i)){
                maiorGasto = gastoTotalCliente(gastos, i);
                indiceClienteMaiorGasto = i;
            }
        }

        return indiceClienteMaiorGasto;
    }
}
