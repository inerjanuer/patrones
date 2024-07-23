package com.unisabana.patrones.ejercicio1.heroe;

public class Aspecto {

    private String cabello;
    private String colorPiel;
    private Integer estatura;
    private String colorOjos;

    public Aspecto(String cabello, String colorPiel, Integer estatura, String colorOjos) {
        this.cabello = cabello;
        this.colorPiel = colorPiel;
        this.estatura = estatura;
        this.colorOjos = colorOjos;
    }

    public void setCabello(String cabello) {
        this.cabello = cabello;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    @Override
    public String toString() {
        return "Aspecto{" +
            "cabello='" + cabello + '\'' +
            ", colorPiel='" + colorPiel + '\'' +
            ", estatura=" + estatura +
            ", colorOjos='" + colorOjos + '\'' +
            '}';
    }
}
