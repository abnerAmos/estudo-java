package com.abner.estudoJava.javaBasico.threads.simulaConexao;

public class PoolDeConexao {

    public String getConnection() {

        System.out.println("Emprestando conexão");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "connection";
    }
}
