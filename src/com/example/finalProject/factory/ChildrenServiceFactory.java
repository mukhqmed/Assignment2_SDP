package com.example.finalProject.factory;

import com.example.finalProject.strategy.ChildrenService;
import com.example.finalProject.strategy.ServiceStrategy;

public class ChildrenServiceFactory implements ServiceFactory {
    @Override
    public ServiceStrategy createService(int choice) {
        if (choice == 3) {
            return new ChildrenService();
        } else {
            throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }
}
