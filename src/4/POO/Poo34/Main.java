/* Interface:
public interface Investimento {
double calcularRetorno(double valor, int meses);
String getNomeInvestimento();
}
Classes a implementar:
● CDB → juros simples de 1% ao mês.
● TesouroDireto → juros simples de 0.7% ao mês.
No Main:
● Investir R$ 1000 por 12 meses em cada um.
● Exibir o retorno final com nome do investimento.*/

package POO.Poo34;

public class Main {
    public static void main(String[] args) {
        POO.Poo34.Investimento primeiro = new POO.Poo34.CDB();
        POO.Poo34.Investimento segundo = new POO.Poo34.TesouroDireto();

        primeiro.calcularRetorno(1000, 12);
        segundo.calcularRetorno(1000, 12);

        System.out.printf(primeiro.getNomeInvestimento());
        System.out.printf( segundo.getNomeInvestimento());
    }
}
