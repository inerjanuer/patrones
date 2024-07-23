package com.unisabana.patrones.ejercicio1.heroe;

public class HeroeImpl extends Heroe {

    private String nombre;
    private Aspecto aspecto;

    public HeroeImpl(String nombre, Aspecto aspecto) {
        this.nombre = nombre;
        this.aspecto = aspecto;
    }

    public HeroeImpl(HeroeImpl heroe) {
        super(heroe);
        if(heroe != null){
            this.nombre = heroe.nombre;
            this.aspecto = heroe.aspecto;
        }
    }

    @Override
    public HeroeImpl clone() {
        return new HeroeImpl(this);
    }

    @Override
    public String toString() {
        return "Heroe{" +
            "nombre='" + nombre + '\'' +
            ", aspecto=" + aspecto +
            ", habilidades=" + habilidades +
            ", experiencia='" + experiencia + '\'' +
            ", nivel=" + nivel +
            ", puntosHabilidad=" + puntosHabilidad +
            ", clases=" + clases +
            '}';
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAspecto(Aspecto aspecto) {
        this.aspecto = aspecto;
    }

    public Aspecto getAspecto() {
        return aspecto;
    }


}
