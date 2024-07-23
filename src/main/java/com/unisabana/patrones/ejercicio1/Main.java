package com.unisabana.patrones.ejercicio1;

import com.unisabana.patrones.ejercicio1.heroe.Aspecto;
import com.unisabana.patrones.ejercicio1.heroe.HeroeImpl;
import com.unisabana.patrones.ejercicio1.heroe.Personaje;
import com.unisabana.patrones.ejercicio1.heroe.PersonajeImpl;

import java.util.List;

public class Main {

    /**
     * Patron utilizado el prototype, el cual permite clonar los heroes*
     * y Modificar solo parametros de nombre y aspecto *
     * @param args
     */
    public static void main(String[] args) {
        Personaje heroeOperation = new PersonajeImpl();
        List heroes = heroeOperation.heroes();
        System.out.println("");

        HeroeImpl mago = heroeOperation.clonar((HeroeImpl) heroes.get(0));
        mago.setNombre("Pedro");
        Aspecto aspectoMago = mago.getAspecto();
        aspectoMago.setColorOjos("azules");
        mago.setAspecto(aspectoMago);
        System.out.println("--------Heroe modificado--------");
        System.out.println(mago);
        System.out.println("");

        HeroeImpl guerrero = heroeOperation.clonar((HeroeImpl) heroes.get(2));
        Aspecto aspectoGuerrero = guerrero.getAspecto();
        aspectoGuerrero.setColorPiel("Marron");
        guerrero.setAspecto(aspectoGuerrero);
        System.out.println("--------Heroe modificado--------");
        System.out.println(guerrero);
        System.out.println("");

        HeroeImpl arquero = heroeOperation.clonar((HeroeImpl) heroes.get(1));
        Aspecto aspectoArquero = arquero.getAspecto();
        aspectoArquero.setCabello("Corto");
        aspectoArquero.setEstatura(200);
        arquero.setAspecto(aspectoArquero);
        System.out.println("--------Heroe modificado--------");
        System.out.println(arquero);
        System.out.println("");

    }
}
