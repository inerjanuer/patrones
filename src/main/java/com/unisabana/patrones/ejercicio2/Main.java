package com.unisabana.patrones.ejercicio2;

public class Main {
    public static void main(String[] args) {
        MessageService service = new MessageService();

        UserDevice device1 = new UserDevice("Device1");
        UserDevice device2 = new UserDevice("Device2");

        service.addObserver(device1);
        service.addObserver(device2);

        service.receiveMessage("Hello, World!");

        service.removeObserver(device1);

        service.receiveMessage("Another message");
    }
}
