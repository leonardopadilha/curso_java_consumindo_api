package br.com.desafios_programacao.qa_world.ex03;

import java.util.Arrays;
import java.util.Scanner;

public class ex01_a_palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String palavraInvertida = "";

        System.out.print("Digite a palavra ou frase: ");
        String texto = teclado.nextLine();

        // Removendo pontuações
        String textoSemPontuacao = texto.replaceAll("\\p{Punct}", "");

        // Removendo espaços em branco
        String textoSemEspaco = textoSemPontuacao.replace(" ", "");

        String[] palindromo = textoSemEspaco.split("");
        if (palindromo[0] == palindromo[palindromo.length - 1]) {
            System.out.println("desculpe, mas " + texto + " nao e um palindromo");
        } else {
            for (int i = palindromo.length - 1; i >= 0; i--) {
                palavraInvertida += palindromo[i];
            }
        }

        String resultado = palavraInvertida.equalsIgnoreCase(textoSemEspaco) ?
                texto + " e um palindromo" :
                texto + " nao e um palindromo";
        
        System.out.println(resultado);
    }
}
