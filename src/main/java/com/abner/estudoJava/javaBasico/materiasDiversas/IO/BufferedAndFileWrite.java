package com.abner.estudoJava.javaBasico.materiasDiversas.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedAndFileWrite {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Abner Amos");
        names.add("Juliana Menezes");
        names.add("Anna Beatriz");

        String path = "C:\\Windows\\Temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {    // Recebe o caminho do arquivo

            for (int i = 0; i < names.size(); i++) {    // itera a Lista
                bw.write(names.get(i));     // Insere item por item no arquivo
                bw.newLine();   // Insere uma nova linha
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
