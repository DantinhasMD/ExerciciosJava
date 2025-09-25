package ExercExternos.Exerc07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhatsApp extends Mensagem{
    public WhatsApp(String texto){
        super(texto);
    }

    @Override
    public void enviarMensagem(Scanner sc) {
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        if (nome.isEmpty()){
            throw new IllegalArgumentException("\nColoque um nome válido");
        }

        System.out.println("\nEnviando WhatsApp...");
        System.out.println("============");
        System.out.println("Remetente: " + nome);
        System.out.println("Mensagem: " + getTexto());
    }
}
