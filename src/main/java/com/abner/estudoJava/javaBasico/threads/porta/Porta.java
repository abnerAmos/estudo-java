package com.abner.estudoJava.javaBasico.threads.porta;

public class Porta {

    boolean isBroken = true;

    public void acesso1() {

        String nome = Thread.currentThread().getName();

        synchronized (this) {
            System.out.println(nome + "Acessando porta");

            if (isBroken) {
                try {
                    System.out.println(nome + "Porta emperrada, aguardando...");
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(nome + "Acessando porta novamente");
            System.out.println(nome + "Interação");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nome + "Ainda interagindo");
            System.out.println(nome + "Finalizando interação");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nome + "Saindo da porta");
        }
    }

    public void acesso2() {

        String nome = Thread.currentThread().getName();

        synchronized (this) {
            System.out.println(nome + "Acessando porta");
            System.out.println(nome + "Interação");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nome + "Ainda interagindo");
            System.out.println(nome + "Finalizando interação");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Saindo da porta");
        }
    }

    public void liberando() {

        String nome = Thread.currentThread().getName();

        synchronized (this) {
            System.out.println(nome + "Indo até a porta");
            System.out.println(nome + "Reparando porta");

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            isBroken = false;

            System.out.println(nome + "Porta reparada");
            this.notifyAll();

            System.out.println(nome + "Liberando acesso");
        }
    }
}
