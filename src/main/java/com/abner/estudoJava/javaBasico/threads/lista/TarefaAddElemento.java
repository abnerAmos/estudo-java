package com.abner.estudoJava.javaBasico.threads.lista;

import java.util.List;

public class TarefaAddElemento implements Runnable {

    private Lista lista;
    private int numeroThread;

    public  TarefaAddElemento(Lista lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            lista.addElementos("Thread " + numeroThread + " - " + i);
        }
    }
}
