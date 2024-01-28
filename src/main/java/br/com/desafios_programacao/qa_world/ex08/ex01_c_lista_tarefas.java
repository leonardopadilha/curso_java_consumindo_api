package br.com.desafios_programacao.qa_world.ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex01_c_lista_tarefas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> listaTarefas = new ArrayList<>();

        exibirMenuInicial(teclado, listaTarefas);
        int opcaoLista = teclado.nextInt();
        processarOpcaoLista(teclado, listaTarefas, opcaoLista);
        System.out.println("\nFim !!!!");
    }

    private static void exibirMenuInicial(Scanner teclado, List<String> listaTarefas) {
        System.out.println(" ###### Lista de Tarefas ###### ");
        System.out.println("O que deseja fazer:\n 1 - Incluir tarefas\n 2 - Sair");

        int opcao = teclado.nextInt();

        if (opcao == 1) {
            adicionarTarefas(teclado, listaTarefas);
        } else if (opcao == 2) {
            System.out.println("Até logo!!");
            System.exit(0);
        } else {
            System.out.println("Ops :( Opção inválida!");
        }
    }

    private static void adicionarTarefas(Scanner teclado, List<String> listaTarefas) {
        System.out.print("Digite a quantidade de tarefas: ");
        int qtdTarefas = teclado.nextInt();

        for (int i = 0; i < qtdTarefas; i++) {
            System.out.print("Informe a " + (i + 1) + " tarefa: ");
            adicionaTarefaLista(listaTarefas, teclado.next());
        }
    }

    private static void processarOpcaoLista(Scanner teclado, List<String> listaTarefas, int opcaoLista) {
        if (opcaoLista == 1) {
            imprimeListaTarefas(listaTarefas);
        } else if (opcaoLista == 2) {
            System.out.print("Informe a tarefa a ser removida: ");
            removeTarefaLista(teclado.next(), listaTarefas);
        }
    }

    private static void adicionaTarefaLista(List<String> listaTarefas, String tarefa) {
        listaTarefas.add(tarefa);
    }

    private static void imprimeListaTarefas(List<String> listaTarefa) {
        System.out.println(" ###### ATIVIDADES ######");
        for (String tarefa : listaTarefa) {
            System.out.println(tarefa);
        }
    }

    private static void removeTarefaLista(String tarefa, List<String> listaTarefa) {
        if (listaTarefa.remove(tarefa)) {
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada na lista!");
        }
    }
}
