package Residencia.POO.Poo4;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo4.Carro mamae = new Residencia.POO.Poo4.Carro();
        Residencia.POO.Poo4.Carro papai = new Residencia.POO.Poo4.Carro();

        mamae.modelo = "Fiat";
        papai.modelo = "Fox";

        mamae.consumoPorKm = 15;
        papai.consumoPorKm = 7;

        mamae.calcularConsumo(800);
        papai.calcularConsumo(220);

        mamae.exibirDados();
        papai.exibirDados();
    }
}
