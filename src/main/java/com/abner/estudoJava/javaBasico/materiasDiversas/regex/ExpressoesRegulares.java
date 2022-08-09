package com.abner.estudoJava.javaBasico.materiasDiversas.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {

    // Escape:              \\   Para aceitar caracteres especiais do java como texto;
    // Caracter Inicial:    ^   Indica que inicie com determinado caracter/palavra/numero etc. (desde que fora de um grupo).
    // Caracter Final:      $   Indica que termine com determinado caracter/palavra/numero etc.
    // Ou:                  |   Indica se possui Um ou Outro valor. (Ex.: Sim|Não).

    // AGRUPADORES []

    // [abc]        Aceita qualquer letra determinada dentro do grupo;
    // [a-z]        Aceita qualquer letra dentro da extensão do grupo;
    // [a-z][a-z]   Aceita qualquer letra dentro das extensões dos grupos;
    // [^abc]       Recusa/Nega qualquer letra determinado dentro do grupo;
    // [0-9]        Aceitar qualquer numero determinado dentro do grupo; (traço - significa range, de qual a qual).
    // [^0-9]       Recusa/Nega qualquer numero determinado dentro do grupo;

    // QUANTIFICADORES {}

    // {1}      Determina uma quantidade específica;
    // {2,}     Determina quantidade minima;
    // {2,5}    Determina quantidade minima e maxima;
    // ?        Zero ou um;
    // *        Zero ou muitos;
    // +        Um ou muitos;

    // METACARACTERES

    // .        Todos ou qualquer caracter
    // \w       Conjunto de [a-z A-Z 0-9 _]
    // \W       Negação do Conjunto [^a-z A-Z 0-9 _]
    // \d       Conjunto de [0-9]
    // \D       Negação do Conjunto [0-9]
    // \s       Espaços em branco
    // \S       Negação de espaços em branco
    // \n       Quebra de linha
    // \t       Tab

    // MODIFICADORES

    // ?i        Ignora maiusculos e minusculos (se utiliza no inicio com (?i))
    // ?g        Toda a ocorrência
    // ?m        Quebras de linha

    public static void main(String[] args) {

        String contato = "(11)97385-1774";
        boolean teste = contato.matches("\\(11\\)97385-1774");
        // System.out.println(teste);

        String contato2 = "(11)97385-1774";
        boolean teste2 = contato.matches("\\([0-9][0-9]\\)97385-1774");
        // System.out.println(teste2);

        String contato3 = "(11)97385-1774";
        boolean teste3 = contato.matches("\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}");
        // System.out.println(teste3);

        String contato4 = "(11)97385-1774";
        String contato4b = "n(11)97385-1774";
        boolean teste4 = contato4.matches("^\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}");
        boolean teste4b = contato4b.matches("^\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}");
        // System.out.println(teste4);
        // System.out.println(teste4b);

        String contato5 = "(11)97385-1774";
        String contato5b = "(11)97385-1774x";
        boolean teste5 = contato5.matches("\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}$");
        boolean teste5b = contato5b.matches("\\([0-9]{2}\\)[0-9]{5}-[0-9]{4}$");
        // System.out.println(teste5);
        // System.out.println(teste5b);

        String nome = "Abner";
        boolean teste6 = nome.matches("[A-Z][a-z]{4}");
        // System.out.println(teste6);

        String nome2 = "Abner Amos de Souza";
        boolean teste7 = nome2.matches("[A-Z][a-z]{4} [A-Z][a-z]{3} [a-z]{2} [A-Z][a-z]{4}");
        // System.out.println(teste7);

        String nome3 = "AbNeR";
        boolean teste8 = nome3.matches("\\w{2,}");
        // System.out.println(teste8);

        String nome4 = "AbNeR Amos";
        boolean teste9 = nome4.matches("\\w{2,} \\w{1,4}");
       // System.out.println(teste9);

    }
}
