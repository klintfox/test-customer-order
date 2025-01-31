package com.klinux.model;

import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private List<String> items;
    private double totalAmount;
    private String status;  // Ej: "PENDING", "COMPLETED", "CANCELLED"

    public Order(String orderId, Customer customer, List<String> items, double totalAmount) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
        this.status = "PENDING"; // Por defecto, la orden está pendiente.
    }

    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}