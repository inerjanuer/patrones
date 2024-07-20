package com.unisabana.patrones.ejercicio3;

public class Pedido {

    EstadoPedido estadoPedido;
    Product producto;

    public Pedido(Product producto) {
        this.estadoPedido = new EstadoTomaPedido();
        this.producto = producto;
    }

    public void asignarEstado() {
        estadoPedido.avanzarPedido(this);
    }
}
