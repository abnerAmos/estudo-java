package com.abner.estudoJava.javaBasico.threads.simulaConexao;

public class AcessaBancoProcedimento implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public AcessaBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        synchronized (tx) {
            System.out.println("Iniciando tx");
            tx.begin();

            synchronized (pool) {
                System.out.println("pegando a conexão");
                pool.getConnection();
            }
        }
    }
}
