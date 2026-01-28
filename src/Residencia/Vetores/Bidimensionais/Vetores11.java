// Uma loja deseja registrar as vendas de N produtos ao longo de M dias em
// uma matriz int[N][M], onde cada linha representa um produto e cada coluna um dia.
//Métodos sugeridos:
// int[][] registrarVendas() → preenche e retorna a matriz de vendas.
// void imprimirVendas(int[][] vendas) → exibe as vendas organizadas (produto × dia).

package Residencia.Vetores.Bidimensionais;

import java.util.Scanner;

public class Vetores11 {
    public static void main(String[] args) {
        int[][] vendas = registrarVendas();
        imprimirVendas(vendas);
    }

    public static int[][] registrarVendas() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de produtos: ");
        int produtos = sc.nextInt();

        System.out.print("Digite o número de dias: ");
        int dias = sc.nextInt();

        int[][] vendas = new int[produtos][dias];

        for (int i = 0; i < produtos; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            for (int j = 0; j < dias; j++) {
                System.out.print("  Dia " + (j + 1) + ": ");
                vendas[i][j] = sc.nextInt();
            }
        }

        return vendas;
    }

    public static void imprimirVendas(int[][] vendas) {
        System.out.println("\n=== Vendas Registradas (Produto x Dia) ===");
        for (int i = 0; i < vendas.length; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            for (int j = 0; j < vendas[i].length; j++) {
                System.out.printf("%4d", vendas[i][j]);
            }
            System.out.println();
        }
    }
}
