package br.com.desafios_programacao.qa_world.ex01;

import java.util.Scanner;

public class ex01_b_par_impar {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Informe um numero: ");

        int numParOuImpar = numero.nextInt();

        System.out.println(informaNumeroParOuImpar(numParOuImpar));;

    }

    public static String informaNumeroParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return numero + " -> Par";
        }
        return numero + " -> Impar";
    }
}
