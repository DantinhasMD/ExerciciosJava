package ExercExternos.Exerc07;

import java.util.*;

public class SMS extends Mensagem{
    public SMS(String texto){
        super(texto);
    }

    @Override
    public void enviarMensagem(Scanner sc) {
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        if (nome.isEmpty()){
            throw new IllegalArgumentException("\nColoque um nome válido");
        }

        System.out.println("Digite seu telefone: ");
        int telefone;
        try {
            telefone = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("\nDigite apenas números válidos para o telefone!");
        }

        System.out.println("\nEnviando SMS...");
        System.out.println("============");
        System.out.println("Remetente: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Mensagem: " + getTexto());
    }
}
