package com.abner.estudoJava.javaBasico.materiasDiversas.IO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateWriteRead {

    public static void main(String[] args) throws IOException {

        // Caminho do Arquivo

        Path caminho = Paths.get("C:\\Users\\Abner\\workspace\\TesteIO\\teste.txt");
        System.out.println(caminho.toAbsolutePath());
        System.out.println(caminho.getParent());
        System.out.println(caminho.getRoot());
        System.out.println(caminho.getFileName());

        // Criando um Diretório

        Files.createDirectories(caminho.getParent());

        // Escrevendo e Lendo Arquivos

        byte[] meuByte = "Teste IO".getBytes();
        Files.write(caminho, meuByte);          // Cria, Limpa e Escreve

        byte[] retorno = Files.readAllBytes(caminho);   // Fazendo a leitura
        System.out.println(new String(retorno));
    }
}
