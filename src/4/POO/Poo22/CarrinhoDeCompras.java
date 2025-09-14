package POO.Poo22;

public class CarrinhoDeCompras {
    public double somaCarrinho(double valor1, double valor2){
        return valor1 + valor2;
    }

    public double somaCarrinho(double valor1, double valor2, double desconto){
        return (valor1 + valor2) - ((valor1 + valor2) * (desconto /100));
    }
}
