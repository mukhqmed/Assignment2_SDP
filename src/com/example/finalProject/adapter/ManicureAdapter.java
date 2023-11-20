package com.example.finalProject.adapter;

import com.example.finalProject.strategy.ServiceStrategy;

public class ManicureAdapter implements ServiceStrategy {
    private ManicureService manicureService;

    public ManicureAdapter(ManicureService manicureService) {
        this.manicureService = manicureService;
    }

    @Override
    public void serve() {
        manicureService.doManicure();
    }
}