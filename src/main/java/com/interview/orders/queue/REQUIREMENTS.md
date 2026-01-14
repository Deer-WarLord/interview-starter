# PHASE 3 - Task 3.1: Priority Queue for Order Processing

## Requirements

Implement an order processing queue that processes orders based on priority rather than FIFO order.

### Priority Rules

Orders should be processed in the following priority order:

1. **Order Type Priority** (highest to lowest):
   - EXPRESS orders (highest priority)
   - SUBSCRIPTION orders
   - STANDARD orders (lowest priority)

2. **Customer Tier Priority** (when order types are equal):
   - WHOLESALE customers (highest priority)
   - PREMIUM customers
   - REGULAR customers (lowest priority)

3. **Creation Time** (when both order type and tier are equal):
   - Older orders processed first (FIFO within same priority)

### Expected Operations

The queue should support:
- Adding orders to the queue
- Removing and returning the highest priority order
- Viewing the highest priority order without removing it
- Checking queue size and empty status

### Performance Requirements

- Efficient insertion and removal operations
- Should handle concurrent access if needed
- Scalable for large numbers of orders

### Use Case

This priority queue will be used by the order fulfillment system to determine which orders should be processed next.
