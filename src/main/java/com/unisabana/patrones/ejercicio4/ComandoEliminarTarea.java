package com.unisabana.patrones.ejercicio4;

public class ComandoEliminarTarea implements Comando{

    private AdministradorTareas administradorTareas;
    private Tarea tarea;

    public ComandoEliminarTarea(AdministradorTareas administradorTareas, Tarea tarea) {
        this.administradorTareas = administradorTareas;
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        administradorTareas.eliminarTarea(tarea);
    }

    @Override
    public void deshacer() {
        administradorTareas.crearTarea(tarea);
    }
}
