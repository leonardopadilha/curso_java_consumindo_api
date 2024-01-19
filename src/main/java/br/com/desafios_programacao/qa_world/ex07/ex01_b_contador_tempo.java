package br.com.desafios_programacao.qa_world.ex07;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ex01_b_contador_tempo {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escolha a opcao desejada: \n" + "1 - Temporizador \n" + "2 - Regressivo");
        int numDesejado = teclado.nextInt();

        System.out.println("Digite o tempo em segundos: ");
        int tempoDesejado = teclado.nextInt();

        if (numDesejado == 1) {
            for (int i = 1; i <= tempoDesejado; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } else if (numDesejado == 2) {
            for (int i = tempoDesejado; i >= 1; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } else {
            System.out.println("Numero invalido!!");
        }
        System.out.println("Fim!!!!");
    }

}
