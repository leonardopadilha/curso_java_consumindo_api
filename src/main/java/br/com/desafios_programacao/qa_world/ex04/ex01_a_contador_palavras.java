package br.com.desafios_programacao.qa_world.ex04;

import java.util.Scanner;

public class ex01_a_contador_palavras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a palavra ou frase desejada: ");
        String texto = teclado.nextLine();

        // Removendo sinais e espaços iniciais/finais, tanto 1 ou mais
        String textoSemPontuacao = texto.replaceAll("\\p{Punct}", "")
                                            .trim()
                                                .replaceAll("\\s+", " ");

        if (!textoSemPontuacao.isEmpty()) {
            String[] contadorFrase = textoSemPontuacao.split(" ");
            System.out.println("O texto contem " + contadorFrase.length + " palavras");
        } else {
            System.out.println("O texto contem 0 palavras");
        }
    }
}
