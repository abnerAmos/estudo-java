package com.abner.estudoJava.javaBasico.threads.lista;

public class Lista {

    private String[] elementos = new String[100];
    private int indice = 0;

    public synchronized void addElementos(String elemento) {
        this.elementos[indice] = elemento;
        this.indice++;

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (this.indice == this.elementos.length) {
            System.out.println("Lista cheia");
            this.notify();
        }
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String getElemento(int posicao) {
        return this.elementos[posicao];
    }

    public boolean listaCompleta() {
        return this.indice == this.tamanho();
    }
}
