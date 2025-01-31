package com.klinux.service;

import com.klinux.model.Order;
import com.klinux.repository.OrderRepository;
import com.klinux.model.Customer;

import java.util.UUID;
import java.util.List;

public class OrderService {

    private final OrderRepository orderRepository; // Repositorio para almacenar las órdenes

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(Customer customer, List<String> items, double totalAmount) {
        String orderId = UUID.randomUUID().toString();  // Generamos un ID único para la orden
        Order order = new Order(orderId, customer, items, totalAmount);
        orderRepository.save(order);
        return order;
    }

    public void completeOrder(Order order) {
        if ("PENDING".equals(order.getStatus())) {
            order.setStatus("COMPLETED");
            orderRepository.save(order);
        } else {
            throw new IllegalStateException("Order cannot be completed because it is not pending");
        }
    }

    public void cancelOrder(Order order) {
        if ("PENDING".equals(order.getStatus())) {
            order.setStatus("CANCELLED");
            orderRepository.save(order);
        } else {
            throw new IllegalStateException("Order cannot be cancelled because it is already processed");
        }
    }
}
