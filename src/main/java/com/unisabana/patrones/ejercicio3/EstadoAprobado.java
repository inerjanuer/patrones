package com.unisabana.patrones.ejercicio3;

public class EstadoAprobado implements EstadoPedido {

    @Override
    public void avanzarPedido(Pedido pedido) {
        System.out.println("Pedido aprobado y se avanza al estado Preparación");
        pedido.estadoPedido = new EstadoPreparado();
    }
}
