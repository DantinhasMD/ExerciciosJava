// Uma matriz double[N][T] representa os valores gastos por N clientes em T tipos de
//   compra (mercado, viagens, serviços etc.).
// Normalize os valores para ficar entre 0 e 1, com base no maior gasto total individual.
// Métodos a implementar:
// double gastoMaximoCliente(double[][] gastos, int cliente) – retorna
//    o maior gasto entre as categorias de um cliente.
// double[][] normalizarGastos(double[][] gastos) – retorna uma nova matriz com os valores normalizados.

package Residencia.Vetores.Bidimensionais;

public class Vetores08 {
    public static void main(String[] args) {
        double[][] gastos = {
                {1, 3, 4, 7},
                {2345.37, 13299.76, 5555.89, 8892.22},
                {2345.37, 3299.76, 15555.89, 9892.22},
                {1345.37, 3299.76, 4555.89, 9992.22}
        };

        System.out.println(gastoMaximoCliente(gastos, 0));
        System.out.println(gastoMaximoCliente(gastos, 1));
        System.out.println(gastoMaximoCliente(gastos, 2));
        System.out.println(gastoMaximoCliente(gastos, 3));

        double[][] normalizacao = normalizarGastos(gastos);
        System.out.println("Normalização dos gastos de cada Cliente:");
        for (int i = 0; i < normalizacao.length; i++){
            System.out.printf("Cliente %d: ", i+1);
            for (int j = 0; j < normalizacao[i].length; j++){
                System.out.printf("%.2f ", normalizacao[i][j]);
            }
            System.out.println();
        }
    }

    public static double gastoMaximoCliente(double[][] gastos, int cliente) {
        double maiorGasto = gastos[cliente][0];

        for (int i = 1; i < gastos[cliente].length; i++){
            if (maiorGasto < gastos[cliente][i]){
                maiorGasto = gastos[cliente][i];
            }
        }

        return maiorGasto;
    }

    public static double[][] normalizarGastos(double[][] gastos) {
        double[][] valorNormalizado = new double[gastos.length][gastos[0].length];

        for (int i = 0; i < gastos.length; i++){
            double maiorValor = gastoMaximoCliente(gastos, i);

            for (int j = 0; j < gastos[i].length; j++){
                valorNormalizado[i][j] = gastos[i][j] / maiorValor;
            }
        }

        return valorNormalizado;
    }
}
