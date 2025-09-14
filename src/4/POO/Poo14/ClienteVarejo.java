/* Crie a classe ClienteVarejo com os atributos privados:
● nome (String)
● cpf (String)

Implemente:
● Um construtor sem parâmetros que inicialize nome e cpf como strings vazias.
● Um construtor que receba nome e cpf. */

package POO.Poo14;

public class ClienteVarejo {
    private String nome;
    private String cpf;

    // Construtores
    public ClienteVarejo(){
        this.nome = "";
        this.cpf = "";
    }

    public ClienteVarejo(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirInformacoes(){
        System.out.printf("%s\n", getNome());
        System.out.printf("%s\n", getCpf());
    }
}
