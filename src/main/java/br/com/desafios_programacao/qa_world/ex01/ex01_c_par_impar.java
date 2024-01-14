package br.com.desafios_programacao.qa_world.ex01;

import java.util.Scanner;

public class ex01_c_par_impar {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int numeros = 0;

        System.out.print("Informe a quantidade de numeros a ser digitado: ");
        int numParOuImpar = numero.nextInt();
        int[] totNumeros = new int[numParOuImpar];

        for (int i = 1; i <= totNumeros.length; i++) {
            System.out.print("Digite o " + i + " numero: ");

            try {
                numeros = numero.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: Valor informado invalido");
                return;
            }

            System.out.println(informaNumeroParOuImpar(numeros));
        }
    }

    public static String informaNumeroParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return numero + " -> Par";
        }
        return numero + " -> Impar";
    }
}
