package Abertura_do_pedido.Abertura_do_pedido.Conta;

public class Motoboy extends Conta {

    private String nome;
    private String cpf;
    private String telefone;
    private String senha;
    private final String placaVeiculo;
    private String foto3x4;


    public Motoboy (String nome, String cpf, String telefone, String senha, String placaVeiculo) {
        super(nome, cpf, telefone, senha);
        this.placaVeiculo = placaVeiculo;

    }

    public void adicionarSaldo(double v) {

    }
}
