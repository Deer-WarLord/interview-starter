# PHASE 3 - Task 3.2: Rate Limiter

## Requirements

Implement a rate limiting mechanism to prevent customers from overwhelming the system with too many requests.

### Business Requirements

**Rate Limiting Rules:**
- Track requests per customer ID
- Limit: 100 requests per 60-second window
- Use a sliding window (not fixed window)
- Allow configuration of limits and window size

### Sliding Window Behavior

The sliding window approach means:
- At any given moment, only requests from the last 60 seconds count
- If a customer has made 100 requests in the last 60 seconds, new requests are rejected
- As old requests fall outside the window, new requests can be allowed
- More accurate than fixed-window approach

### Expected Operations

The rate limiter should support:
- Checking if a request should be allowed for a customer
- Getting current request count for a customer
- Resetting limits (for testing)
- Thread-safe concurrent access

### Performance Requirements

- Fast request checking (should not significantly impact API response time)
- Memory efficient for tracking many customers
- Thread-safe for concurrent requests

### Use Case

This rate limiter will be integrated into the OrderController to prevent abuse and ensure fair resource allocation across customers.

### Example Behavior

```
Time 0s:  Customer makes 100 requests → All allowed
Time 30s: Customer makes 1 request → Rejected (100 requests in last 60s)
Time 61s: Customer makes 1 request → Allowed (only 99 requests in last 60s)
```
