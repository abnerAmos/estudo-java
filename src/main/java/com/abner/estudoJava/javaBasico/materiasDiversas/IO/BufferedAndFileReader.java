package com.abner.estudoJava.javaBasico.materiasDiversas.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedAndFileReader {

    public static void main(String[] args) {

        String path = "C:\\Windows\\Temp\\in.txt";

        /* Buffered é mais performatico que File, porém necessita de File para funcionar,
        Buffered faz uma leitura mais rápida
         */
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {    // Recebe o caminho do arquivo
            String line = br.readLine();    // Faz a leitura das linhas

            while (line != null) {          // Loop para leitura de linha por linha
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
