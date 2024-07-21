package com.unisabana.patrones.ejercicio3;

public class ProductBeverage implements Product {
    @Override
    public int getPrice() {
        return 8;
    }

    @Override
    public String getProductName() {
        return "Beverage";
    }

    @Override
    public void preparar() {
        System.out.println("Preparando la bebida...");
    }
}
