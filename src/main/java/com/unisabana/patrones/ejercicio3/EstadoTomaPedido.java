package com.unisabana.patrones.ejercicio3;

public class EstadoTomaPedido implements EstadoPedido {
    @Override
    public void avanzarPedido(Pedido pedido) {
        System.out.println("Pedido tomado y se avanza al estado Aprobado");
        pedido.estadoPedido = new EstadoAprobado();
    }
}
