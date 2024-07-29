package com.unisabana.patrones.ejercicio5;

abstract class RoomDecorator implements Room {
    protected Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription();
    }

    @Override
    public double getCost() {
        return room.getCost();
    }
}
