package br.com.alura.estudo.principal;

import br.com.alura.estudo.conta.Conta;
import br.com.alura.estudo.conta.ContaPoupanca;
import br.com.alura.estudo.impressaoDados.ImprimirDados;
import br.com.alura.estudo.tipoConta.TipoConta;
import br.com.alura.estudo.titular.CPF;
import br.com.alura.estudo.titular.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        CPF cpf = new CPF("123.456.789-10");
        Pessoa pessoa = new Pessoa("Teste da Silva", cpf);
        ContaPoupanca conta = new ContaPoupanca(pessoa, TipoConta.POUPANCA, "123456");
        conta.deposita(100);
        //System.out.println(conta.saldo());

        ContaPoupanca novaConta = new ContaPoupanca(pessoa, TipoConta.POUPANCA, "1234567");
        novaConta.deposita(200);

        ImprimirDados imprimirDados = new ImprimirDados();
        //imprimirDados.imprimir(conta);
        //conta.retornaInformacoes();

        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta);
        contas.add(novaConta);

        for(Conta contasPessoais : contas) {
            System.out.println(contasPessoais.retornaInformacoes());
            System.out.println();
        }
    }
}
