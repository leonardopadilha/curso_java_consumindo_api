package br.com.dtar.dto;

import br.com.dtar.enums.Destinos;

import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

    public Viagem(Destinos destino) {
        this.destino = destino;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    public List<Acompanhante> getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        this.acompanhantes = acompanhantes;
    }
}
