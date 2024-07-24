package com.unisabana.patrones.ejercicio4;

public class ComandoFinalizarTarea implements Comando{

    private AdministradorTareas administradorTareas;
    private Tarea tarea;

    public ComandoFinalizarTarea(AdministradorTareas administradorTareas, Tarea tarea) {
        this.administradorTareas = administradorTareas;
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        administradorTareas.finalizarTarea(tarea);
    }

    @Override
    public void deshacer() {
        administradorTareas.reactivarTarea(tarea);
    }
}
