package com.abner.estudoJava.javaBasico.operacoesString;

public class IndexOf {

    public static void main(String[] args) {

        // Obtem um indexador a partir de um texto;

        String texto = "Aula de Programacao";
        int index = texto.indexOf("Programacao");       // Se houver mais de uma ocorrencia, pega a primeira;
        System.out.println(index);                      // Se for um subtexto, retorna o index da primeira letra;

        int index2 = texto.indexOf("logica");           // Quando não encontra uma ocorrencia, retorna: -1
        System.out.println(index2);

        if (texto.indexOf("Aula") != -1)
            System.out.println("Palavra existe no texto");
    }
}