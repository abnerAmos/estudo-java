package com.abner.estudoJava.javaBasico.threads.porta;

public class Reparo implements Runnable {

    private final Porta porta;

    public Reparo(Porta porta) {
        this.porta = porta;
    }

    @Override
    public void run() {
        this.porta.liberando();
    }
}
