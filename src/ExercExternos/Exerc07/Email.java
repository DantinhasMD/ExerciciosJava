package ExercExternos.Exerc07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Email extends Mensagem{
    public Email(String texto){
        super(texto);
    }

    @Override
    public void enviarMensagem(Scanner sc) {
        System.out.print("Digite seu e-mail: ");
        String email = sc.nextLine().trim();

        // Validação básica com regex (mais robusta que contains)
        if (email.isEmpty() || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new IllegalArgumentException("Digite um e-mail válido!");
        }

        System.out.println("\nEnviando Email...");
        System.out.println("============");
        System.out.println("Email: " + email);
        System.out.println("Mensagem: " + getTexto());
    }
}
