package com.interview.orders.controller;

import com.interview.orders.dto.OrderRequest;
import com.interview.orders.dto.OrderResponse;
import com.interview.orders.model.Order;
import com.interview.orders.model.OrderStatus;
import com.interview.orders.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * PHASE 1 - Task 2: Implement OrderController
 * 
 * TODO: Implement REST API for order management operations:
 *       - Creating new orders
 *       - Retrieving orders (by ID and all)
 *       - Updating existing orders
 *       - Deleting orders
 *       - Updating order status
 * TODO: Ensure proper input validation
 * TODO: Return appropriate HTTP status codes
 */
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // TODO: Implement REST endpoints here

    /**
     * Get orders by customer ID
     */
    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<OrderResponse>> getOrdersByCustomerId(@PathVariable String customerId) {
        List<Order> orders = orderService.getOrdersByCustomerId(customerId);
        List<OrderResponse> responses = orders.stream()
                .map(OrderResponse::from)
                .collect(Collectors.toList());
        return ResponseEntity.ok(responses);
    }
}
