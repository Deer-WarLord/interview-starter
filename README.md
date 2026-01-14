# Welcome to the Order Management Service Challenge! 🚀

## Introduction

Welcome! Today you'll be building an **Order Management Microservice** using Spring Boot. This is a hands-on coding challenge where you'll implement features across REST APIs, design patterns, algorithms, and observability.

**Duration:** 60-90 minutes  
**Format:** Progressive implementation (start simple, build up complexity)

---

## 🎯 What You'll Build

An order management system with:
- ✅ REST API for order operations
- ✅ Design patterns (Strategy, Factory, Builder)
- ✅ Algorithms (Priority Queue, Rate Limiter, Inventory Allocator)
- ✅ Production features (Metrics, Health Checks, Circuit Breakers)

---

## 🚀 Quick Setup

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- Your favorite IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Getting Started

```bash
# 1. Navigate to the starter directory
cd starter

# 2. Build the project
mvn clean install -s settings.xml

# 3. Run the application
mvn spring-boot:run -s settings.xml
```

**✨ Important:** Always use `-s settings.xml` when running Maven commands!

### Verify It's Working

```bash
# Check if application is running
curl http://localhost:8080/actuator/health

# Should return: {"status":"UP"}
```

---

## 📂 Project Structure

```
starter/
├── src/main/java/com/interview/orders/
│   ├── OrderManagementApplication.java  # Main application
│   │
│   ├── model/           # Phase 1: Domain entities
│   │   ├── Order.java              ← START HERE!
│   │   ├── OrderStatus.java
│   │   ├── OrderType.java
│   │   └── CustomerTier.java
│   │
│   ├── dto/             # Data Transfer Objects
│   │   ├── OrderRequest.java
│   │   └── OrderResponse.java
│   │
│   ├── repository/      # Phase 1: Data access
│   │   └── OrderRepository.java
│   │
│   ├── service/         # Phase 1: Business logic
│   │   └── OrderService.java
│   │
│   ├── controller/      # Phase 1: REST endpoints
│   │   └── OrderController.java
│   │
│   ├── pricing/         # Phase 2: Strategy pattern
│   ├── factory/         # Phase 2: Factory pattern
│   ├── builder/         # Phase 2: Builder pattern
│   │
│   ├── queue/           # Phase 3: Priority queue
│   ├── ratelimit/       # Phase 3: Rate limiter
│   ├── inventory/       # Phase 3: Inventory allocator
│   │
│   ├── metrics/         # Phase 4: Custom metrics
│   ├── health/          # Phase 4: Health checks
│   └── external/        # Phase 4: Circuit breaker
│
└── src/main/resources/
    └── application.yml   # Configuration
```

---

## 🔍 Finding Your Tasks

### Method 1: Search for TODOs

```bash
# Find all TODO comments
grep -r "TODO" src/

# Or use your IDE:
# - IntelliJ: View → Tool Windows → TODO
# - Eclipse: Window → Show View → Tasks
# - VS Code: Search for "TODO" in project
```

### Method 2: Follow the Phases

**Phase 1: REST API Foundation (15 min)**
- Start with `model/Order.java`
- Then `service/OrderService.java`
- Finally `controller/OrderController.java`

**Phase 2: Design Patterns (25 min)**
- Implement pricing strategies in `pricing/` (see REQUIREMENTS.md)
- Create order factories in `factory/` (see REQUIREMENTS.md)
- Build OrderBuilder in `builder/` (see REQUIREMENTS.md)

**Phase 3: Algorithms (20 min)**
- Priority queue in `queue/` (see REQUIREMENTS.md)
- Rate limiter in `ratelimit/` (see REQUIREMENTS.md)
- Inventory allocator in `inventory/` (see REQUIREMENTS.md)

**Phase 4: Observability (20 min)**
- Metrics in `metrics/` (see REQUIREMENTS.md)
- Health checks in `health/` (see REQUIREMENTS.md)
- Circuit breaker in `external/` (see REQUIREMENTS.md)

---

## 📝 Implementation Guide

### Phase 1: REST API (START HERE!)

#### Task 1: Complete the Order Entity

**File:** `model/Order.java`


#### Task 2: Implement OrderService

**File:** `service/OrderService.java`

**What to implement:**
- Business logic for order management operations
- Proper error handling for edge cases
- Data transformation between DTOs and entities

#### Task 3: Implement OrderController

**File:** `controller/OrderController.java`

**What to implement:**
- RESTful API endpoints for order management
- Support for creating, retrieving, updating, and deleting orders
- Proper HTTP methods and status codes

---

## 🧪 Testing Your Implementation

### Using curl

```bash
# Create an order
curl -X POST http://localhost:8080/api/orders \
  -H "Content-Type: application/json" \
  -d '{
    "customerId": "CUST001",
    "productCode": "PROD001",
    "quantity": 5,
    "totalAmount": 99.99,
    "orderType": "STANDARD",
    "customerTier": "REGULAR"
  }'

# Get all orders
curl http://localhost:8080/api/orders

# Get specific order
curl http://localhost:8080/api/orders/1

# Update order status
curl -X PATCH "http://localhost:8080/api/orders/1/status?status=CONFIRMED"

# Delete order
curl -X DELETE http://localhost:8080/api/orders/1
```

### Using Postman

