package POO.Poo20;

public class Main {
    public static void main(String[] args) {
        Investimento primeiro = new Investimento("DFBUDIGR", 100);
        InvestimentoRendaFixa segundo = new InvestimentoRendaFixa("duif", 100, 2, 48);

        System.out.printf("Valor Final: R$$%.2f", segundo.calcularValorFinal());
    }
}
