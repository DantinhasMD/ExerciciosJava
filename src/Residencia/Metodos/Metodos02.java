//2. Implemente um método chamado calcularJurosSimples() que recebe o capital inicial, a taxa de juros anual (%) e o tempo (em anos). Deve retornar o montante final.
//Exemplo: Capital: 1000.0, Taxa: 5.0%, Anos: 3 => Saída: Montante final: 1150.0

package Residencia.Metodos;
public class Metodos02 {
    public static void main(String[] args) {
        calcularJurosSimples(1000, 5,3);
    }

    public static void calcularJurosSimples(double capitalInicial, double taxaJurosAnual, int anos) {
        double montanteFinal = capitalInicial + (capitalInicial * (taxaJurosAnual/100)) * anos;
        System.out.println(montanteFinal);
    }
}
