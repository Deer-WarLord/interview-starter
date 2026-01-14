package com.interview.orders.repository;

import com.interview.orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PHASE 1 - Spring Data JPA Repository for Order entity
 * 
 * This interface provides basic CRUD operations out of the box.
 * Spring Data JPA will automatically implement this interface at runtime.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // TODO (Optional): Add custom query methods if needed
    // Example: List<Order> findByCustomerId(String customerId);
    
    /**
     * Find all orders for a specific customer
     */
    List<Order> findByCustomerId(String customerId);
}
