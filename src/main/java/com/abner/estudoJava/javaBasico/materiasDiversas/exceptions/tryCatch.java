package com.abner.estudoJava.javaBasico.materiasDiversas.exceptions;

public class tryCatch {

    public static void main(String[] args) {

        System.out.println("Executando linha de código 1");

        try {   // Bloco que irá tentar executar
            int teste = Integer.parseInt("Hello World!");
            System.out.println("Executando linha de código 2" + teste);

            /* Caso houver um erro, será tratado
            Necessário informar o tipo que erro que pode ocorrer e que será tratado
            Não encerra a aplicação, caso caia neste bloco.
             */
        } catch (NumberFormatException t) {
            System.out.println("Formato Inválido!");


        } catch (NullPointerException e) {
            e.printStackTrace();
             /* Imprime a "Stack"(fluxo) de erro, informando todos os pontos e linhas que ocorreu o erro,
            caso entre neste bloco
             */

        } finally {
            System.out.println("Executa Independente de qualquer coisa!");
        }

        System.out.println("Executando linha de código 3");


    }
}
