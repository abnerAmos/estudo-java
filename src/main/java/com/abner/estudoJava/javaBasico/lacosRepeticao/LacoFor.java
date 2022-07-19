package com.abner.estudoJava.javaBasico.lacosRepeticao;

public class LacoFor {

    public static void main(String[] args) {

        String[] alunos = {"Edney", "Erik", "Hiago", "Abner"};

        for (int i = 0; i < alunos.length; i++) {
            String aluno = alunos[i];
            System.out.println(aluno);

        }	System.out.println("Fora do Laco");
    }
}