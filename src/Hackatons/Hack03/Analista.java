package Hackatons.Hack03;

public class Analista extends Funcionario{
    private double bonusFixo;

    public Analista(String nome, double salario){
        super(nome, salario);
        this.bonusFixo = 1000;
    }

    // Getters
    public double getBonusFixo() {
        return bonusFixo;
    }

    // Setters
    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }

    public void exibirInformacao(){
        System.out.println("Cargo de Analista");
        System.out.printf("Nome: %s", getNome());
        System.out.printf("Salário: R$%.2f", getSalario());
        System.out.printf("Bônus: R$%.2f", getBonusFixo());
    }
}
