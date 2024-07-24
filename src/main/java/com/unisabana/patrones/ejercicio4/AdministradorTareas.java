package com.unisabana.patrones.ejercicio4;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class AdministradorTareas {
    private List<Tarea> tareas;

    public void crearTarea(Tarea tarea){
        if(this.tareas == null){
            this.tareas = new ArrayList<>();
        }
        tareas.add(tarea);
    }

    public void actualizarTarea(Tarea tareaAnterior, Tarea tareaNueva){
        int index = tareas.indexOf(tareaAnterior);
        if (index == -1){
            this.crearTarea(tareaNueva);
        }
        tareas.set(index, tareaNueva);
    }

    public void eliminarTarea(Tarea tarea){
        tareas.remove(tarea);
    }

    public void reactivarTarea(Tarea tarea){
        int index = tareas.indexOf(tarea);
        if(index > -1){
            Tarea tareaCompletada = tareas.get(index);
            tareaCompletada.setCompletada(false);
        }
    }

    public void finalizarTarea(Tarea tarea){
        int index = tareas.indexOf(tarea);
        if(index > -1){
            Tarea tareaCompletada = tareas.get(index);
            tareaCompletada.setCompletada(true);
            tareas.set(index, tareaCompletada);
        }
    }

    public void listarTareas(){
        tareas.forEach(System.out::println);
    }
}
