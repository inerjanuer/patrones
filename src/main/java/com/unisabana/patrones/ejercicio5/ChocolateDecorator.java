package com.unisabana.patrones.ejercicio5;

class ChocolateDecorator extends RoomDecorator {
    public ChocolateDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", chocolate gourmet";
    }

    @Override
    public double getCost() {
        return room.getCost() + 15.0;
    }
}
