package com.abner.estudoJava.javaBasico.threads.porta;

public class Tarefa2 implements Runnable {

    private final Porta porta;

    public Tarefa2(Porta porta) {
        this.porta = porta;
    }

    @Override
    public void run() {
        this.porta.acesso2();
    }
}
