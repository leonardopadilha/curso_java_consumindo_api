package br.com.dtar.dto;

import br.com.dtar.enums.Destinos;

import java.util.List;

public class ViagemInternacional extends Viagem {
    private String passaporte;

    public ViagemInternacional(Destinos destinos) {
        super(destinos);
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        if (acompanhantes.size() <= 1) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que 1 acompanhante");
        }
    }
}
