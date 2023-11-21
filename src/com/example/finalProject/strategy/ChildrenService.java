package com.example.finalProject.strategy;

public class ChildrenService implements ServiceStrategy {
    private static final double CHILDREN_SERVICE_COST = 3000;
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in children's haircuts");
    }

    @Override
    public double getCost() {
        return CHILDREN_SERVICE_COST;
    }
}
