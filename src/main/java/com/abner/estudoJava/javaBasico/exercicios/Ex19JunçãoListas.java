package com.abner.estudoJava.javaBasico.exercicios;

public class Ex19JunçãoListas {

    public static void main(String[] args) {

    String[] lista1 = {"Ronan", "Erik"};
    String[] lista2 = {"Abner", "Filipe"};

    int tamanhoListaPrincipal = lista1.length + lista2.length;

    String[] listaPrincipal = new String[tamanhoListaPrincipal];

    for (int i = 0; i < lista1.length; i++) {
        listaPrincipal[i] = lista1[i];
    }

    for (int i = 0; i < lista2.length; i++) {
        listaPrincipal[i + lista1.length] = lista2[i];
    }

    for (String elemento : listaPrincipal) {
        System.out.println(elemento);
    }
}
}