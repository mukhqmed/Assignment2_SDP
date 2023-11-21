# Barbershop Environment Modeling System

## Project Overview

**Project Name:** Barbershop Modeling System  
**Group:** SE-2210  
**Student:** Kaskyrbayev Mukhammed

### Description

This project is a comprehensive and adaptable system designed for managing services in a barbershop. By incorporating various design patterns and adhering to SOLID principles, the goal is to create a maintainable and extensible codebase.

### Idea of the Project

The primary concept revolves around modeling a virtual barbershop environment, where customers can seamlessly select from an array of stylist services. The system accommodates diverse services such as men's haircuts, women's haircuts, children's haircuts, and manicures. Additionally, customers have the option to include extra services like hair washing and massages.

### Purpose of the Project

The project serves as a showcase of design patterns, including Singleton, Strategy, Observer, Factory, Decorator, and Adapter. The adherence to SOLID principles ensures a robust and logically structured system.

## Main Body

### Service Modeling with Strategy Pattern

The **Strategy pattern** is employed to model various barbershop services (Men's Haircut, Women's Haircut, Manicure) as separate strategies, implementing the `ServiceStrategy` interface.

```java
// Strategy 
public interface ServiceStrategy {
    void serve();
    double getCost();
}


// ConcreteStrategy1
public class MenService implements ServiceStrategy {
    private static final double MEN_SERVICE_COST = 3500;
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in men's haircuts");
    }

    @Override
    public double getCost() {
        return MEN_SERVICE_COST;
    }
}


// ConcreteStrategy2
public class ChildrenService implements ServiceStrategy {
    private static final double CHILDREN_SERVICE_COST = 3000;
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in children's haircuts");
    }

    @Override
    public double getCost() {
        return CHILDREN_SERVICE_COST;
    }
}


// ConcreteStrategy3
public class WomenService implements ServiceStrategy {
    private static final double WOMEN_SERVICE_COST = 4500;
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in women's haircuts");
    }

    @Override
    public double getCost() {
        return WOMEN_SERVICE_COST;
    }
}
# Flexible Barbershop System

This project demonstrates the implementation of various design patterns to create a flexible system for a barbershop. The design patterns used include Singleton, Strategy, Observer, Factory, Decorator, and Adapter. The goal is to handle different services efficiently and provide real-time updates to relevant personnel.

## Table of Contents

- [Design Patterns](#design-patterns)
  - [Singleton Pattern](#singleton-pattern)
  - [Factory Pattern](#factory-pattern)
  - [Decorator Pattern](#decorator-pattern)
  - [Observer Pattern](#observer-pattern)
  - [Adapter Pattern](#adapter-pattern)
- [Conclusion](#conclusion)

## Design Patterns

### Singleton Pattern

The Singleton pattern is employed for managing the database connection. This ensures a single and globally accessible instance of the database connection, enhancing efficiency and avoiding redundant database connections.

### Factory Pattern

The Factory pattern is implemented to create services dynamically based on user choices. The `ServiceFactoryProvider` selects the appropriate factory, and the chosen factory creates the specific service. This allows for flexible service creation.

### Decorator Pattern

The Decorator pattern enhances customization by allowing customers to add additional features to their chosen services. For example, customers can choose features like hair washing or massages, which are implemented as decorators.

### Observer Pattern

Real-time updates are achieved using the Observer pattern. The Manager and Receptionist are notified instantly when a service is done, enabling quick actions or immediate sharing of information.

### Adapter Pattern

The Adapter pattern is used to make non-standard services, such as Manicure, fit the standard `ServiceStrategy` interface. This guarantees a uniform interface for all services and ensures easy integration.

## Conclusion

In this project, we applied design patterns and followed SOLID, DRY, KISS, YAGNI principles to create a flexible system for a barbershop. The system can efficiently handle different services, notify relevant personnel in real-time, and can be further improved by adding more services and specific method implementations for various scenarios.
