package Abertura_do_pedido.Abertura_do_pedido;

import Abertura_do_pedido.Abertura_do_pedido.Conta.Motoboy;
import Abertura_do_pedido.StatusEntrega.StatusEntrega;

public class Pedido {
    private Cliente cliente;
    private Motoboy motoboy;
    private double peso;
    private double distancia;
    private double tempoEstimado;
    private double valorFrete;
    private StatusEntrega status;

    public Pedido(Cliente cliente, double peso, double distancia, double tempoEstimado) {
        this.cliente = cliente;
        this.peso = peso;
        this.distancia = distancia;
        this.tempoEstimado = tempoEstimado;
        this.valorFrete = calcularFrete();
        this.status = StatusEntrega.AGENDADA;
    }

    private double calcularFrete() {
        double precoPeso = calcularPrecoPeso();
        double precoDistancia = distancia * 0.50;
        double precoTempo = tempoEstimado * 0.30;
        return precoPeso + precoDistancia + precoTempo;
    }

    private double calcularPrecoPeso() {
        if (peso < 1) return 3.00;
        if (peso <= 3) return 5.00;
        if (peso <= 8) return 9.00;
        if (peso <= 12) return 12.00;
        return 0; // Não pode ser transportado
    }

    public void aceitarEntrega(Motoboy motoboy) {
        this.motoboy = motoboy;
        this.status = StatusEntrega.EM_ANDAMENTO;
    }

    public void finalizarEntrega() {
        if (this.status == StatusEntrega.EM_ANDAMENTO) {
            this.status = StatusEntrega.FINALIZADA;
            motoboy.adicionarSaldo(valorFrete * 0.7); // 70% do valor para o motoboy
        }
    }
}
