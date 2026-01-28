/* Crie um programa que: Receba um vetor com os preços diários de uma ação
ao longo de 10 dias. Use métodos para:
 primeiraTrincaAlta(double[] precos) → retorna os índices da primeira
    trinca de alta (ou null se não existir).
 primeiraTendenciaAlta(double[] precos) → retorna os índices da
    primeira tendência com pelo menos 3 dias de alta consecutivos.
 todasTendenciasAlta(double[] precos) → retorna uma lista com todas
   as tendências de alta. */

package Residencia.Vetores.Basicos;

public class Vetores11 {
    public static void main(String[] args) {
        double[] precos = {233.33, 456.76, 124.65, 89.9, 576.8, 2100, 430.99, 865.76, 345.98, 100};

        int[] trinca = primeiraTrincaAlta(precos);
        if (trinca != null) {
            System.out.print("Primeira trinca de alta: ");
            for (int i = 0; i < trinca.length; i++) {
                System.out.print(trinca[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Nenhuma trinca de alta encontrada.");
        }

        int[] tendencia = primeiraTendenciaAlta(precos);
        if (tendencia != null) {
            System.out.print("Primeira tendência de alta (>=3 dias): ");
            for (int i = tendencia[0]; i <= tendencia[1]; i++) {
                System.out.print(precos[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Nenhuma tendência encontrada.");
        }

        System.out.println("Todas as tendências de alta (>=3 dias):");
        todasTendenciasAlta(precos);
    }

    public static int[] primeiraTrincaAlta(double[] precos) {
        for (int i = 0; i <= precos.length - 3; i++) {
            if (precos[i] < precos[i + 1] && precos[i + 1] < precos[i + 2]) {
                return new int[]{i, i + 1, i + 2};
            }
        }
        return null;
    }

    public static int[] primeiraTendenciaAlta(double[] precos) {
        int inicio = -1;
        int cont = 0;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                if (inicio == -1) inicio = i - 1;
                cont++;
                if (cont >= 2) { // 2 aumentos seguidos = 3 dias
                    return new int[]{inicio, i};
                }
            } else {
                inicio = -1;
                cont = 0;
            }
        }
        return null;
    }

    public static void todasTendenciasAlta(double[] precos) {
        int inicio = -1;
        int cont = 0;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > precos[i - 1]) {
                if (inicio == -1) inicio = i - 1;
                cont++;
            } else {
                if (cont >= 2) {
                    // imprime preços da tendência
                    for (int j = inicio; j <= i - 1; j++) {
                        System.out.print(precos[j] + " ");
                    }
                    System.out.println();
                }
                inicio = -1;
                cont = 0;
            }
        }

        // caso vá até o último dia
        if (cont >= 2) {
            for (int j = inicio; j < precos.length; j++) {
                System.out.print(precos[j] + " ");
            }
            System.out.println();
        }
    }
}
