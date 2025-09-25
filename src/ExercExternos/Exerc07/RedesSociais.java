package ExercExternos.Exerc07;

import java.util.Scanner;

public class RedesSociais extends Mensagem{
    public RedesSociais(String texto){
        super(texto);
    }

    @Override
    public void enviarMensagem(Scanner sc) {
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        if (nome.isEmpty()){
            throw new IllegalArgumentException("\nColoque um nome válido");
        }


        System.out.println("\nEnviando Notificação de Rede Social...");
        System.out.println("============");
        System.out.println("Remetente: " + nome);
        System.out.println("Mensagem: " + getTexto());
    }
}
