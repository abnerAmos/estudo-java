package com.abner.estudoJava.javaBasico.utils;

import java.util.UUID;

public class GeradorTokenRandom {

    public static void main(String[] args) {

        String token = UUID.randomUUID().toString();
        System.out.println(token);
    }
}
