package com.abner.estudoJava.javaBasico.threads.lista;

import java.util.List;

public class TarefaAddElemento implements Runnable {

    private List<String> lista;
    private int numeroThread;

    public  TarefaAddElemento(List<String> lista, int numeroThread) {
        this.lista = lista;
        this.numeroThread = numeroThread;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            lista.add("Thread " + numeroThread + " - " + i);
        }
    }
}
