package Residencia.ExerciciosAplicados.Exerc02;

public class Main {
    public static void main(String[] args) {
        Residencia.ExerciciosAplicados.Exerc02.Cliente cliente = new Residencia.ExerciciosAplicados.Exerc02.Cliente("Ana Silva", "aninha@gmail.com");

        Residencia.ExerciciosAplicados.Exerc02.ProdutoFisico cc = new Residencia.ExerciciosAplicados.Exerc02.ProdutoFisico(1001,"Botas", 39.99, cliente);
        Residencia.ExerciciosAplicados.Exerc02.ProdutoDigital cp = new Residencia.ExerciciosAplicados.Exerc02.ProdutoDigital(2001, "EBOOK - Dicas Culinárias", 15.77, cliente);

        // Operações na conta corrente
        cc.aplicarDesconto(10);
        cc.aumentarPreco(20);
        cc.calcularFrete();

        // Operações na conta poupança
        cp.aplicarDesconto(20);
        cp.aumentarPreco(10);
        cp.calcularFrete();
    }
}
