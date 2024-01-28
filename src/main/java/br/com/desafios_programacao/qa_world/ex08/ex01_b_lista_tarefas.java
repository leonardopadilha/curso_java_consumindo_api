package br.com.desafios_programacao.qa_world.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex01_b_lista_tarefas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int qtdTarefas = 0;
        String tarefa = "";
        String tarefaRemovida = "";

        List<String> listaTarefas = new ArrayList<>();

        //Lista de tarefas
        System.out.println(" ###### Lista de Tarefas ###### ");

        System.out.println("O que deseja fazer: \n 1 - Incluir tarefas \n 2 - Sair");
        int opcao = teclado.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a quantidade de tarefas: ");
            qtdTarefas = teclado.nextInt();

            for (int i = 0; i < qtdTarefas; i++) {
                System.out.print("Informe a " + (i + 1) + " tarefa: ");
                tarefa = teclado.next();
                adicionaTarefaLista(listaTarefas, tarefa);
            }
        } else if (opcao == 2) {
            System.out.print("Ate logo!!");
        } else {
            System.out.println("Ops :( !");
        }

        System.out.println("O que deseja fazer: \n 1 - Imprimir lista \n 2 - Remover item da lista");
        int opcaoLista = teclado.nextInt();

        if (opcaoLista == 1) {
            imprimeListaTarefas(listaTarefas);
        } else if (opcaoLista == 2) {
            System.out.println("Informe a tarefa a ser removida: ");
            tarefaRemovida = teclado.next();
            removeTarefaLista(listaTarefas, tarefaRemovida);
        }

        System.out.println(" ");

        imprimeListaTarefas(listaTarefas);

        System.out.println("Fim !!!!");
    }

    public static void adicionaTarefaLista(List<String> listaTarefas, String tarefa) {
        listaTarefas.add(tarefa);
    }

    public static void imprimeListaTarefas(List<String> listaTarefas) {
        System.out.println(" ###### ATIVIDADES ######");
        for (String tarefas : listaTarefas) {
            System.out.println(tarefas);
        }
    }

    public static void removeTarefaLista(List<String> listaTarefas, String tarefa) {
        if (listaTarefas.contains(tarefa)) {
            listaTarefas.remove(tarefa);
        } else {
            System.out.println("Item digitado invalido!!!");
        }

    }
}
