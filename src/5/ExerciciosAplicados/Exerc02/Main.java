package ExerciciosAplicados.Exerc02;

public class Main {
    public static void main(String[] args) {
        ExerciciosAplicados.Exerc02.Cliente cliente = new ExerciciosAplicados.Exerc02.Cliente("Ana Silva", "aninha@gmail.com");

        ExerciciosAplicados.Exerc02.ProdutoFisico cc = new ExerciciosAplicados.Exerc02.ProdutoFisico(1001,"Botas", 39.99, cliente);
        ExerciciosAplicados.Exerc02.ProdutoDigital cp = new ExerciciosAplicados.Exerc02.ProdutoDigital(2001, "EBOOK - Dicas Culinárias", 15.77, cliente);

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
