package com.interview.orders.dto;

import com.interview.orders.model.CustomerTier;
import com.interview.orders.model.OrderType;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

/**
 * PHASE 1 - DTO for creating/updating orders
 * 
 * TODO: Add validation annotations
 */
public class OrderRequest {

    @NotBlank(message = "Customer ID is required")
    private String customerId;

    @NotBlank(message = "Product code is required")
    private String productCode;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    private Integer quantity;

    @NotNull(message = "Total amount is required")
    @DecimalMin(value = "0.01", message = "Total amount must be positive")
    private BigDecimal totalAmount;

    @NotNull(message = "Order type is required")
    private OrderType orderType;

    @NotNull(message = "Customer tier is required")
    private CustomerTier customerTier;

    // Constructors
    public OrderRequest() {
    }

    public OrderRequest(String customerId, String productCode, Integer quantity, 
                       BigDecimal totalAmount, OrderType orderType, CustomerTier customerTier) {
        this.customerId = customerId;
        this.productCode = productCode;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderType = orderType;
        this.customerTier = customerTier;
    }

    // Getters and Setters
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
}
