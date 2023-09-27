package br.com.alura.screenmatch.desafio_listas_colecoes.formaDePagamento;

public class CartaoCredito extends MetodoPagamento {

    public CartaoCredito(double saldo) {
        super(saldo);
    }

    public double descontoCartao(double valor) {
        if (valor > saldo) {
            return saldo;
        }
        return saldo -= valor;
    }
}
