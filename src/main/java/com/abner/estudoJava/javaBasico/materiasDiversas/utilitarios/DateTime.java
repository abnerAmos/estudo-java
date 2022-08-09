package com.abner.estudoJava.javaBasico.materiasDiversas.utilitarios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static void main(String[] args) {

        // Dia e hora atual;

        LocalDateTime diaHora = LocalDateTime.now();
        System.out.println(diaHora);

        // Dia, mês e ano;

        LocalDate dia = LocalDate.now();
        System.out.println(dia);

        // Data específica;

        LocalDateTime suaHora = LocalDateTime.of(1993,8,10,00,00,00);
        System.out.println(suaHora);

        // Formatando hora

        String data = "10/08/1993 10:10:10";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dataFormatada = LocalDateTime.parse(data, formato);
        System.out.println(dataFormatada);
    }
}
