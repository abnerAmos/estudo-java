package com.abner.estudoJava.javaBasico.threads.porta;

public class applicationStart {

    public static void main(String[] args) {

        Porta porta = new Porta();

        Thread primeiroAcesso = new Thread(new Tarefa1(porta), "Fulano ");
        Thread segundoAcesso = new Thread(new Tarefa2(porta), "Sicrano ");
        Thread reparo = new Thread(new Reparo(porta), "Reparador ");

        primeiroAcesso.start();
        segundoAcesso.start();
        reparo.start();
    }
}
