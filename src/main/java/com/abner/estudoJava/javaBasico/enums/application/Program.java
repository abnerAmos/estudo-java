package com.abner.estudoJava.javaBasico.enums.application;

import com.abner.estudoJava.javaBasico.enums.entity.Order;
import com.abner.estudoJava.javaBasico.enums.enumerator.StatusOrder;

import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

        Order order = new Order(11, LocalDateTime.now(), StatusOrder.PROCESSING);
        System.out.println(order);
    }
}
