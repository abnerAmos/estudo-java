package com.abner.estudoJava.javaBasico.materiasDiversas.IO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAndScanner {

    public static void main(String[] args) {

        File file = new File("C:\\Windows\\Temp\\in.txt"); // Buscar o arquivo através do caminho
        Scanner input = null;

        try {
            input = new Scanner(file);  // Recebe o arquivo
            while (input.hasNext()) {   // Verifica linha por linha
                System.out.println(input.nextLine());   // imprime cada linha encontrada
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage()); // Gera uma Exception caso de algum erro de IO
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
