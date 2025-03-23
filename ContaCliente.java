package Abertura_do_pedido.Abertura_do_pedido.Conta;

public class ContaCliente extends Conta{
    private String endereco;

    public ContaCliente(String nome, String cpf, String telefone, String senha) {
        super(nome, cpf, telefone, senha);
        this.endereco = endereco;

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void Exibir(){
        System.out.println("");
    }
}
