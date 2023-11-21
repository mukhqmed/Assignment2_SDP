package com.example.finalProject.decorator;

import com.example.finalProject.strategy.ServiceStrategy;

public class HairWashingDecorator extends ServiceDecorator {
    private static final double WASHING_DECORATOR_COST = 200;
    public HairWashingDecorator(ServiceStrategy serveBehavior) {
        super(serveBehavior);
    }
    @Override
    public void serve() {
        super.serve();
        System.out.println("Hair washing is added");
    }

    @Override
    public double getAdditionalCost() {
        return WASHING_DECORATOR_COST;
    }
}
