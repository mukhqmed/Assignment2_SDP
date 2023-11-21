package com.example.finalProject.adapter;

import com.example.finalProject.strategy.ServiceStrategy;

public class ManicureAdapter implements ServiceStrategy {
    private static final double MANICURE_SERVICE_COST = 5000;
    private ManicureService manicureService;

    public ManicureAdapter(ManicureService manicureService) {
        this.manicureService = manicureService;
    }

    @Override
    public void serve() {
        manicureService.doManicure();
    }

    @Override
    public double getCost() {
        return MANICURE_SERVICE_COST;
    }
}