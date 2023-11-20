package com.example.finalProject.observer;

public class Receptionist implements Observer {
    @Override
    public void update() {
        System.out.println("Receptionist: A client has left the barbershop");
    }
}