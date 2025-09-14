package POO.Poo10;

public class Main {
    public static void main(String[] args) {
        Investimento cdb = new Investimento();
        Investimento acao = new Investimento();


        cdb.setTipoInvestimento("CDB");
        acao.setTipoInvestimento("Ação");

        cdb.setValorInicial(45.77);
        cdb.setValorInicial(1333.33);
        acao.setValorInicial(51333.33);


        cdb.setTaxaAnual(15);
        acao.setTaxaAnual(0.4);
        acao.setTaxaAnual(4);


        cdb.getExibirResumo();
        acao.getExibirResumo();


    }
}
