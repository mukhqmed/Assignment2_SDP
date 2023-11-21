package com.example.finalProject.strategy;

public class WomenService implements ServiceStrategy {
    private static final double WOMEN_SERVICE_COST = 4500;
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in women's haircuts");
    }

    @Override
    public double getCost() {
        return WOMEN_SERVICE_COST;
    }
}
