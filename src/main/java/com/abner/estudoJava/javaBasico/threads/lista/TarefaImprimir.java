package com.abner.estudoJava.javaBasico.threads.lista;

public class TarefaImprimir implements Runnable {

    private  Lista lista;
    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {

        synchronized (lista) {

            if (!lista.listaCompleta()) {
                try {
                    System.out.println("Aguardando completar lista");
                    lista.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        for (int i = 0; i < lista.tamanho(); i++) {
            System.out.println(i + " - " + lista.getElemento(i));
        }
        }
    }
}
