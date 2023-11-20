package com.example.finalProject;

import com.example.finalProject.decorator.HairWashingDecorator;
import com.example.finalProject.decorator.MassageDecorator;
import com.example.finalProject.observer.Manager;
import com.example.finalProject.observer.Receptionist;
import com.example.finalProject.singleton.DatabaseSingleton;
import com.example.finalProject.strategy.ServiceStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseSingleton database = DatabaseSingleton.getInstance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Barbershop! Please, choose desired stylist");
        System.out.println("1. Men' stylist ");
        System.out.println("2. Women's stylist");
        System.out.println("3. Children's stylist");
        System.out.println("4. Manicure stylist");
        int choice = scanner.nextInt();
        ServiceStrategy baseService = SimpleServiceFactory.createService(choice);
        if (choice < 4 ) {
            System.out.println("Do you want hair washing (1 for yes, 0 for no): ");
            int hairWashingChoice = scanner.nextInt();
            if (hairWashingChoice == 1) {
                baseService = new HairWashingDecorator(baseService);
            }
            System.out.println("Do you want a massage (1 for yes, 0 for no): ");
            int massageChoice = scanner.nextInt();
            if (massageChoice == 1) {
                baseService = new MassageDecorator(baseService);
            }
        }
            Barber barber = new Barber(baseService);
            barber.registerObserver(new Manager());
            barber.registerObserver(new Receptionist());
            barber.serve();
            database.connect();
    }
}
