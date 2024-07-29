package com.unisabana.patrones.ejercicio5;

class WineDecorator extends RoomDecorator {
    public WineDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return room.getDescription() + ", vino de alta calidad";
    }

    @Override
    public double getCost() {
        return room.getCost() + 50.0;
    }
}
