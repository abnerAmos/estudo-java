package com.abner.estudoJava.javaBasico.exerciciosNivel2;

import java.util.Scanner;
public class Ex1Estados2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um estado sem acentos:");
        String estadoSimples = input.nextLine();
        String estadoInformado = estadoSimples.toUpperCase();

        String[] estado = {"ACRE", "ALAGOAS", "AMAPA", "AMAZONAS", "BAHIA", "CEARA", "DISTRITO FEDERAL", "ESPIRITO SANTO",
                "GOIAS", "MARANHAO", "MATO GROSSO", "MATO GROSSO DO SUL", "MINAS GERAIS", "PARA", "PARAIBA", "PARANA",
                "PERNANBUCO", "PIAUI", "RIO DE JANEIRO", "RIO GRANDE DO NORTE", "RIO GRANDE DO SUL", "RONDONIA", "RORAIMA",
                "SANTA CATARINA", "SAO PAULO", "SERGIPE", "TOCANTINS" };

        String[] siglas = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
                "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" };

        for (int i = 0; i <= estado.length -1; i++) {
            if (estadoInformado.equals(estado[i])) {
                String siglaOut = siglas[i];
                System.out.println(siglaOut);
                break;

            } if (i == estado.length -1)
                System.out.println("Estado Inválido");
        }
    }
}