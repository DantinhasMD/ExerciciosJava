/* Crie a classe ClienteVip com os atributos privados:
● nome (String)
● cpf (String)
● limiteCredito (double)

Implemente os métodos get e set, validando que:
● O CPF deve ter 11 dígitos (sem caracteres especiais)
● O limite de crédito deve estar entre R$ 1.000,00 e R$ 100.000,00

Crie o método exibirCliente() para mostrar os dados de forma formatada. */

package POO.Poo8;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteCredito;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(String cpf){
        if (cpf.length() == 11 && cpf.matches("\\d{11}")){
            this.cpf = cpf;
        } else {
            System.out.println("CPF precisa conter 11 dígitos\n");
        }
    }

    public void setLimiteCredito(double limiteCredito){
        if (limiteCredito > 1000 && limiteCredito < 100000){
            this.limiteCredito = limiteCredito;
        } else {
            System.out.println("Limite de Crédito precisa estar entre R$ 1.000,00 e R$ 100.000,00\n");
        }
    }

    public void getExibirCliente(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Limite de Crédito: " + this.limiteCredito);
    }
}
