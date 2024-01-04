package br.com.dtar.dto;

public class Acompanhante {
    private String nome;
    private boolean confirmouCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isConfirmouCadastro() {
        return confirmouCadastro;
    }

    public void setConfirmouCadastro(boolean confirmouCadastro) {
        this.confirmouCadastro = confirmouCadastro;
    }
}
