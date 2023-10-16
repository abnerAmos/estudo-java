package com.abner.estudoJava.javaBasico.threads.simulaConexao;

public class AcessaBanco implements Runnable {

    private PoolDeConexao pool;
    private GerenciadorDeTransacao tx;

    public AcessaBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
        this.pool = pool;
        this.tx = tx;
    }

    // Para resolver necessário deixar ambas classes AcessaBanco ee AcessaaBancoProcedimento com a mesma ordem de conexão.

    @Override
    public void run() {

        synchronized (pool) {
            System.out.println("Pegando a key do pool");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("Começando gerenciar a tx");
                tx.begin();
            }
        }
    }
}
