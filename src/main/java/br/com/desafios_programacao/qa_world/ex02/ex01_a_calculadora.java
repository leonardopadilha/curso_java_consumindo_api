package br.com.desafios_programacao.qa_world.ex02;

import java.util.Scanner;

public class ex01_a_calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = teclado.nextInt();

        System.out.print("Digite o sinal da operacao desejada: ");
        String operacao = teclado.next();

        System.out.print("Digite o segundo valor: ");
        int segundoValor = teclado.nextInt();

        switch (operacao) {
            case "+" :
                System.out.println(primeiroValor + segundoValor);
                break;
            case "-" :
                System.out.println(primeiroValor - segundoValor);
                break;
            case "*" :
                System.out.println(primeiroValor * segundoValor);
                break;
            case "/" :
                if (segundoValor > 0) {
                    System.out.println(primeiroValor / segundoValor);
                    break;
                } else {
                    System.out.println("Nao e possivel dividir por zero");
                    break;
                }
            default:
                System.out.println("Valores invalidos para essa operacao");
                break;
        }
    }
}
