package com.example.finalProject.decorator;

import com.example.finalProject.strategy.ServiceStrategy;

public class MassageDecorator extends ServiceDecorator {
    public MassageDecorator(ServiceStrategy serveBehavior){
        super(serveBehavior);
    }
    @Override
    public void serve() {
        super.serve();
        System.out.println("Massage service is added");
    }
}
