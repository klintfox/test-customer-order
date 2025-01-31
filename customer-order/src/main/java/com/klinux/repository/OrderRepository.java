package com.klinux.repository;

import com.klinux.model.Order;
import java.util.HashMap;
import java.util.Map;

public class OrderRepository {
    private Map<String, Order> orderDatabase = new HashMap<>();

    public void save(Order order) {
        orderDatabase.put(order.getOrderId(), order);
    }

    public Order findById(String orderId) {
        return orderDatabase.get(orderId);
    }
}