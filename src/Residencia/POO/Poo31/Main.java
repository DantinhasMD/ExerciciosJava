/* Crie a classe abstrata Cambio com atributos valorEmReais e
taxaCambio, e o método abstrato double converter().
● Crie as subclasses:
○ CambioDolar → converte para dólar aplicando taxa (ex.: R$
5,00 = 1 USD).
○ CambioEuro → converte para euro aplicando taxa (ex.: R$ 6,00
= 1 EUR).

● No Main, converta um valor em reais para dólar e euro e mostre os
resultados. */

package Residencia.POO.Poo31;

public class Main {
    public static void main(String[] args) {
        Residencia.POO.Poo31.Cambio primeiro = new Residencia.POO.Poo31.CambioDolar(100, 5);
        Residencia.POO.Poo31.Cambio segundo = new Residencia.POO.Poo31.CambioEuro(100, 6);

        System.out.printf("USD: %.2f\n", primeiro.converter());
        System.out.printf("EUR: %.2f\n",segundo.converter());

    }
}
