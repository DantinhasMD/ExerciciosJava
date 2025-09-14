package Hackatons.Hack03;

public class Main {
    public static void main(String[] args) {
        Gerente caio = new Gerente("Caio Martiz", 3578.8);
        caio.exibirInformacao();

        Analista ana = new Analista("Ana Rodrigues", 2578.8);
        ana.exibirInformacao();
    }
}
