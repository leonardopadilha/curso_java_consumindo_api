package br.com.alura.viacep.cep;

public class CEP {
    public CEP() {
    }

    public String retornaCEP(String cep) {
        return "https://viacep.com.br/ws/" + cep + "/json/";
    }
}
