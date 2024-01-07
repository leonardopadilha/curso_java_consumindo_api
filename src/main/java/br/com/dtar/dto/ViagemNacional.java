package br.com.dtar.dto;

import br.com.dtar.enums.Destinos;

import java.util.List;

public class ViagemNacional extends Viagem {

    private String cpf;

    public ViagemNacional(Destinos destinos) {
        super(destinos);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        if (acompanhantes.size() <= 4) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não podem ter mais que 4 acompanhante");
        }

    }
}
