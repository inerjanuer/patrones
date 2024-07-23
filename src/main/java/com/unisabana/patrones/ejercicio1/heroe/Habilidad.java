package com.unisabana.patrones.ejercicio1.heroe;

public class Habilidad {

    private String tipoHabilidad;
    private String nombreHabilidad;

    public Habilidad(String tipoHabilidad, String nombreHabilidad) {
        this.tipoHabilidad = tipoHabilidad;
        this.nombreHabilidad = nombreHabilidad;
    }


    @Override
    public String toString() {
        return "Habilidad{" +
            "tipoHabilidad='" + tipoHabilidad + '\'' +
            ", nombreHabilidad='" + nombreHabilidad + '\'' +
            '}';
    }
}
