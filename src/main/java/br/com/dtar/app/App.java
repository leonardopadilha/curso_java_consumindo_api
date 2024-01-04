package br.com.dtar.app;

import br.com.dtar.dto.Acompanhante;
import br.com.dtar.dto.Viagem;
import br.com.dtar.enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.GOIAS);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Ananda");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Márcia");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);

        viagem.setAcompanhantes(acompanhantes);

        System.out.println(viagem.getDestino().getCidade());
        //System.out.println(viagem.getAcompanhantes().get(0).getNome());
        //System.out.println(viagem.getAcompanhantes().get(1).getNome());

        /*
        for (int i = 0; i < viagem.getAcompanhantes().size(); i++) {
            System.out.println(viagem.getAcompanhantes().get(i).getNome());
        }
        */

        for(Acompanhante acompanhante : viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome() + " - " + acompanhante.isConfirmouCadastro());
        }
    }
}
