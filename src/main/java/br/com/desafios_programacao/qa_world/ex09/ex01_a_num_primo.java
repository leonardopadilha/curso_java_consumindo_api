package br.com.desafios_programacao.qa_world.ex09;

import java.util.Scanner;

public class ex01_a_num_primo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String sair = "";

        System.out.print("Digite 1 numero de 1 - 100: ");
        int numDigitado = teclado.nextInt();

        int contador = 0;
        for (int i = 1; i <= numDigitado; i++) {
            if (numDigitado % i == 0) {
                contador++;
            }
        }

        System.out.print("Digite 1 para primo e 2 para nao Primo: ");
        int numPrimo = teclado.nextInt();

        int pontuacao = 0;
        if ((numPrimo == 1 && contador == 2) || (numPrimo == 2 && contador > 2)) {
            System.out.println("Parabens!! Voce acertou!!");
            pontuacao += 1;
        } else if ((numPrimo == 1 && contador > 2) || (numPrimo == 2 && contador == 2)){
            System.out.println("Que pena! Tente novamente mais tarde.");
        }

        System.out.print("Digite 1 para conferir a pontuacao, 2 para zerar os pontos e 3 para continuar jogando: ");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.println("Pontos totais: " + pontuacao);
        } else if (opcao == 2) {
            System.out.println("Pontos zerados " + (pontuacao = 0));
        }

        System.out.println("Fim da exibicao!!!");
    }
}
