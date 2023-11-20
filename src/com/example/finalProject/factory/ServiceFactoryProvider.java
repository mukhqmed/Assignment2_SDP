package com.example.finalProject.factory;

public class ServiceFactoryProvider {
    public static ServiceFactory getFactory(int choice) {
        return switch (choice) {
            case 1 -> new MenServiceFactory();
            case 2 -> new WomenServiceFactory();
            case 3 -> new ChildrenServiceFactory();
            case 4 -> new ManicureServiceFactory();
            default -> throw new IllegalArgumentException("Invalid choice: " + choice);
        };
    }
}