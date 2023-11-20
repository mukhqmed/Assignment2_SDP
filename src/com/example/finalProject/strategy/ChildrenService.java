package com.example.finalProject.strategy;

public class ChildrenService implements ServiceStrategy {
    @Override
    public void serve() {
        System.out.println("You have chosen a master who specializes in children's haircuts");
    }
}
