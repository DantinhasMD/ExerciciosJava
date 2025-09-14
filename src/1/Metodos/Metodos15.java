// Análise de Vendas Diárias (Do-While) - Implemente um método `calcularTotalVendas` que:
//- Utiliza um objeto Scanner para ler valores digitados pelo usuário
//- Continua solicitando valores até que o usuário digite 0
//- Retorna a soma total de todas as vendas digitadas (double)
//- Deve tratar valores negativos (ignorá-los e continuar o loop)

package Metodos;
import java.util.Scanner;

public class Metodos15 {
    public static void main(String[] args) {
        calcularTotalVendas();
    }

    public static void calcularTotalVendas() {
        Scanner sc = new Scanner(System.in);
        double valorVenda;
        double total = 0;

        do {
            System.out.println("Digite os valores de suas vendas diárias. Quando acabar, Digite 0 para encerrar!");
            System.out.println("Valor venda R$: ");
            valorVenda = sc.nextDouble();
            total += valorVenda;
        } while (valorVenda !=0);

        System.out.printf("Total de Vendas diárias: R$%.2f", total);
    }
}
