package com.example.finalProject.observer;

public class Manager implements Observer {
    @Override
    public void update() {
        System.out.println("Manager: A new client has been served");
    }
}
