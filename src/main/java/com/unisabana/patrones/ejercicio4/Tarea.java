package com.unisabana.patrones.ejercicio4;

import java.util.Objects;
import java.util.Random;

public class Tarea {
    private Long id;
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion) {
        Random random = new Random();
        this.id = random.nextLong(1000);
        this.descripcion = descripcion;
        this.completada = false;
    }

    public Tarea(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public Long getId() {
        return id;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarea tarea = (Tarea) o;
        return Objects.equals(id, tarea.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", completada=" + completada +
                '}';
    }
}
