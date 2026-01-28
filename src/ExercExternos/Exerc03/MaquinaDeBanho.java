package ExercExternos.Exerc03;

import java.util.Scanner;

public class MaquinaDeBanho {
    private boolean ocupado;
    private int capacidadeAgua;
    private int capacidadeShampoo;
    private boolean limpa;

    //Construtor
    public MaquinaDeBanho(){
        this.ocupado = false;
        this.capacidadeAgua = 30;
        this.capacidadeShampoo = 10;
        this.limpa = true;
    }
    //Getters

    public boolean isOcupado() {
        return ocupado;
    }

    public int getCapacidadeAgua() {
        return capacidadeAgua;
    }

    public int getCapacidadeShampoo() {
        return capacidadeShampoo;
    }

    public boolean isLimpa() {
        return limpa;
    }

    //Setters
    public void setLimpa(boolean limpa) {
        this.limpa = limpa;
    }

    public void setCapacidadeShampoo(int capacidadeShampoo) {
        this.capacidadeShampoo = capacidadeShampoo;
    }

    public void setCapacidadeAgua(int capacidadeAgua) {
        this.capacidadeAgua = capacidadeAgua;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    //Residencia.Metodos
    public void banhoPet(){
        if (isOcupado() && getCapacidadeAgua() >= 10 && getCapacidadeShampoo() >= 2 && isLimpa()){
            System.out.println("Pet tomou banho!");
            setCapacidadeAgua(getCapacidadeAgua() - 10);
            setCapacidadeShampoo(getCapacidadeShampoo() - 2);
        } else if (!isOcupado()){
            System.out.println("Não há pet na máquina!");
        } else if (!isLimpa()){
            System.out.println("A máquina precisa ser limpa!");
        } else if (getCapacidadeAgua() < 10){
            System.out.println("Nível de água insuficiente!");
        } else if (getCapacidadeShampoo() < 2){
            System.out.println("Nível de Shampoo Insuficiente");
        }
    }

    public void abastecerAgua(){
        if (getCapacidadeAgua() <= 28) {
            setCapacidadeAgua(getCapacidadeAgua() + 2);
            System.out.printf("Água abastecida! Nível atual: %dL\n", getCapacidadeAgua());
        } else if (getCapacidadeAgua() == 29){
            System.out.printf("Abastecimento de 2L impossível! Limite de 30L de água. Nível Atual: %02dL\n", getCapacidadeAgua());
        } else {
            System.out.printf("Nível máximo de 30L de água atingido! Nível Atual: %02dL\n", getCapacidadeAgua());
        }
    }

    public void abastecerShampoo(){
        if (getCapacidadeShampoo() <= 8) {
            setCapacidadeShampoo(getCapacidadeShampoo() + 2);
            System.out.printf("Shampoo abastecido! Nível atual: %dL\n", getCapacidadeShampoo());
        } else if (getCapacidadeShampoo() == 9){
            System.out.printf("Abastecimento de 2L impossível! Limite de 10L de shampoo. Nível Atual: %02dL\n", getCapacidadeShampoo());
        } else {
            System.out.printf("Nível máximo de 10L de shampoo atingido! Nível Atual: %02dL\n", getCapacidadeShampoo());
        }
    }

    public void verificarNivelAgua(){
        System.out.printf("Nível de Água Atual: %02dL\n", getCapacidadeAgua());
    }

    public void verificarNivelShampoo(){
        System.out.printf("Nível de Shampoo Atual: %02dL\n", getCapacidadeShampoo());
    }

    public void verificarPetNoBanho(){
        if (isOcupado()){
            System.out.println("Há um Pet no banho!");
        } else {
            System.out.println("Não há Pet no banho!");
        }
    }

    public void colocarPetMaquina(){
        if (!isOcupado() && isLimpa()){
            System.out.println("Pet colocado na máquina");
            setOcupado(true);
        } else if (isOcupado()){
            System.out.println("A máquina já está ocupada!");
        } else if (!isLimpa()){
            System.out.println("A máquina está suja. Limpe-a para colocar o Pet!");
        }
    }

    public void retirarPetMaquina(){
        Scanner sc = new Scanner(System.in);

        if (isOcupado()) {
            System.out.println("Pet retirado da máquina!");
            setOcupado(false);
            System.out.print("O Pet retirado estava limpo? (Y/N): ");
            char limpo = sc.next().toUpperCase().charAt(0);

            if (limpo == 'N'){
                System.out.println("A máquina precisará ser limpa para ser utilizada novamente!");
                setLimpa(false);
            } else if (limpo != 'Y'){
                System.out.println("Entrada inválida");
                return;
            }
        } else {
            System.out.println("Não há pet na máquina para retirar!");
        }
    }

    public void limparMaquina() {
        if (!isLimpa() && !isOcupado() && getCapacidadeAgua() >= 3 && getCapacidadeShampoo() >= 1) {
            System.out.println("A máquina foi limpa!");
            setLimpa(true);
            setCapacidadeShampoo(getCapacidadeShampoo() - 1);
            setCapacidadeAgua(getCapacidadeAgua() - 3);
        } else if (isOcupado()) {
            System.out.println("Retire o Pet da máquina para limpá-la!");
        } else if (getCapacidadeAgua() >= 3 && getCapacidadeShampoo() >= 1){
            System.out.printf("Não há água/shampoo o suficiente! Água: %02dL | Shampoo: %02dL", getCapacidadeAgua(), getCapacidadeShampoo());
        } else {
            System.out.println("A máquina já está limpa!");
        }
    }
}
