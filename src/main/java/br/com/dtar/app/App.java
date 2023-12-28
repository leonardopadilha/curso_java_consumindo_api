package br.com.dtar.app;

import br.com.dtar.dto.Viagem;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem("Londres");

        System.out.println(viagem.destino);

    }
}
