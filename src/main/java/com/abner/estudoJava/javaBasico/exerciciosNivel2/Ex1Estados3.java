package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex1Estados3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Informe um Estado:");
        String estadoIn = input.nextLine().toUpperCase();

        Map<String, String> estados = new HashMap<>();

        estados.put("ACRE", "AC");
        estados.put("ALAGOAS", "AL");
        estados.put("AMAPA", "AP");
        estados.put("AMAZONAS", "AM");
        estados.put("BAHIA", "BA");
        estados.put("CEARA", "CE");
        estados.put("ESPIRITO SANTO", "ES");
        estados.put("GOIAS", "GO");
        estados.put("MARANHAO", "MA");
        estados.put("MATO GROSSO", "MT");
        estados.put("MATO GROSSO DO SUL", "MS");
        estados.put("MINAS GERAIS", "MG");
        estados.put("PARAIBA", "PB");
        estados.put("PARANA", "PR");
        estados.put("PERNAMBUCO", "PE");
        estados.put("PIAUI", "PI");
        estados.put("RIO DE JANEIRO", "RJ");
        estados.put("RIO GRANDE DO NORTE", "RN");
        estados.put("RIO GRANDE DO SUL", "RS");
        estados.put("RONDONIA", "RO");
        estados.put("RORAIMA", "RR");
        estados.put("SANTA CATARINA", "SC");
        estados.put("SAO PAULO", "SP");
        estados.put("SERGIPE", "SE");
        estados.put("TOCANTINS", "TO");

        String estadoOut = estados.get(estadoIn);

        if (estadoOut == null) {
            System.out.println("Estado Inválido");
            return;
        }

        System.out.println(estadoOut);
    }
}
