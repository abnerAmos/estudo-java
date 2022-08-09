package com.abner.estudoJava.javaBasico.materiasDiversas.regex;

public class Metacaracteres {

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

    public static void main(String[] args) {

        Boolean mtc = "Abner".matches("\\w{2,}");
        Boolean mtc2 = "Abner".matches("\\W{2,}");
        Boolean mtc3 = "22563138".matches("\\d{8}");
        Boolean mtc4 = "22563138".matches("\\D{8}");
        Boolean mtc5 = "Abner        Amos".matches("\\w{5}\\s{2,}\\w{4}");
        Boolean mtc6 = "Abner        Amos".matches("\\w{5}\\S{2,}\\w{4}");

        System.out.println(mtc);
        System.out.println(mtc2);
        System.out.println(mtc3);
        System.out.println(mtc4);
        System.out.println(mtc5);
        System.out.println(mtc6);
    }
}
