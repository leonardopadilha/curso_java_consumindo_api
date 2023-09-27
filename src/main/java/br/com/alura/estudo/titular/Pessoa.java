package br.com.alura.estudo.titular;

public class Pessoa {
    protected String nome;
    private CPF cpf;

    public Pessoa(String nome, CPF cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
}

