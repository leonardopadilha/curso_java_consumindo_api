package br.com.alura.estudo;

import java.io.*;

public class ExemploFile {
    public static void main(String[] args) throws IOException {
        File file = new File("./meuArquivoFile");
        FileWriter writer = new FileWriter(file);
        writer.write("Hello World!");
        writer.close();

        FileReader reader = new FileReader(file);
        int data = reader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = reader.read();
        }
        reader.close();
    }
}

/**
 Algumas classes do java.io
 BufferedReader / BufferedWriter;
 FileInputStream / FileOutStream;
 ObjectInputStream / ObjectOutputStream;

 FileWriter --> escrita simples
 Scanner --> Ler arquivos do computador de uma maneira simples, também lê dados de teclado, string...
 */
