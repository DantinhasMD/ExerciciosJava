public class Main {
    public static void main(String[] args) {
        //Lista de Investimentos Iniciais
        double[] investimentos = {100.0, 200.0,300.0,400.0,500.0, 600.0, 700.0, 800.0,900.0,1000.00};

        //Exibição dos rendimentos fixos
        System.out.println("\n====RENDIMENTO FIXO====");
        for (int i = 0; i < investimentos.length; i += 2){
            double investimentoInicial = investimentos[i];

            Investimento rendaFixa = new RendaFixa(investimentoInicial);
            System.out.printf("Investimento %s: Inicial de R$%.2f | Rendimento Final R$%.2f\n", i + 1, investimentos[i], rendaFixa.calcularRendimento(investimentos[i]));
        }

        //Exibição dos rendimentos variáveis
        System.out.println("\n====RENDIMENTO VARIÁVEL====");
        for (int i = 1; i < investimentos.length; i += 2){
            double investimentoInicial = investimentos[i];

            Investimento rendaVariavel = new RendaVariavel(investimentoInicial);
            System.out.printf("Investimento %s: Inicial de R$%.2f | Rendimento Final R$%.2f\n", i + 1, investimentos[i], rendaVariavel.calcularRendimento(investimentos[i]));
        }
    }
}