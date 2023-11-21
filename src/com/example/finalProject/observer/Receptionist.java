package com.example.finalProject.observer;

import com.example.finalProject.Barber;

public class Receptionist implements Observer {
    private Barber barber;
    public Receptionist(Barber barber){
        this.barber=barber;
    }
    @Override
    public void update() {
        System.out.println("Receptionist: A client has left the barbershop");
        System.out.println("Receptionist: The total cost of the service is: ₸" + barber.getCost());
    }
}