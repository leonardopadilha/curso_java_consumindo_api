package br.com.dtar.app;

import br.com.dtar.dto.Viagem;
import br.com.enums.Destinos;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.GOIAS);

        System.out.println(viagem.getDestino().getCidade());
    }
}
