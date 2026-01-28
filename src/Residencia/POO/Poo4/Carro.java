/* Crie a classe Carro com os atributos:
● modelo (String)

● consumoPorKm (double) → quantos km por litro

Métodos:
● double calcularConsumo(double distancia) → retorna a quantidade de litros
necessária para uma viagem.
● void exibirDados()

Objetivo: calcular o consumo de combustível para uma viagem, dado o modelo e a eficiência
do carro. */

package Residencia.POO.Poo4;

public class Carro {
    public String modelo;
    public double consumoPorKm;


    public double calcularConsumo(double distancia){
        System.out.printf("Consumo de Litros a essa distância: %.2f\n", distancia/consumoPorKm);
        return distancia/consumoPorKm;
    }

    public void exibirDados(){
        System.out.printf("Modelo: %s, Consumo p/Km: %.2f\n", this.modelo, this.consumoPorKm);
    }
}
