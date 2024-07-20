package com.unisabana.patrones.ejercicio3;

public class EstadoFinalizado implements EstadoPedido {

    @Override
    public void avanzarPedido(Pedido pedido) {
        System.out.println("Pedido finalizado!");
    }
}
