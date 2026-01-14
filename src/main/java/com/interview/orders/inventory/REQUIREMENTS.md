# PHASE 3 - Task 3.3: Inventory Allocation Algorithm

## Requirements

Implement an algorithm to optimally allocate limited inventory across multiple competing orders.

### Business Problem

When inventory is limited and multiple orders compete for the same products, the system needs to decide:
- Which orders get fulfilled first
- How to allocate partial inventory
- How to maximize business value

### Allocation Priority Factors

**1. Order Value**
- Higher value orders should receive priority

**2. Customer Tier**
- WHOLESALE customers (highest priority)
- PREMIUM customers (medium priority)
- REGULAR customers (lowest priority)

**3. Order Type**
- EXPRESS orders (highest priority - customer paying for speed)
- SUBSCRIPTION orders (medium priority - recurring revenue)
- STANDARD orders (lowest priority)

### Expected Behavior

The allocator should:
- Accept a list of orders and available inventory by product
- Calculate a priority score for each order
- Allocate inventory starting with highest priority orders
- Support partial fulfillment when inventory is insufficient
- Return allocation results showing which orders got how much inventory

### Example Scenario

```
Available Inventory:
- PROD001: 100 units

Orders:
1. REGULAR customer, STANDARD order, 50 units, value $500
2. PREMIUM customer, EXPRESS order, 80 units, value $1000
3. WHOLESALE customer, STANDARD order, 40 units, value $600

Expected Allocation:
- Order 2: 80 units (highest priority: premium + express + high value)
- Order 3: 20 units (partial: second priority: wholesale tier)
- Order 1: 0 units (lowest priority: regular + standard)
```

### Performance Requirements

- Should handle hundreds of orders efficiently
- Clear and maintainable priority calculation
- Extensible if priority rules change

### Use Case

This will be used by the fulfillment system to make real-time inventory allocation decisions during high-demand periods.