1. Import the endpoints above
2. Set `Content-Type: application/json` header
3. Test each endpoint

### Access Points

- **API:** http://localhost:8080/api/orders
- **Health Check:** http://localhost:8080/actuator/health
- **Metrics:** http://localhost:8080/actuator/metrics
- **H2 Console:** http://localhost:8080/h2-console
  - JDBC URL: `jdbc:h2:mem:orderdb`
  - Username: `sa`
  - Password: (empty)

---

## 💡 Tips for Success

### General Guidelines

✅ **DO:**
- Read the TODO comments carefully
- Ask clarifying questions
- Test as you go
- Explain your thinking out loud
- Focus on correctness first, optimization later
- Use the provided DTOs and enums

❌ **DON'T:**
- Worry about perfection
- Spend too long on one task
- Skip error handling
- Forget to use `@Valid` for validation
- Overthink the solution

### Time Management

- **Phase 1 (15 min):** Get a working REST API
- **Phase 2 (25 min):** Demonstrate pattern knowledge
- **Phase 3 (20 min):** Show algorithmic thinking
- **Phase 4 (20 min):** Prove production mindset

If you get stuck, move on! You can always come back.

### Code Quality Matters

We're looking for:
- Clean, readable code
- Proper error handling
- Appropriate use of Spring annotations
- Good naming conventions
- Basic validation

---

## 🆘 Troubleshooting

### Maven Issues

**Problem:** "Could not transfer artifact from nexus..."

**Solution:** Make sure you're using the local settings:
```bash
mvn clean install -s settings.xml
```

### Application Won't Start

**Check:**
1. Java version: `java -version` (should be 17+)
2. Port 8080 is available
3. No compilation errors
4. Using: `mvn spring-boot:run -s settings.xml`

### Compilation Errors

**Common issues:**
- Missing annotations (`@Entity`, `@Service`, `@RestController`)
- Missing imports
- Not implementing required methods
- Syntax errors

**Fix:**
```bash
# Recompile
mvn clean compile -s settings.xml
```

### Can't Find TODOs

**Use your IDE:**
- IntelliJ: `View → Tool Windows → TODO`
- VS Code: Search for "TODO" (Ctrl+Shift+F or Cmd+Shift+F)
- Or just: `grep -r "TODO" src/`
---

## 🎓 What We're Evaluating

### Technical Skills (80%)

**Phase 1 (20%):**
- Spring Boot basics
- JPA/Hibernate knowledge
- REST API design
- Input validation

**Phase 2 (30%):**
- Design pattern understanding
- SOLID principles
- Code extensibility

**Phase 3 (30%):**
- Algorithm selection
- Data structure knowledge
- Complexity analysis
- Edge case handling

**Phase 4 (20%):**
- Production mindset
- Monitoring strategy
- Resilience patterns

### Soft Skills (20%)

- Communication (explaining your approach)
- Problem-solving (how you tackle challenges)
- Time management (balancing speed and quality)
- Adaptability (responding to feedback)

---

## 📖 Available Resources

During the interview, you have access to:
- ✅ Google / Stack Overflow
- ✅ Spring Boot documentation
- ✅ Java documentation
- ✅ Your notes and references

We're testing your practical skills, not your memory!

---

## ❓ Questions During Interview

**Feel free to ask:**
- "Can you clarify the requirements for...?"
- "Should I handle this edge case...?"
- "Is it okay if I...?"
- "What's the priority: speed or completeness?"

**We want you to succeed!**

---

## 🎯 Success Criteria

You're doing great if you:
- ✅ Complete Phase 1 (REST API working)
- ✅ Demonstrate understanding of Phase 2 (patterns)
- ✅ Make progress on Phase 3 (algorithms)
- ✅ Show awareness of Phase 4 (observability)

Remember: This is challenging material designed for senior developers. It's okay if you don't complete everything!

---

## 🚀 Ready to Start?

1. **Build the project:**
   ```bash
   mvn clean install -s settings.xml
   ```

2. **Start the application:**
   ```bash
   mvn spring-boot:run -s settings.xml
   ```

3. **Open `model/Order.java`** and start implementing!

4. **Test frequently** using curl or Postman

5. **Communicate** your thought process

---

## 📞 Need Help?

**During the interview:**
- Ask your interviewer for clarification
- Request hints if you're stuck
- Discuss trade-offs and alternatives

**Technical issues:**
- Check the troubleshooting section above
- Verify Maven commands include `-s settings.xml`
- Ensure Java 17+ is installed

---

## 💪 Final Tips

1. **Start simple** - Get Phase 1 working first
2. **Think aloud** - Explain what you're doing
3. **Test early** - Don't wait until the end
4. **Ask questions** - We want to help you succeed
5. **Have fun** - This is a learning experience!

---

**Good luck! We're excited to see what you build! 🎉**

---

## 📋 Checklist

Before starting, make sure:
- [ ] Java 17+ installed (`java -version`)
- [ ] Maven installed (`mvn -version`)
- [ ] Project builds successfully (`mvn clean install -s settings.xml`)
- [ ] Application starts (`mvn spring-boot:run -s settings.xml`)
- [ ] Health check works (`curl http://localhost:8080/actuator/health`)
- [ ] IDE is ready with the project open
- [ ] You understand the phases and structure

**All set? Let's code! 🚀**
