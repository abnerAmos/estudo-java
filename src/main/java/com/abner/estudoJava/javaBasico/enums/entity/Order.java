package com.abner.estudoJava.javaBasico.enums.entity;

import com.abner.estudoJava.javaBasico.enums.enumerator.StatusOrder;

import java.time.LocalDateTime;

public class Order {

    private Integer id;
    private LocalDateTime deliveredTime;
    private StatusOrder statusOrder;

    public  Order (Integer id, LocalDateTime deliveredTime, StatusOrder statusOrder) {
        this.id = id;
        this.deliveredTime = deliveredTime;
        this.statusOrder = statusOrder;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(LocalDateTime deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", deliveredTime=" + deliveredTime +
                ", statusOrder=" + statusOrder +
                '}';
    }
}
