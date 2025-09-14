// Uma matriz int[C][Q] armazena as notas de crédito (0 a 100) de C clientes, avaliadas
//    por Q critérios (renda, histórico, uso de limite etc.).
// Métodos a implementar:
// double mediaNotaCliente(int[][] notas, int cliente) – retorna a média das notas de um cliente.
// int[] clientesComRiscoBaixo(int[][] notas, double limiar) – retorna os índices dos
//    clientes com média acima do limiar.

package Vetores.Bidimensionais;

public class Vetores09 {
    public static void main(String[] args) {
        int[][] notas = {
                {25, 60, 31, 90},
                {55, 12, 41, 20},
                {90, 60, 71, 96},
                {13, 23, 3, 39},
                {49, 15, 67, 89}
        };

        double limiar = 50;

        System.out.println(mediaNotaCliente(notas, 0));
        System.out.println(mediaNotaCliente(notas, 1));
        System.out.println(mediaNotaCliente(notas, 2));
        System.out.println(mediaNotaCliente(notas, 3));
        System.out.println(mediaNotaCliente(notas, 4));

        System.out.println("Lista de Clientes com baixo risco, ou seja, média acima do limiar:");
        int[] clientesBaixoRisco = clientesComRiscoBaixo(notas, limiar);
        for (int i = 0; i < clientesBaixoRisco.length; i++){
            System.out.printf("Cliente %d\n", clientesBaixoRisco[i]);
        }

    }

    public static double mediaNotaCliente(int[][] notas, int cliente) {
        int somaNotas = notas[cliente][0];

        for (int i = 1; i < notas[cliente].length; i++){
            somaNotas += notas[cliente][i];
        }

        return (double) somaNotas / notas[cliente].length;
    }

    public static int[] clientesComRiscoBaixo(int[][] notas, double limiar) {
        int contador = 0;

        for (int i = 0; i < notas.length; i++){
            if (mediaNotaCliente(notas, i) > limiar){
                contador++;
            }
        }

        int[] clientesMaioresQueLimiar = new int[contador];
        int indice = 0;

        for (int i = 0; i < notas.length; i++) {
            if (mediaNotaCliente(notas, i) > limiar) {
                clientesMaioresQueLimiar[indice++] = i+ 1;
            }
        }

        return clientesMaioresQueLimiar;
    }
}
