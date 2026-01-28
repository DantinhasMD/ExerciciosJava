package Residencia.MVC.Exerc01.src.model;

public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;

    //Construtor
    public Cliente(int id, String nome, String email, String telefone, String cpf){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
        this.cpf = cpf;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "ID: " + id + " | Nome: " + cpf  + " | CPF: " + email + " | Email: " + email + " | Telefone: " + telefone;
    }
}
