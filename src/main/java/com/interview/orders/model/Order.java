package com.interview.orders.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * PHASE 1 - Task 1: Complete the Order entity
 * 
 * TODO: Make this class persistable to a database
 * TODO: Ensure data integrity with appropriate validations
 */
public class Order {

    // TODO: Configure as primary key with auto-generation
    private Long id;

    // TODO: Required, cannot be empty
    private String customerId;

    // TODO: Required
    private String productCode;

    // TODO: Must be positive
    private Integer quantity;

    // TODO: Must be positive
    private BigDecimal totalAmount;

    // TODO: Store as string representation
    private OrderStatus status;

    // TODO: Store as string representation
    private OrderType orderType;

    // TODO: Store as string representation
    private CustomerTier customerTier;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Order() {
    }

    // TODO: Automatically manage timestamp fields on entity lifecycle events
    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public CustomerTier getCustomerTier() {
        return customerTier;
    }

    public void setCustomerTier(CustomerTier customerTier) {
        this.customerTier = customerTier;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
