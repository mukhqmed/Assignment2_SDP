package com.example.finalProject.singleton;

public class DatabaseSingleton {
    private static DatabaseSingleton instance;

    private DatabaseSingleton() {
        System.out.println("Database connection initialized.");
    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connected to the database.");
    }
}

