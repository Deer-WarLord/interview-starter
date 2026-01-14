# PHASE 4 - Task 4.3: Circuit Breaker Pattern

## Requirements

Implement the circuit breaker pattern to handle failures in external service calls gracefully using Resilience4j.

### Problem Statement

When calling external services (inventory, payment, shipping):
- Services may be temporarily unavailable
- Network issues can cause timeouts
- Repeated failed calls waste resources
- Failures can cascade through the system

### Circuit Breaker Solution

The circuit breaker acts like an electrical circuit breaker:

**CLOSED (Normal Operation)**
- Requests pass through normally
- System monitors failure rate

**OPEN (Service Failing)**
- After threshold failures, circuit opens
- Requests immediately return fallback response
- No calls made to failing service
- Gives service time to recover

**HALF-OPEN (Testing Recovery)**
- After timeout, circuit allows test requests
- If successful, circuit closes
- If failing, circuit reopens

### Implementation Requirements

**1. Wrap External Service Calls**
- Protect calls to inventory service
- Apply circuit breaker pattern

**2. Configure Failure Threshold**
- How many failures before opening circuit?
- How long to wait before testing recovery?

**3. Implement Fallback Strategy**
- What happens when circuit is open?
- Return cached data?
- Return safe default?
- Fail gracefully with error message?

### Expected Behavior

The service should:
- Make external service calls when circuit is closed
- Track failure rates
- Open circuit after threshold failures
- Execute fallback method when circuit is open
- Periodically test if service has recovered

### Testing Strategy

For the interview, you can:
- Simulate external service calls
- Introduce controlled failures
- Demonstrate circuit opening
- Show fallback behavior

### Configuration

Circuit breaker configuration in `application.yml`:
- Failure rate threshold
- Wait duration in open state
- Number of calls in half-open state
- Timeout duration

### Why This Matters

In production systems:
- Prevents cascading failures
- Provides graceful degradation
- Protects system resources
- Improves overall resilience
- Reduces impact of downstream failures

### Integration

This should be integrated into:
- OrderService when checking inventory
- Any external API calls
- Payment processing
- Shipping service integration
