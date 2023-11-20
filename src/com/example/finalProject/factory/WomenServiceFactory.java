package com.example.finalProject.factory;

import com.example.finalProject.strategy.ServiceStrategy;
import com.example.finalProject.strategy.WomenService;

public class WomenServiceFactory implements ServiceFactory {
    @Override
    public ServiceStrategy createService(int choice) {
        if (choice == 2) {
            return new WomenService();
        } else {
            throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }
}