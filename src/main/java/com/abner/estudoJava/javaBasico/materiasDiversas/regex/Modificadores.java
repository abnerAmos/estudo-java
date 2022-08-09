package com.abner.estudoJava.javaBasico.materiasDiversas.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Modificadores {

    // MODIFICADORES

    // ?i        Ignora maiusculos e minusculos
    // ?g        Toda a ocorrência
    // ?m        Quebras de linha

    public static void main(String[] args) {

        Boolean mdf = "AbNer".matches("(?i)[a-z]{2,}");
        System.out.println(mdf);

    }
}
