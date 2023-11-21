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
// ServiceStrategy interface
public interface ServiceStrategy {
    void performService();
}

// ConcreteStrategy1
public class MenHaircutStrategy implements ServiceStrategy {
    @Override
    public void performService() {
        System.out.println("Executing Men's Haircut service");
    }
}

// ConcreteStrategy2
public class WomenHaircutStrategy implements ServiceStrategy {
    @Override
    public void performService() {
        System.out.println("Executing Women's Haircut service");
    }
}

// ConcreteStrategy3
public class ManicureStrategy implements ServiceStrategy {
    @Override
    public void performService() {
        System.out.println("Executing Manicure service");
    }

