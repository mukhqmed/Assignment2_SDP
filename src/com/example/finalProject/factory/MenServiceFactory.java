package com.example.finalProject.factory;

import com.example.finalProject.strategy.MenService;
import com.example.finalProject.strategy.ServiceStrategy;

public class MenServiceFactory implements ServiceFactory {
    @Override
    public ServiceStrategy createService(int choice) {
        if (choice == 1) {
            return new MenService();
        } else {
            throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }
}
