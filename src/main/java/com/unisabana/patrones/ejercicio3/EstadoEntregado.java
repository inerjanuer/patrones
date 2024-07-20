package com.unisabana.patrones.ejercicio3;

public class EstadoEntregado implements EstadoPedido {

    @Override
    public void avanzarPedido(Pedido pedido) {
        System.out.println("Pedido entregado y se avanza al estado Finalizado");
        pedido.estadoPedido = new EstadoFinalizado();
    }
}
