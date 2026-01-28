// Sistema de Fidelidade (Do-While + If-Else) - Crie um método `calcularPontosFidelidade` que:
//- Usa Scanner para ler valores de compras digitados pelo usuário
//- Acumula pontos (1 ponto a cada R$10 gastos)
//- Continua solicitando valores até que:
//- O usuário digite 0, OU
//- Atingir 100 pontos
//- Exibe no final:
//- Total de pontos acumulados
//- "Você ganhou um cupom!" se atingir 100 pontos
//- Não retorna valor, apenas exibe os resultados

package Residencia.Metodos;
import java.util.Scanner;

public class Metodos20 {
    public static void main(String[] args) {
        calcularPontosFidelidade();
    }

    public static void calcularPontosFidelidade() {
        Scanner sc = new Scanner(System.in);
        int pontosTotais = 0;

        do {
            System.out.println("Digite os valor de sua compra:");
            double valorCompra = sc.nextDouble();

            if (valorCompra >= 10){
                int pontos = (int) (valorCompra / 10);
                pontosTotais += pontos;
                System.out.printf("Você tem um total de %02d ponto(s)\n", pontosTotais);
            } else if (valorCompra == 0) {
                System.out.println("Programa Encerrado!");
                break;
            }
        } while (pontosTotais < 100);

        if (pontosTotais >= 100){
            System.out.println("Você ganhou um cupom!");
        }

        sc.close();
    }
}
