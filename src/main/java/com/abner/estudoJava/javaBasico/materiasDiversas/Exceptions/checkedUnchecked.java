package com.abner.estudoJava.javaBasico.materiasDiversas.Exceptions;

import java.io.IOException;

public class checkedUnchecked {

    public static void main(String[] args) {
    }

    void teste() {

        try {
            testeException1();
        } catch (IOException e) {
            System.out.println("Tratar este Erro");
        }

        testeException2();
    }
    // Checked
    static void testeException1() throws IOException {
        throw new IOException();
    }

    // Unchecked
    static void testeException2() {
        throw new RuntimeException();
    }

}

