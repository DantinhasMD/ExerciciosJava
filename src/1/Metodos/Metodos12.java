// Validação de Estoque - Implemente um método `validarEstoque` que:
//- Recebe como parâmetros a quantidade disponível em estoque (int) e a quantidade desejada
//pelo cliente (int)
//- Retorna true se houver estoque suficiente e false caso contrário

package Metodos;

public class Metodos12 {
    public static void main(String[] args) {
        System.out.println(validarEstqoue(100, 99));
        System.out.println(validarEstqoue(100, 100));
        System.out.println(validarEstqoue(100, 101));
        System.out.println(validarEstqoue(10, 99));
        System.out.println(validarEstqoue(175, 20));
        System.out.println(validarEstqoue(500, 99));
    }

    public static boolean validarEstqoue(int qtdDisponivel, int qtdDesejada) {
        return qtdDisponivel >= qtdDesejada;
    }
}
