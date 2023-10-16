package com.abner.estudoJava.javaBasico.threads.porta;

public class Tarefa1 implements Runnable {

    private final Porta porta;

    public Tarefa1(Porta porta) {
        this.porta = porta;
    }

    @Override
    public void run() {
        this.porta.acesso1();
    }
}
