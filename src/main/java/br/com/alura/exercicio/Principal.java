package br.com.alura.exercicio;

public class Principal {
    public static void main(String[] args) {
        Servico servico = new Servico();
        servico.setNome("Varrer");
        servico.setPreco(200.00);

        //System.out.println(servico.calculaImposto());
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calculaImposto(servico));


    }
}
