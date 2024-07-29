package com.unisabana.patrones.ejercicio2;

public class UserDevice implements Observer{
    private String deviceId;

    public UserDevice(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void update(String message) {
        System.out.println("Device " + deviceId + " received message: " + message);
    }
}
