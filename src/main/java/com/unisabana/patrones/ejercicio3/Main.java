package com.unisabana.patrones.ejercicio3;

public class Main {
    // Patrón de diseño usado: State
    //  De tal forma que se maneja un estado del pedido. El pedido tiene el atributo Producto
    //      con el cual se puede identificar el tipo de producto y asi agregar validaciones en los
    //      estados del pedido.
    public static void main(String[] args) {
        Product product = new ProductBeverage();
        Pedido pedido = new Pedido(product);
        pedido.asignarEstado();
        pedido.asignarEstado();
        pedido.asignarEstado();
        pedido.asignarEstado();
        pedido.asignarEstado();
    }
}
