package br.com.desafios_programacao.qa_world.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex01_a_lista_tarefas {
    public static void main(String[] args) {

        String tarefas = "";
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de tarefas descritas: ");
        int qtdTarefas = teclado.nextInt();

        List<String> listaTarefas = new ArrayList<>(qtdTarefas);

        for (int i = 0; i < qtdTarefas; i++) {
            System.out.print("Informe a " + (i + 1) + " tarefa: ");
            tarefas = teclado.next();
            listaTarefas.add(tarefas);
        }

        System.out.print("Deseja excluir alguma atividade? ");
        String resposta = teclado.next();

        if (resposta.equalsIgnoreCase("nao")) {
            for (String tarefasDiarias : listaTarefas) {
                int contador = 1;
                System.out.println(contador + " tarefa: " + tarefasDiarias);
                contador++;
            }
        } else {
            System.out.print("Informe a tarefa: ");
            String tarefaRemocao = teclado.next();
            listaTarefas.remove(tarefaRemocao);

            for (String tarefasDiarias : listaTarefas) {
                int contador = 1;
                System.out.println(contador + " tarefa: " + tarefasDiarias);
                contador++;
            }
        }
        }
    }
