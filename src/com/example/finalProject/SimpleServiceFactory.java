package com.example.finalProject;

import com.example.finalProject.adapter.ManicureAdapter;
import com.example.finalProject.adapter.ManicureService;
import com.example.finalProject.strategy.ChildrenService;
import com.example.finalProject.strategy.MenService;
import com.example.finalProject.strategy.ServiceStrategy;
import com.example.finalProject.strategy.WomenService;

public class SimpleServiceFactory {
    public static ServiceStrategy createService(int choice) {
        return switch (choice) {
            case 1 -> new MenService();
            case 2 -> new WomenService();
            case 3 -> new ChildrenService();
            case 4 -> {
                ManicureService manicureService = new ManicureService();
                yield new ManicureAdapter(manicureService);
            }
            default -> throw new IllegalArgumentException("Invalid choice: " + choice);
        };
    }
}