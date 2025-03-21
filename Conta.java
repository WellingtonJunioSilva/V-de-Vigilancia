package Conta;

public abstract class Conta {
    protected String nome;
    protected String cpf;
    protected String telefone;
    protected String senha;

    public Conta(String nome, String cpf, String telefone, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public boolean validarSenha(String senhaDigitada) {

        return this.senha.equals(senhaDigitada);
    }


}




