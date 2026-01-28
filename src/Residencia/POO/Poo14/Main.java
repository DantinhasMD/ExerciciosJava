package Residencia.POO.Poo14;

public class Main {
    public static void main(String[] args) {
        ClienteVarejo vithola = new ClienteVarejo();
        vithola.exibirInformacoes();
        vithola.setNome("Vitor Cortez");
        vithola.setCpf("12345678911");
        vithola.exibirInformacoes();

        ClienteVarejo maria = new ClienteVarejo("Maria Dantas", "12345678922");
        maria.exibirInformacoes();
    }
}
