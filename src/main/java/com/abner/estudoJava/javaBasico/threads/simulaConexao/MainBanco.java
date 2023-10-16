package com.abner.estudoJava.javaBasico.threads.simulaConexao;

public class MainBanco {

    // Simulação Deadlock

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();

        new Thread(new AcessaBanco(pool, tx)).start();
        new Thread(new AcessaBancoProcedimento(pool, tx)).start();
    }
}
