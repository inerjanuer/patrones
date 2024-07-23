package com.unisabana.patrones.ejercicio1.heroe;

import java.util.List;

public abstract class Heroe {

    protected List<Habilidad> habilidades;
    protected String experiencia;
    protected Integer nivel;
    protected Integer puntosHabilidad;
    protected List<String> clases;

    public Heroe() {
    }

    public Heroe(HeroeImpl target) {
        this.habilidades = target.habilidades;
        this.experiencia = target.experiencia;
        this.nivel = target.nivel;
        this.puntosHabilidad = target.puntosHabilidad;
        this.clases = target.clases;
    }

    public abstract Heroe clone();



}
