package ExerciciosAplicados.Exerc02;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    //Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
