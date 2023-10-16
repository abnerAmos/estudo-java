package com.abner.estudoJava.javaBasico.threads.lista;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Lista lista = new Lista();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAddElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();
    }
}
