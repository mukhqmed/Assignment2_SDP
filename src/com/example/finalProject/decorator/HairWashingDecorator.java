package com.example.finalProject.decorator;

import com.example.finalProject.strategy.ServiceStrategy;

public class HairWashingDecorator extends ServiceDecorator {
    public HairWashingDecorator(ServiceStrategy serveBehavior) {
        super(serveBehavior);
    }
    @Override
    public void serve() {
        super.serve();
        System.out.println("Hair washing is added");
    }

}
