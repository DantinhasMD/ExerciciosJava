package ExercExternos.Exerc05;

abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;
    protected boolean logado;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getAdministrador() {
        if (administrador){
            return "Sim";
        } else {
            return "Não";
        }
    }

    public boolean getLogado() {
        return logado;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    //Métodos
    abstract void mostrarMenu();

    abstract void realizarLogin();

    abstract void alterarDados();

    abstract void alterarSenha();

    abstract void realizarLogoff();
}
