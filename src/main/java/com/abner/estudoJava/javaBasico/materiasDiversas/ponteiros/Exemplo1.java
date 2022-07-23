package com.abner.estudoJava.javaBasico.materiasDiversas.ponteiros;

public class Exemplo1 {

    public static void main(String[] args) {

        // Verificando se ambos objetos são iguais, logo vemos que saõ diferentes pois cada um
        // aponta para referencias diferentes alocadas na memória

        Pessoa p1 = new Pessoa();
        p1.nome = "Abner";

        Pessoa p2 = new Pessoa();
        p2.nome = "Abner";

        System.out.println(p1);
        System.out.println(p2);

        String comparar = (p1 == p2) ? "Iguais" : "Diferentes";

        System.out.println(comparar);
    }


}
