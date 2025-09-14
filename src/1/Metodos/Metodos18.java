// Verificação de Limite de Crédito (While + Flag) - Crie um método `verificarLimiteCredito` que:
//- Recebe o limite de crédito do cliente (double) e uma lista de valores de compras (double)
//- Usa um loop while para somar as compras até:
//- Ultrapassar o limite de crédito (retorna false)
//- Ou terminar a lista de compras (retorna true)
//- Deve parar imediatamente quando ultrapassar o limite

package Metodos;

import java.util.TreeMap;

public class Metodos18 {
    public static void main(String[] args) {
        boolean compraFeita = verificarLimiteCredito(500, new double[]{20,30,40,100,32,69,89,100});
        System.out.println("Compra Realizada: " + compraFeita);
    }

    public static boolean verificarLimiteCredito(double limiteCredito, double[] valoresDeCompra) {
        double somaCompras = 0;
        int i = 0;

        while (i < valoresDeCompra.length){
            somaCompras += valoresDeCompra[i];
            System.out.printf("Log - Compra Adicionada: %.2f | Total atual: %.2f\n", valoresDeCompra[i], somaCompras);

            i++;

            if (somaCompras > limiteCredito){
                return false;
            }
        }
        return true;
    }
}
