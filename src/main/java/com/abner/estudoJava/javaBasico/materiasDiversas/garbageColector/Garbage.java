package com.abner.estudoJava.javaBasico.materiasDiversas.garbageColector;

public class Garbage {

    public static void main(String[] args) {

        // Ao criar um objeto, é criado uma referência para cada um

        Objeto ob1 = new Objeto();
        Objeto ob2 = new Objeto();

        System.out.println(ob1);
        System.out.println(ob2);

        // Ao mudar/apontar a variavel (ob2) para outra (ob1), muda-se a referencia para a mesma da outra (ob1)

        ob2 = ob1;

        System.out.println(ob1);
        System.out.println(ob2);
    }

}
