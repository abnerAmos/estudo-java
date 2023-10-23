package com.abner.estudoJava.javaBasico.collection.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pessoas implements Comparable<Pessoas> {

    private String name;
    private int age;
    private int middleAge;
    private List<Funcoes> funcoes = new ArrayList<>();

    public Pessoas(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Não permite modificar a lista, apenas recuperar.
    public List<Funcoes> getFuncoes() {
        return Collections.unmodifiableList(funcoes);
    }

    public void adiciona(Funcoes funcao) {
        this.funcoes.add(funcao);
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + ", Idade: " + this.age;
    }

    @Override
    public int compareTo(Pessoas o) {
        return getName().compareTo(o.getName());
    }
}
