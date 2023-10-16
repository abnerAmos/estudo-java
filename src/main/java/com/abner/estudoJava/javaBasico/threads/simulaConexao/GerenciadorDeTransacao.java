package com.abner.estudoJava.javaBasico.threads.simulaConexao;

public class GerenciadorDeTransacao {

    public void begin() {

        System.out.println("Iniciando transação");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
