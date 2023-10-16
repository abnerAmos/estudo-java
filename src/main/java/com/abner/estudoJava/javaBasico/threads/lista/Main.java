package com.abner.estudoJava.javaBasico.threads.lista;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> lista = new Vector<String>();

        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAddElemento(lista, i)).start();
        }

        Thread.sleep(2000);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }
}
