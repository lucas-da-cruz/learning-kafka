package br.com.kafka;

import java.math.BigDecimal;

public class Order {

    private final String userId, pederId;
    private final BigDecimal amount;

    public Order(String userId, String pederId, BigDecimal amount) {
        this.userId = userId;
        this.pederId = pederId;
        this.amount = amount;
    }
}
