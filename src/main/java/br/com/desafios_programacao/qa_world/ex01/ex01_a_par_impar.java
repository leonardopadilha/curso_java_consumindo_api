package br.com.desafios_programacao.qa_world.ex01;

import java.util.Scanner;

public class ex01_a_par_impar {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        System.out.print("Informe um numero: ");

        int numParOuImpar = numero.nextInt();

        if (numParOuImpar % 2 == 0) {
            System.out.print(numParOuImpar + " -> Par");
        } else {
            System.out.print(numParOuImpar + " -> Impar");
        }
    }
}
