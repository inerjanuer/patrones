package com.unisabana.patrones.ejercicio5;

class FlowerDecorator extends RoomDecorator {
    public FlowerDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", flores frescas";
    }

    @Override
    public double getCost() {
        return room.getCost() + 25.0;
    }
}
