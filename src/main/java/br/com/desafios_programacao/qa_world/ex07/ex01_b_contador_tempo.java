package br.com.desafios_programacao.qa_world.ex07;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ex01_a_contador_tempo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        LocalDateTime localTime = LocalDateTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = localTime.format(timeFormatter);


/*        System.out.print("Informe o tempo maximo do contador de tempo: ");
        int tempo = teclado.nextInt();

        for (int i = tempo; i > 0; i--) {
            System.out.println(formattedDate);
        }*/

        System.out.println("Final: " + formattedDate);
    }

}
