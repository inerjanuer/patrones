package com.unisabana.patrones.ejercicio5;

public class BasicRoom implements  Room{

    @Override
    public String getDescription() {
        return "Habitación básica";
    }

    @Override
    public double getCost() {
        return 100.0;
    }
}
