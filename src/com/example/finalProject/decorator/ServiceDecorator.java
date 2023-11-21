package com.example.finalProject.decorator;

import com.example.finalProject.strategy.ServiceStrategy;

public abstract class ServiceDecorator implements ServiceStrategy {
    protected ServiceStrategy serveBehavior;

    public ServiceDecorator(ServiceStrategy serveBehavior) {
        this.serveBehavior = serveBehavior;
    }

    @Override
    public void serve() {
        serveBehavior.serve();
    }
    public abstract double getAdditionalCost();

    @Override
    public double getCost() {
        return serveBehavior.getCost() + getAdditionalCost();
    }
}
