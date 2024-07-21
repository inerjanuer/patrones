package com.unisabana.patrones.ejercicio3;

public class ProductDessert implements Product {
    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getProductName() {
        return "Dessert";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando el postre...");
    }
}
