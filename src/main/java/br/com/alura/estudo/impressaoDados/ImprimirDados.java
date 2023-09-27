package br.com.alura.estudo.impressaoDados;

import br.com.alura.estudo.conta.Conta;
import br.com.alura.estudo.tipoConta.TipoConta;

public class ImprimirDados {

    public void imprimir(Conta conta) {
        if (conta.retornaDescricao().equals(TipoConta.CORRENTE)) {
            System.out.println("Sua conta é " + TipoConta.CORRENTE);
        } else if (conta.retornaDescricao().equals(TipoConta.POUPANCA)) {
            System.out.println("Sua conta é " + TipoConta.POUPANCA);
        }
    }
}
