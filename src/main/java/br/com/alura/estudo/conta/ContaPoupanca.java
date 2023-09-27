package br.com.alura.estudo.conta;

import br.com.alura.estudo.tipoConta.TipoConta;
import br.com.alura.estudo.titular.Pessoa;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Pessoa titularConta, TipoConta tipoConta, String numeroConta) {
        super(titularConta, tipoConta, numeroConta);
    }
}
