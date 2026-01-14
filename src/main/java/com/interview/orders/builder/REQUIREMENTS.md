# PHASE 2 - Task 2.3: Builder Pattern for Order Construction

## Requirements

Implement a flexible way to construct Order objects with many fields, some required and some optional.

### Order Fields

**Required Fields:**
- customerId
- productCode
- quantity
- totalAmount

**Optional Fields:**
- status (default: PENDING if not set)
- orderType
- customerTier
- createdAt (default: current time if not set)
- updatedAt

### Expected Behavior

The builder should:
- Support fluent method chaining for setting fields
- Validate that all required fields are set before building
- Provide sensible defaults for optional fields
- Make order construction more readable and maintainable

### Use Cases

The builder should be useful for:
- Creating test data
- Constructing orders with many optional fields
- Ensuring order objects are valid before creation
- Making complex order creation more readable
