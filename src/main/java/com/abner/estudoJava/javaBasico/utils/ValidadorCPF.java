package com.abner.estudoJava.javaBasico.utils;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;

import java.util.List;

/* TESTE: Validador de CPF Stella da Caelum */

public class ValidadorCPF {

    public static void main(String[] args) {
        System.out.println(validador("12312312312"));
    }

    public static boolean validador(String cpf) {

        CPFValidator cpfValidator = new CPFValidator();
        List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);

        if (erros.size() > 0) {
            System.out.println(erros);
            return false;
        } else {
            return true;
        }
    }
}
