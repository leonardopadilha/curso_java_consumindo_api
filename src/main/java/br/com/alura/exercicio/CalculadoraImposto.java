package br.com.alura.exercicio;

public class CalculadoraImposto {
    private double totalImposto = 0;

    public double calculaImposto(Tributavel tributavel) {
        return totalImposto += tributavel.calculaImposto();
    }
}
