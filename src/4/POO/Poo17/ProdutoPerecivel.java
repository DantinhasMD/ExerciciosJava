package POO.Poo17;

public class ProdutoPerecivel extends Produto{
    private int diaVencimento;
    private int mesVencimento;
    private int anoVencimento;

    public ProdutoPerecivel(String codigo, String nome, double preco, int diaVencimento, int mesVencimento, int anoVencimento){
        super(codigo, nome, preco);
        this.diaVencimento = diaVencimento;
        this.mesVencimento = mesVencimento;
        this.anoVencimento = anoVencimento;
    }

    // Getters
    public int getDiaVencimento() {
        return diaVencimento;
    }

    public int getMesVencimento() {
        return mesVencimento;
    }

    public int getAnoVencimento() {
        return anoVencimento;
    }

    // Setters
    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }

    public void setMesVencimento(int mesVencimento) {
        this.mesVencimento = mesVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public boolean estaVencido(int diaAtual, int mesAtual, int anoAtual) {
        if (anoAtual > anoVencimento) {
            return true;
        } else if (mesAtual > mesVencimento) {
            return true;
        } else if (mesAtual == mesVencimento) {
            return diaAtual > diaVencimento;
        }
        return false;
    }
}
