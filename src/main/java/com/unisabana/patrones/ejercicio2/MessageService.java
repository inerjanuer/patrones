package com.unisabana.patrones.ejercicio2;

public class MessageService {
    private List<Observer> observers;

    public MessageService() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void receiveMessage(String message) {
        // Lógica para recibir el mensaje y luego notificar a los observadores
        System.out.println("Message received: " + message);
        notifyObservers(message);
    }
}
