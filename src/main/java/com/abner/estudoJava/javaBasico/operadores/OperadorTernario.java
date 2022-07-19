package com.abner.estudoJava.javaBasico.operadores;

public class OperadorTernario {

    public static void main(String[] args) {

        int numero = 13;

        // ?      :
        // ? vem sempre depois da comparação/expressão
        // : a resposta verdadeira sempre deve estar do lado esquerdo dos :, e falsa do outro lado

        String n1 = (numero % 2 == 0) ? "par" : "impar";

        System.out.println(n1);
    }
}