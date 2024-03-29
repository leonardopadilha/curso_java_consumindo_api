package br.com.dtar.dto;

import br.com.dtar.enums.Destinos;
import br.com.dtar.interfaces.CalculadoraDePrevisao;
import br.com.dtar.utils.ArquivosUtils;

import java.util.List;

public class ViagemInternacional extends Viagem implements CalculadoraDePrevisao {
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

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que " + limiteDeAcompanhantes + " acompanhante");
        }
    }

    @Override
    public int calcularPrevisaoDeDiasParaRetorno() {
        if (this.getDestino().equals(Destinos.MIAMI)) {
            return 1;
        }
        return 0;
    }
}
