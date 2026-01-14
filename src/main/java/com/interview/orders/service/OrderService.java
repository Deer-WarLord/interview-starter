package com.interview.orders.service;

import com.interview.orders.dto.OrderRequest;
import com.interview.orders.model.Order;
import com.interview.orders.model.OrderStatus;
import com.interview.orders.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * PHASE 1 - Task 3: Implement OrderService
 * 
 * TODO: Implement business logic for order operations:
 *       - Creating new orders
 *       - Retrieving orders
 *       - Updating orders
 *       - Deleting orders
 *       - Updating order status
 * TODO: Handle error scenarios appropriately
 * TODO: Manage data transformations between layers
 */
@Service
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // TODO: Implement service methods here

    /**
     * Get all orders for a specific customer
     */
    public List<Order> getOrdersByCustomerId(String customerId) {
        return orderRepository.findByCustomerId(customerId);
    }
}
