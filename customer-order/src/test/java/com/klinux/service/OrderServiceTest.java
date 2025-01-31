package com.klinux.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.klinux.model.Customer;
import com.klinux.model.Order;
import com.klinux.repository.OrderRepository;

public class OrderServiceTest {
@Test
    public void testCreateOrder() {
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(orderRepository);
        
        Customer customer = new Customer("1", "Juan Pérez");
        Order order = orderService.createOrder(customer, Arrays.asList("Item1", "Item2"), 150.0);
        
        assertNotNull(order.getOrderId(), "La orden debe tener un ID");
        assertEquals("PENDING", order.getStatus(), "La orden debe estar en estado PENDING");
    }

    @Test
    public void testCompleteOrder() {
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(orderRepository);
        
        Customer customer = new Customer("1", "Juan Pérez");
        Order order = orderService.createOrder(customer, Arrays.asList("Item1", "Item2"), 150.0);
        
        orderService.completeOrder(order);
        assertEquals("COMPLETED", order.getStatus(), "La orden debe estar en estado COMPLETED");
    }

    @Test
    public void testCancelOrder() {
        OrderRepository orderRepository = new OrderRepository();
        OrderService orderService = new OrderService(orderRepository);
        
        Customer customer = new Customer("1", "Juan Pérez");
        Order order = orderService.createOrder(customer, Arrays.asList("Item1", "Item2"), 150.0);
        
        orderService.cancelOrder(order);
        assertEquals("CANCELLED", order.getStatus(), "La orden debe estar en estado CANCELLED");
    }
}
