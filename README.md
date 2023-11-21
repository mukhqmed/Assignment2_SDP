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
