# PHASE 2 - Task 2.1: Strategy Pattern for Pricing

## Requirements

Implement a pricing system that calculates order totals based on customer tier.

### Business Rules

**Regular Customers (REGULAR tier)**
- Standard pricing with no discounts
- Price = basePrice × quantity

**Premium Customers (PREMIUM tier)**
- Receive 10% discount on all orders

**Wholesale Customers (WHOLESALE tier)**
- Receive 20% base discount
- Additional 5% discount when quantity exceeds 100 units

### Expected Behavior

The system should:
- Calculate final price based on customer tier
- Support different pricing rules for different customer types
- Be extensible to add new customer tiers in the future
- Integrate with the order creation process

### Integration

This pricing calculation should be used when creating orders to determine the `totalAmount` field.
