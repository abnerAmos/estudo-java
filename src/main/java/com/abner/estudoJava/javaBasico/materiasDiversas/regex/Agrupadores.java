package com.abner.estudoJava.javaBasico.materiasDiversas.regex;

public class Agrupadores {

    // AGRUPADORES []

    // [abc]        Aceita qualquer letra determinada dentro do grupo;
    // [a-z]        Aceita qualquer letra dentro da extensão do grupo;
    // [a-z][a-z]   Aceita qualquer letra dentro das extensões dos grupos;
    // [^abc]       Recusa/Nega qualquer letra determinado dentro do grupo;
    // [0-9]        Aceitar qualquer numero determinado dentro do grupo; (traço - significa range, de qual a qual).
    // [^0-9]       Recusa/Nega qualquer numero determinado dentro do grupo;
    // .matches     Dentro das () necessário colocar as [] dentro de "". Ex.: nome.matches("[nome]");

    public static void main(String[] args) {

        Boolean agp = "Abner".matches("[A][b][n][e][r]");   // cada [] representa UMA letra (há diferenciação de Minusculas e Maiusculas);
        Boolean agp2 = "Abner".matches("[Abner]");          // colocar mais de uma letra dentro de [] aceita APENAS UMA das letras informadas;
        System.out.println(agp);
        System.out.println(agp2);

        Boolean agp3 = "Abner".matches("[A-Z][a-z][a-z][a-z][a-z]");    // cada [] representa uma "range" de qual a qual letra pode ser aceita (minusculas);
        Boolean agp4 = "Abner".matches("[a-z]");                        // Se a palavar possui 5 Letras, necessário [] 5x;
        System.out.println(agp3);
        System.out.println(agp4);

        Boolean agp5 = "Abner ".matches("[A-Z][a-z][a-z][a-z][a-z][^a-z]");   // ^ dentro de [] determina letras que não podem ser utilizadas;
        Boolean agp6 = "Abnera".matches("[A-Z][a-z][a-z][a-z][a-z][^a-z]");
        System.out.println(agp5);
        System.out.println(agp6);

        Boolean agp7 = "11".matches("[1][0-9]");
        Boolean agp8 = "111".matches("[1][0-9][^0-9]");
        System.out.println(agp7);
        System.out.println(agp8);
    }
}
