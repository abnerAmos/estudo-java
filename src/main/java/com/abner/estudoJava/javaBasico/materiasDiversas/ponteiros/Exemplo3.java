package com.abner.estudoJava.javaBasico.materiasDiversas.ponteiros;

public class Exemplo3 {

    public static void main(String[] args) {

        // Aqui é criado um problema ao qual criamos uma Array de nomes, e ao se alterar a posição [0]
        // posteriormente em uma nova Array, alteramos a posição também da Array anterior.

        Pessoa[] pessoas = new Pessoa[2];
        Pessoa p1 = new Pessoa();
        p1.nome = "Abner";

        Pessoa p2 = new Pessoa();
        p2.nome = "Erik";

        pessoas[0] = p1;
        pessoas[1] = p2;

        for (Pessoa ps : pessoas) {
            System.out.println(ps.nome);
        }
        System.out.println("---------------------");

        Pessoa p3 = pessoas[0];
        p3.nome = "Ronan Roldao";

        for (Pessoa ps2 : pessoas) {
            System.out.println(ps2.nome);
        }
    }

}
