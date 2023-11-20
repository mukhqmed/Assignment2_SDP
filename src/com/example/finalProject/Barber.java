package com.example.finalProject;

import com.example.finalProject.observer.Observer;
import com.example.finalProject.strategy.ServiceStrategy;
import java.util.List;
import java.util.ArrayList;

public class Barber {
    private ServiceStrategy service;
    private List<Observer> observers;

    public Barber(ServiceStrategy service) {
        this.service = service;
        this.observers = new ArrayList<>();
    }

    public void serve() {
        service.serve();
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}