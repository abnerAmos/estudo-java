package com.abner.estudoJava.javaBasico.materiasDiversas.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindeReplace {

    public static void main(String[] args) {

        // Percorrendo todos os contatos e exibindo;

        String mdf2 = "Abner: (11) 97385-1774 - Juliana: (11) 93202-6167 - Erik: (11) 96122-6929";
        Matcher encontrar = Pattern.compile("\\(\\d{2}\\)\\s\\d{5}-?\\d{4}").matcher(mdf2);
        while(encontrar.find()) {
            System.out.println(encontrar.group());
        }

        // Substituindo todos os contatos;

        String teste = mdf2.replaceAll("\\(\\d{2}\\)\\s\\d{5}-?\\d{4}", "INVALIDO");
        System.out.println(teste);

        // Alterando um texto dinâmicamente;

        String email = "recursoshumanos.fulano@empresax.com.br";
        String regex = "\\w{15}.\\w{2,}@\\w{2,}.com.br";        // Montando regex e armazenando em um variável;
        boolean comparacao = email.matches(regex);              // Validando a regex anterior;
        System.out.println(comparacao);

        regex = "(\\w{15}).(\\w{2,})@(\\w{2,}).com.br";         // Armazenando palavras em variáveis com ();
        String novoEmail = email.replaceAll(regex, "$2.$3@$1.xbr");     // Recuperando as variáveis com $
        System.out.println(email);                                                // ** Ao armazenar as palavras nas variáveis ()
        System.out.println(novoEmail);                                            // são criadas ordens numerais para recupera-las na posição que quiser.
    }

}
