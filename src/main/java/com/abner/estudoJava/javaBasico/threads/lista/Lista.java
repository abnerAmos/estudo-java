package com.abner.estudoJava.javaBasico.threads.lista;

public class Lista {

    private String[] elementos = new String[100];
    private int indice = 0;

    public synchronized void addElementos(String elemento) {
        this.elementos[indice] = elemento;
        this.indice++;
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String getElemento(int posicao) {
        return this.elementos[posicao];
    }
}
