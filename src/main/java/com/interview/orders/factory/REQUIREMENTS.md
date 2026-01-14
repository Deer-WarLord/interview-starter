# PHASE 2 - Task 2.2: Factory Pattern for Order Creation

## Requirements

Implement a system to create different types of orders with type-specific configurations.

### Order Types

**Standard Orders (STANDARD)**
- Standard processing priority
- No additional fees
- Basic order fulfillment

**Express Orders (EXPRESS)**
- High priority processing
- 15% express shipping fee added to total amount
- Expedited handling

**Subscription Orders (SUBSCRIPTION)**
- Recurring order setup
- 5% subscription discount applied to total amount
- Long-term customer benefit

### Expected Behavior

The system should:
- Create orders with appropriate type-specific configurations
- Apply correct fees or discounts based on order type
- Set proper initial status for new orders
- Be extensible to support new order types in the future

### Integration

This factory system should be used in the OrderService when creating new orders from OrderRequest DTOs.
