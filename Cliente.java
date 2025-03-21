package Abertura_do_pedido;

import Conta.Conta;

public class Cliente extends Conta {
    private String email;
    private String endereco;
    private String cep;

    public Cliente(String nome, String cpf, String telefone, String senha, String endereco,String cep,
                   String email) {
        super(nome, cpf, telefone, senha);
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
