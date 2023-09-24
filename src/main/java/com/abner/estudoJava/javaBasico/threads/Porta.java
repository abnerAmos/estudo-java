package com.abner.estudoJava.javaBasico.threads;

public class Porta {

    public void acesso1() {

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
}
