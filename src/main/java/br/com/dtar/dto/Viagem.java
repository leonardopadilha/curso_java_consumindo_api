package br.com.dtar.dto;

import br.com.enums.Destinos;

public class Viagem {
    private Destinos destino;

    public Viagem(Destinos destino) {
        this.destino = destino;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }
}
