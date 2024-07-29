package com.unisabana.patrones.ejercicio5;

public class Main {

    public static void main(String[] args) {
        Room room = new BasicRoom();
        System.out.println("Descripción: " + room.getDescription());
        System.out.println("Costo: $" + room.getCost());

        System.out.println("\nAgregando decoraciones:");

        // Agregar flores
        room = new FlowerDecorator(room);
        System.out.println("Descripción: " + room.getDescription());
        System.out.println("Costo: $" + room.getCost());

        // Agregar chocolate
        room = new ChocolateDecorator(room);
        System.out.println("Descripción: " + room.getDescription());
        System.out.println("Costo: $" + room.getCost());

        // Agregar vino
        room = new WineDecorator(room);
        System.out.println("Descripción: " + room.getDescription());
        System.out.println("Costo: $" + room.getCost());
    }
}
