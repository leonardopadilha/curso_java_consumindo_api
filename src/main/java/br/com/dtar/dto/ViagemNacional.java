package br.com.dtar.dto;

import br.com.dtar.enums.Destinos;
import br.com.dtar.utils.ArquivosUtils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

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

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens nacionais não podem ter mais que " +  limiteDeAcompanhantes + " acompanhante");
        }

    }
}
