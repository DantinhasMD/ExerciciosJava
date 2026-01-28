package Residencia.Hackatons.Hack02;// Maria Dantas, Alisson  e Lucy de Jesus

import java.util.Scanner;

public class HackathonVarejo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        // Variáveis principais
        int dias = 0;
        int categorias = 0;
        double[] vendasDiarias = null;
        double[][] vendasCategorias = null;
        double ticketMedio = 0;
        int catMaisLucrativa = -1;

        do {
            System.out.println("\n===== MENU - SISTEMA DE ANÁLISE DE VENDAS =====");
            System.out.println("1 - Registrar vendas diárias");
            System.out.println("2 - Gerar matriz de vendas por categoria");
            System.out.println("3 - Calcular indicadores");
            System.out.println("4 - Exibir todos os resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a quantidade de dias de operação: ");
                    dias = sc.nextInt();
                    vendasDiarias = registrarVendasDiarias(dias, sc);
                    break;

                case 2:
                    System.out.print("Informe a quantidade de categorias de produtos: ");
                    categorias = sc.nextInt();
                    vendasCategorias = gerarMatrizVendasCategorias(categorias, 4, sc);
                    break;

                case 3:
                    if (vendasDiarias != null)
                        ticketMedio = calcularTicketMedio(vendasDiarias);

                    if (vendasCategorias != null)
                        catMaisLucrativa = categoriaMaisLucrativa(vendasCategorias);

                    System.out.println("Indicadores calculados com sucesso.");
                    break;

                case 4:
                    exibirResultados(vendasDiarias, vendasCategorias, ticketMedio, catMaisLucrativa);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("⚠ Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }

    // ============================ MÉTODOS ============================

    public static double[] registrarVendasDiarias(int dias, Scanner sc) {
        double[] vendasDiarias = new double[dias];
        for (int i = 0; i < dias; i++) {
            System.out.print("Informe o total de vendas do dia " + (i + 1) + ": R$ ");
            vendasDiarias[i] = sc.nextDouble();
        }
        return vendasDiarias;
    }

    public static double[][] gerarMatrizVendasCategorias(int categorias, int semanas, Scanner sc) {
        double[][] vendasCategorias = new double[categorias][semanas];
        for (int i = 0; i < categorias; i++) {
            System.out.println("\nCategoria " + (i + 1) + ":");
            for (int j = 0; j < semanas; j++) {
                System.out.print("  Semana " + (j + 1) + " - Valor vendido (R$): ");
                vendasCategorias[i][j] = sc.nextDouble();
            }
        }
        return vendasCategorias;
    }

    public static double calcularTicketMedio(double[] vendasDiarias) {
        double soma = 0;
        for (double v : vendasDiarias) {
            soma += v;
        }
        return soma / vendasDiarias.length;
    }

    public static int categoriaMaisLucrativa(double[][] vendasCategorias) {
        int indiceMaisLucrativa = -1;
        double maiorSoma = 0;

        for (int i = 0; i < vendasCategorias.length; i++) {
            double soma = 0;
            for (int j = 0; j < vendasCategorias[i].length; j++) {
                soma += vendasCategorias[i][j];
            }

            if (soma > maiorSoma || indiceMaisLucrativa == -1) {
                maiorSoma = soma;
                indiceMaisLucrativa = i;
            }
        }

        return indiceMaisLucrativa;
    }

    public static void exibirResultados(double[] vendasDiarias, double[][] vendasCategorias, double ticketMedio, int catMaisLucrativa) {
        System.out.println("\n==== RESULTADOS ====");

        if (vendasDiarias != null) {
            System.out.println("Vendas Diárias:");
            for (int i = 0; i < vendasDiarias.length; i++) {
                System.out.println("Dia " + (i + 1) + ": R$ " + vendasDiarias[i]);
            }
        } else {
            System.out.println("Vendas diárias não registradas.");
        }

        if (vendasCategorias != null) {
            System.out.println("\nVendas por Categoria e Semana:");
            for (int i = 0; i < vendasCategorias.length; i++) {
                System.out.print("Categoria " + (i + 1) + ": ");
                for (int j = 0; j < vendasCategorias[i].length; j++) {
                    System.out.print("R$ " + vendasCategorias[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matriz de vendas não registrada.");
        }

        System.out.println("\nTicket Médio: R$ " + ticketMedio);

        if (catMaisLucrativa != -1) {
            System.out.println("Categoria mais lucrativa: Categoria " + (catMaisLucrativa + 1));
        } else {
            System.out.println("Categoria mais lucrativa não calculada.");
        }
    }
}