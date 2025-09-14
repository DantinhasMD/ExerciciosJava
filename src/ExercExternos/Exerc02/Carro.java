package ExercExternos.Exerc02;

public class Carro {
    private String status;
    private int velocidade;
    private int marcha;

    public Carro(){
        this.status = "Desligado";
        this.velocidade = 0;
        this.marcha = 0;
    }

    // Getters
    public String getStatus() {
        return status;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    // Setters
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Métodos
    public void ligarCarro(){
        if (getStatus().equals("Desligado")){
            setStatus("Ligado");
            System.out.println("O carro foi ligado!");
        } else {
            System.out.println("Carro já está ligado!");
        }
    }

    public void desligarCarro(){
        if (getStatus().equals("Ligado") && getMarcha() == 0 && getVelocidade() == 0){
            setStatus("Desligado");
            System.out.println("O carro foi desligado!");
        } else if (getVelocidade() > 0) {
            System.out.println("A velocidade precisa ser zerada para desligar o carro");
        } else {
            System.out.println("Carro já está desligado!");
        }
    }

    public void acelerarVelocidade() {
        if (getStatus().equals("Desligado")) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (getMarcha() == 0) {
            System.out.println("O carro está em ponto morto, não pode acelerar!");
            return;
        }

        // Limites por marcha
        int limiteMax = switch (getMarcha()) {
            case 1 -> 20;
            case 2 -> 40;
            case 3 -> 60;
            case 4 -> 80;
            case 5 -> 100;
            case 6 -> 120;
            default -> 0;
        };

        if (getVelocidade() < limiteMax) {
            setVelocidade(getVelocidade() + 1);
            System.out.printf("Carro acelerou! Velocidade atual: %02dkm/h (Marcha %d)\n",
                    getVelocidade(), getMarcha());
        } else {
            System.out.printf("Velocidade máxima da marcha %d atingida (%dkm/h). Troque de marcha!\n",
                    getMarcha(), limiteMax);
        }
    }

    public void diminuirVelocidade() {
        if (getStatus().equals("Desligado")) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (getMarcha() == 0) {
            System.out.println("O carro está em ponto morto, não pode reduzir velocidade!");
            return;
        }

        // Limites mínimos por marcha
        int limiteMin = switch (getMarcha()) {
            case 1 -> 0;
            case 2 -> 20;
            case 3 -> 40;
            case 4 -> 60;
            case 5 -> 80;
            case 6 -> 100;
            default -> 0;
        };

        if (getVelocidade() > limiteMin) {
            setVelocidade(getVelocidade() - 1);
            System.out.printf("Carro reduziu! Velocidade atual: %02dkm/h (Marcha %d)\n",
                    getVelocidade(), getMarcha());
        } else {
            System.out.printf("Velocidade mínima da marcha %d atingida (%dkm/h). Reduza a marcha!\n",
                    getMarcha(), limiteMin);
        }
    }

    public void virarCarro(){
        if (getVelocidade() > 0 && getVelocidade() <= 40){
            System.out.println("O Carro virou para esquerda/direita");
        } else if (getVelocidade() > 40){
            System.out.println("O Carro está muito rápido para trocar de direção!");
        } else {
            System.out.println("O Carro precisa estar com velocidade maior do que zero!");
        }
    }

    public void verificarVelocidade(){
        System.out.printf("Velocidade: %02d", getVelocidade());
    }

    public void trocarMarcha(){
        if (getStatus().equals("Desligado")) {
            System.out.println("O Carro está desligado! Não pode trocar de Marcha");
            return;
        }

        // Lógica para aumentar a marcha
        if (getMarcha() == 0 && getVelocidade() >= 0) {
            setMarcha(1);
            System.out.printf("Marcha Atual: %02d | Velocidade: %02d\n", getMarcha(), getVelocidade());
            return;
        }

        // Verificações para aumentar a marcha
        int proximaMarcha = getMarcha() + 1;
        int limiteMinParaProximaMarcha = 0;

        // Define o limite mínimo para a próxima marcha
        switch (proximaMarcha) {
            case 2: limiteMinParaProximaMarcha = 20; break;
            case 3: limiteMinParaProximaMarcha = 40; break;
            case 4: limiteMinParaProximaMarcha = 60; break;
            case 5: limiteMinParaProximaMarcha = 80; break;
            case 6: limiteMinParaProximaMarcha = 100; break;
        }

        // Se a velocidade for alta o suficiente, aumenta a marcha
        if (getVelocidade() >= limiteMinParaProximaMarcha && getMarcha() < 6) {
            setMarcha(proximaMarcha);
            System.out.printf("Marcha aumentada! Marcha Atual: %02d | Velocidade: %02d\n", getMarcha(), getVelocidade());
            return;
        }

        // Lógica para diminuir a marcha
        int marchaAnterior = getMarcha() - 1;
        int limiteMaxMarchaAnterior = 0;

        // Define o limite máximo da marcha anterior
        switch (marchaAnterior) {
            case 1: limiteMaxMarchaAnterior = 20; break;
            case 2: limiteMaxMarchaAnterior = 40; break;
            case 3: limiteMaxMarchaAnterior = 60; break;
            case 4: limiteMaxMarchaAnterior = 80; break;
            case 5: limiteMaxMarchaAnterior = 100; break;
            case 6: limiteMaxMarchaAnterior = 120; break;
            default: limiteMaxMarchaAnterior = 120; break; // Ponto morto, pode engatar a qualquer velocidade.
        }

        // Se a velocidade for baixa o suficiente, diminui a marcha
        if (getVelocidade() <= limiteMaxMarchaAnterior && getMarcha() > 0) {
            setMarcha(marchaAnterior);
            System.out.printf("Marcha reduzida! Marcha Atual: %02d | Velocidade: %02d\n", getMarcha(), getVelocidade());
            return;
        }

        // Se nenhuma das condições acima for atendida, informa ao usuário
        System.out.println("Não foi possível trocar a marcha. A velocidade atual não permite esta ação.");
    }
}
