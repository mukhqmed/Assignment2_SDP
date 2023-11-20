package com.example.finalProject.factory;

import com.example.finalProject.strategy.ServiceStrategy;

public interface ServiceFactory {
    ServiceStrategy createService(int choice);
}