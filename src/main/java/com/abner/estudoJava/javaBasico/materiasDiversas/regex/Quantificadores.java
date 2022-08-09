package com.abner.estudoJava.javaBasico.materiasDiversas.regex;

public class Quantificadores {

    // QUANTIFICADORES {}

    // {1}      Determina uma quantidade específica;
    // {2,}     Determina quantidade minima;
    // {2,5}    Determina quantidade minima e maxima;
    // ?        Zero ou um;
    // *        Zero ou muitos;
    // +        Um ou muitos;

    public static void main(String[] args) {

        Boolean qtf = "abner".matches("[a-z]{5}");
        Boolean qtf2 = "abner".matches("[a-z]{1,3}");
        System.out.println(qtf);
        System.out.println(qtf2);

        Boolean qtf3 = "2256-3138".matches("[0-9]{4}-?[0-9]{4}");
        Boolean qtf4 = "2256--3138".matches("[0-9]{4}[--]?[0-9]{4}");
        System.out.println(qtf3);
        System.out.println(qtf4);
    }
}
