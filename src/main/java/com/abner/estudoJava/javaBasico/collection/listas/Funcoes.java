package com.abner.estudoJava.javaBasico.collection.listas;

public class Funcoes implements Comparable<Funcoes> {

    private String role;
    private String level;

    public Funcoes(String role, String level) {
        this.role = role;
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public String getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Função: " + role + ", Level: " + level;
    }

    @Override
    public int compareTo(Funcoes o) {
        return getRole().compareTo(o.getRole());
    }
}
