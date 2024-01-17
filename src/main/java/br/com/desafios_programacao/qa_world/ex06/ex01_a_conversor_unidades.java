package br.com.desafios_programacao.qa_world.ex06;

import java.util.Scanner;

public class ex01_a_conversor_unidades {
    public static void main(String[] args) {

        double resultado = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor para alteracao: ");
        double valor = teclado.nextInt();

        System.out.print("Informe a medida atual: ");
        String medida = teclado.next();

        if (medida.equalsIgnoreCase("milhas")) {
            resultado = valor * 1.609344;
        }
        if (medida.equalsIgnoreCase("quilometros")) {
            resultado = valor * 0.621371;
        }
        if (medida.equalsIgnoreCase("metros")) {
            resultado = valor * 3.28084;
        }
        if (medida.equalsIgnoreCase("pes")) {
            resultado = valor * 0.3048;
        }
        if (medida.equalsIgnoreCase("celsius")) {
            resultado = (valor * 1.8) + 32;
        }
        if (medida.equalsIgnoreCase("fahrenheit")) {
            resultado = (valor - 32) / 1.8;
        }

        System.out.print("Resultado da conversao: " + resultado);
    }
}
