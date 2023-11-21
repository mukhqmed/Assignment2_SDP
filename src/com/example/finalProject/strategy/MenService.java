package com.example.finalProject.strategy;

public class MenService implements ServiceStrategy {
    private static final double MEN_SERVICE_COST = 3500;
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in men's haircuts");
    }

    @Override
    public double getCost() {
        return MEN_SERVICE_COST;
    }
}
