package com.unisabana.patrones.ejercicio4;

public class ComandoListarTareas implements Comando{

    private AdministradorTareas administradorTareas;
    private Tarea tarea;

    public ComandoListarTareas(AdministradorTareas administradorTareas) {
        this.administradorTareas = administradorTareas;
    }

    @Override
    public void ejecutar() {
        administradorTareas.listarTareas();
    }

    @Override
    public void deshacer() {

    }
}
