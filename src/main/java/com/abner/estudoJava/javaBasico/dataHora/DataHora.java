package com.abner.estudoJava.javaBasico.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {

    public static void main(String[] args) {

        // Data Local, instanciado no momento de execução (now)
        LocalDate localDate = LocalDate.now();

        // Data e Hora Local, instanciado no momento de execução (now)
        LocalDateTime localDateTime = LocalDateTime.now();

        // Data e Hora GMT (Londres - Marco Zero), instanciado no momento de execução (now)
        Instant instant = Instant.now();

        // Data especificada manualmente (Padrão ISO 8601)
        LocalDate localDateParse = LocalDate.parse("1993-08-10");

        // Data e Hora especificada manualmente (Padrão ISO 8601)
        LocalDateTime localDateTimeParse = LocalDateTime.parse("1993-08-10T10:30:00");

        // Data e Hora GMT, especificada manualmente (Padrão ISO 8601)
        Instant instantParse = Instant.parse("1993-08-10T13:30:00Z");

        // Formatando Data e Hora
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate date = LocalDate.parse("10/08/1993", formatter);
        LocalDateTime dateTime = LocalDateTime.parse("10/08/1993 10:30", formatter2);

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(instant);
        System.out.println("----------------------------");
        System.out.println(localDateTimeParse);
        System.out.println(localDateParse);
        System.out.println(instantParse);
        System.out.println("----------------------------");
        System.out.println(date);
        System.out.println(dateTime);
        System.out.println("----------------------------");
        System.out.println("----------------------------");

        // Customizando Data e Hora
        System.out.println(localDateParse.format(formatter));
        System.out.println(localDateTimeParse.format(formatter2));
    }
}
