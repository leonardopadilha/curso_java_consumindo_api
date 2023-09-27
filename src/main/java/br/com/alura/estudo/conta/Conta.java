package br.com.alura.estudo.conta;

import br.com.alura.estudo.tipoConta.TipoConta;
import br.com.alura.estudo.titular.Pessoa;

public class Conta {
  private Pessoa titularConta;
  private String numeroConta;
  private TipoConta tipoConta;
  private float saldo;

  public Conta(Pessoa titularConta, TipoConta tipoConta, String numeroConta) {
     this.titularConta = titularConta;
     this.tipoConta = tipoConta;
     this.numeroConta = numeroConta;
  }

  public String getNumeroConta() {
     return numeroConta;
  }

  public void deposita(float valor) {
     if (valor < 0){
        System.out.println("Valor de depósito precisa ser acima de 0");
        return;
     }
     saldo += valor;
  }

  public float saldo() {
     return this.saldo;
  }

  public TipoConta retornaDescricao() {
     return this.tipoConta;
  }

  public String retornaInformacoes() {
     return "*********************************" + "\n" +
                 "Dados iniciais do cliente: " + "\n" +
                 "Nome: " + titularConta.getNome() + "\n" +
                 "Saldo inicial: " + saldo() + "\n" +
            "*********************************";
  }
}
