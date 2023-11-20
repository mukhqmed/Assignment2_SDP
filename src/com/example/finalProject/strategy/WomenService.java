package com.example.finalProject.strategy;

public class WomenService implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in women's haircuts");
    }
}
