package com.unisabana.patrones.ejercicio4;

public class Main {
    public static void main(String[] args) {
        AdministradorTareas administradorTareas = new AdministradorTareas();
        InvocadorComando invocadorComando = new InvocadorComando();

        // Crea la tarea 1
        Tarea tarea1 = new Tarea("Tarea 1");
        invocadorComando.ejecutaComando(new ComandoCrearTarea(administradorTareas, tarea1));

        // Crea la tarea 2
        Tarea tarea2 = new Tarea("Tarea 2");
        invocadorComando.ejecutaComando(new ComandoCrearTarea(administradorTareas, tarea2));

        // Crea la tarea 3
        Tarea tarea3 = new Tarea("Tarea 3");
        invocadorComando.ejecutaComando(new ComandoCrearTarea(administradorTareas, tarea3));

        // Actualiza la tarea 1
        invocadorComando.ejecutaComando(new ComandoActualizarTarea(administradorTareas, tarea1, "Tarea 1 Actualizada."));

        // Finaliza la tarea 1
        invocadorComando.ejecutaComando(new ComandoFinalizarTarea(administradorTareas, tarea1));

        // Deshace el último comando (Finalizar tarea 1)
        invocadorComando.deshacerComando();

        // Deshace el penúltimo comando (Actualizar tarea 1)
        invocadorComando.deshacerComando();

        // Rehace el comando correspondiente (Actualizar tarea )
        invocadorComando.rehacerComando();

        // Lista las tareas existentes
        invocadorComando.ejecutaComando(new ComandoListarTareas(administradorTareas));
    }
}
