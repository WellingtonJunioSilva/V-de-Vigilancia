package Abertura_do_pedido;

public class Produto {
    private String nomeDoProduto;
    private double peso;

    public Produto(String nomeDoProduto, double peso){
        this.nomeDoProduto = nomeDoProduto;
        this.peso = peso;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
