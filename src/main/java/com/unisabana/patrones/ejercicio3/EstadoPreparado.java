package com.unisabana.patrones.ejercicio3;

public class EstadoPreparado implements EstadoPedido {
    @Override
    public void avanzarPedido(Pedido pedido) {
        pedido.producto.preparar();
        System.out.println("Pedido preparado y se avanza al estado Entregado");
        pedido.estadoPedido = new EstadoEntregado();
    }
}
