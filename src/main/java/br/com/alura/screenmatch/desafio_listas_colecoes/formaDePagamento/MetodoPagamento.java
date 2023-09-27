package br.com.alura.screenmatch.desafio_listas_colecoes.formaDePagamento;

public class MetodoPagamento {
    protected double saldo;

    public MetodoPagamento(double saldo) {
        this.saldo = saldo;
    }

    public double saldo() {
        return saldo;
    }

    public double descontoCartao(double valor) {
        if (valor > saldo) {
            return saldo;
        }
        return saldo -= valor;
    }
}
