// Implemente calcularJurosCompostos() com capital inicial, taxa mensal e meses. Deve retornar o montante final.
//Exemplo: Capital: 1000, Taxa: 0.02, Meses: 12 => Saída: 1268.24

package Residencia.Metodos;

public class Metodos08 {
    public static void main(String[] args) {
        calcularJurosCompostos(1000, 0.02, 12);
    }

    public static void calcularJurosCompostos(double capitalInicial, double taxaMensal, int meses) {
        double montante = capitalInicial * Math.pow(1 + taxaMensal, meses);
        System.out.printf("Montante R$%.2f", montante);
    }
}
