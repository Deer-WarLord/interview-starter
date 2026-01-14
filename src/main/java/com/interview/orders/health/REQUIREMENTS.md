# PHASE 4 - Task 4.2: Custom Health Checks

## Requirements

Implement custom health checks to monitor the availability of downstream services and dependencies.

### Services to Monitor

**1. Inventory Service**
- Check if inventory service is reachable
- Verify it's responding correctly

**2. Payment Service**
- Check if payment gateway is available
- Ensure it's operational

### Health Status Levels

**UP (Healthy)**
- All critical services are available
- System is fully operational

**DEGRADED (Partially Healthy)**
- Some non-critical services are unavailable
- System can still process orders with reduced functionality

**DOWN (Unhealthy)**
- Critical services are unavailable
- System cannot process orders

### Expected Behavior

The health check should:
- Verify connectivity to each downstream service
- Return detailed status for each service
- Aggregate overall system health
- Execute quickly (don't block for too long)
- Be callable via Spring Boot Actuator

### Response Format

The health endpoint should return information like:

```json
{
  "status": "UP",
  "components": {
    "downstream": {
      "status": "UP",
      "details": {
        "inventoryService": "UP",
        "paymentService": "UP"
      }
    }
  }
}
```

### Testing Considerations

For the interview, you can:
- Simulate service checks (no need for actual HTTP calls)
- Implement configurable pass/fail scenarios
- Use random failures to demonstrate circuit breaking

### Accessing Health Checks

Once implemented, health status available at:
- `http://localhost:8080/actuator/health`

### Why This Matters

In production systems:
- Load balancers use health checks to route traffic
- Monitoring systems use them for alerting
- Teams use them to quickly identify problems
- They prevent cascading failures
