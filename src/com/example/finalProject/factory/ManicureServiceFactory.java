package com.example.finalProject.factory;

import com.example.finalProject.adapter.ManicureAdapter;
import com.example.finalProject.adapter.ManicureService;
import com.example.finalProject.strategy.ServiceStrategy;

public class ManicureServiceFactory implements ServiceFactory {
    @Override
    public ServiceStrategy createService(int choice) {
        if (choice == 4) {
            ManicureService manicureService = new ManicureService();
            return new ManicureAdapter(manicureService);
        } else {
            throw new IllegalArgumentException("Invalid choice: " + choice);
        }
    }
}
