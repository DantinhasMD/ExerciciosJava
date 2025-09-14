package ExercExternos.Exerc04;

public class Ingresso {
    private double valor;
    private String nome;
    private boolean legendado;

    //Construtor
    public Ingresso(double valor, String nome, boolean legendado){
        this.valor = valor;
        this.nome = nome;
        this.legendado = legendado;
    }

    //Getters
    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Setters
    public boolean isLegendado() {
        return legendado;
    }

    public void setLegendado(boolean legendado) {
        this.legendado = legendado;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Metodos
    public double getValorReal() {
        return valor;
    }

    public void exibirInformacoes(){
        System.out.println("=== INFORMAÇÕES DO INGRESSO ===");
        System.out.println("Filme: " + nome);
        System.out.println("Tipo: " + (legendado ? "Legendado" : "Dublado"));
        System.out.printf("Valor final: R$ %.2f\n", getValorReal());
    }
}
