package com.example.finalProject.decorator;

import com.example.finalProject.strategy.ServiceStrategy;

public class MassageDecorator extends ServiceDecorator {
    private static final double MASSAGE_DECORATOR_COST = 200;

    public MassageDecorator(ServiceStrategy serveBehavior){
        super(serveBehavior);
    }
    @Override
    public void serve() {
        super.serve();
        System.out.println("Massage service is added");
    }

    @Override
    public double getAdditionalCost() {
        return MASSAGE_DECORATOR_COST;
    }
}
