// Caixa Registradora (Switch Case)
//Desenvolva um método `calcularTotal` que:
//- Recebe a forma de pagamento (String: "DÉBITO", "CRÉDITO" ou "PIX") e o valor da compra
//(double)
//- Usa uma estrutura switch para aplicar:
//- Sem alteração para pagamento no débito ou pix
//- Acréscimo de 2% para pagamento no crédito
//- Retorna o valor final da compra ou -1 caso a forma de pagamento seja inválida

package Residencia.Metodos;
import java.util.Scanner;

public class Metodos13 {
    public static void main(String[] args) {
        calcularTotal();
    }

    public static void calcularTotal() {
        Scanner sc = new Scanner(System.in);
        // Obter dados
        System.out.println("Digite o valor total da compra: R$ ");
        double valorTotal = sc.nextDouble();
        System.out.println("Digite a opção de pagamento: 1 - Débito/PIX 2 - Crédito: ");
        int metodoDePagamento = sc.nextInt();
        // Lógica de Programação
        switch (metodoDePagamento){
            case 1:
                System.out.printf("Pagamento: Débito/PIX - Valor Total: R$%.2f", valorTotal);
                break;

            case 2:
                double valorTotalComAcres = valorTotal + (valorTotal * 0.02);
                System.out.printf("Pagamento: Crédito (Acrés. 2%%) - Valor Total: R$%.2f", valorTotalComAcres);
                break;

            default:
                System.out.println("Opção inválida");
        }

    }
}
