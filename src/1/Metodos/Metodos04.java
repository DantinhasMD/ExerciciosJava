// Implemente um método chamado calcularMediaMovel() que recebe um array de preços e um intervalo n.
// Deve calcular a média móvel para o intervalo dado.
//Exemplo: Preços: {100, 102, 101, 103, 105}, Intervalo: 3 => Saída: 101.0, 102.0, 103.0

package Metodos;
import java.util.Scanner;


public class Metodos04 {
    public static void main(String[] args) {
        calcularMediaMovel();
    }

    public static void calcularMediaMovel() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos preços deseja informar? ");
        int tamanho = sc.nextInt();
        double[] precos = new double[tamanho]; //array - vetor

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Preço " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
        }

        System.out.println("Informe o intervalo da média móvel: ");
        int n = sc.nextInt();

        if (n <= precos.length){
            for (int i = 0; i <= precos.length - n; i++){
                double soma = 0;
                for (int j = 0; j < n; j++){
                    soma += precos[i+j];
                }
                double media = soma / n;
                System.out.printf("Média móvel %d: %.2f\n", i + 1, media);
            }
        } else {
            System.out.println("Intervalo maior que o número de preços informados.");
        }
    }
}
