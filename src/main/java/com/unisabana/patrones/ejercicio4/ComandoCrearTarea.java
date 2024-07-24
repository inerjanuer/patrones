package com.unisabana.patrones.ejercicio4;

public class ComandoCrearTarea implements Comando{

    private AdministradorTareas administradorTareas;
    private Tarea tarea;

    public ComandoCrearTarea(AdministradorTareas administradorTareas, Tarea tarea) {
        this.administradorTareas = administradorTareas;
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        administradorTareas.crearTarea(tarea);
    }

    @Override
    public void deshacer() {
        administradorTareas.eliminarTarea(tarea);
    }
}
