package br.com.alura.estudo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        try {
            File arquivo = new File("arquivo.json");
            Scanner scanner = new Scanner(arquivo);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.print(linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}

/**
 hasNextLine() -> Verifica se há mais linhas a serem lidas
 nextLine() -> Lê a próxima linha do arquivo
 */


