package br.com.desafios_programacao.qa_world.ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex01_a_gerar_numeros_aleatorios {
    public static void main(String[] args) {
        int i = 0;
        List<Integer> numeros = new ArrayList<>();

        while (i < 6) {
            Random aleatorio = new Random();
            int numeroAleatorio = aleatorio.nextInt(60) + 1;
            if (numeros.contains(numeroAleatorio)) {
                System.out.println("Esse numero ja foi adicionado: " + numeroAleatorio);
            } else {
                numeros.add(numeroAleatorio);
            }
            i++;
        }

        for (int sorteio : numeros) {
            System.out.print(sorteio + " ");
        }
    }
}
