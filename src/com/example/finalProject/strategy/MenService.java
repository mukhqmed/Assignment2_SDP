package com.example.finalProject.strategy;

public class MenService implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in men's haircuts");
    }
}
