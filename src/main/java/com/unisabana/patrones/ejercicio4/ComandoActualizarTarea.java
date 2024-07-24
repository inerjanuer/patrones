package com.unisabana.patrones.ejercicio4;

public class ComandoActualizarTarea implements Comando{
    private AdministradorTareas administradorTareas;
    private Tarea tareaAnterior;
    private Tarea tareaNueva;

    public ComandoActualizarTarea(AdministradorTareas administradorTareas, Tarea tareaAnterior, String descripcion) {
        this.administradorTareas = administradorTareas;
        this.tareaAnterior = tareaAnterior;
        this.tareaNueva = new Tarea(tareaAnterior.getId(), descripcion);
    }

    @Override
    public void ejecutar() {
        this.administradorTareas.actualizarTarea(this.tareaAnterior, this.tareaNueva);
    }

    @Override
    public void deshacer() {
        this.administradorTareas.actualizarTarea(this.tareaNueva, this.tareaAnterior);
    }
}
