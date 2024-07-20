package com.unisabana.patrones.ejercicio3;

public class ProductFood implements Product {

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String getProductName() {
        return "Food";
    }
}
