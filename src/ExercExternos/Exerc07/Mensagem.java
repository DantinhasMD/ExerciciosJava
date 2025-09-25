package ExercExternos.Exerc07;

import java.util.Scanner;

public abstract class Mensagem {
    protected String texto;

    public Mensagem(String texto){
        setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public abstract void enviarMensagem(Scanner sc);
}
