# Spring Framework (Java) - Quick Overview

## Introduction

Spring is a powerful Java framework used for building enterprise-level applications. It simplifies development by providing infrastructure support, allowing developers to focus on business logic.

---

## Core Concepts

### 1. Inversion of Control (IoC)

IoC is a design principle where the control of object creation and dependency management is transferred from the developer to the Spring container.

* Instead of creating objects manually, Spring manages them.
* Promotes loose coupling and easier testing.

---

### 2. Dependency Injection (DI)

Dependency Injection is a way to implement IoC.

* Objects receive their dependencies from the Spring container.
* Types of DI:

    * Constructor Injection
    * Setter Injection

---

### 3. Beans

Beans are objects managed by the Spring IoC container.

* Defined in configuration (XML, annotations, or Java config)
* Lifecycle managed by Spring
* Example:

```java
@Component
public class MyService {
    public void serve() {
        System.out.println("Service running...");
    }
}
```

---

### 4. Spring Container

The container is responsible for:

* Instantiating beans
* Managing dependencies
* Configuring application components

Two main types:

* BeanFactory (basic)
* ApplicationContext (advanced, commonly used)

---

## Benefits of Spring

* Loose coupling
* Easy testing
* Modular design
* Integration with other frameworks

---

## Conclusion

Spring simplifies Java development using IoC, DI, and bean management. Understanding these core concepts is essential for building scalable and maintainable applications.

---
