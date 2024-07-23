package com.unisabana.patrones.ejercicio1.heroe;

import java.util.List;

public class PersonajeImpl implements Personaje {

    @Override
    public List<HeroeImpl> heroes() {
        HeroeImpl heroe = new HeroeImpl("Merlin", new Aspecto("corto", "blanca", 160, "cafes"));
        heroe.habilidades = List.of(new Habilidad("Ataque", "Dispara rayo"),
                new Habilidad("Defensa", "Escudo magico"),
                new Habilidad("Magica", "Recuperar compañero"));
        heroe.experiencia = "Basica";
        heroe.nivel = 10;
        heroe.puntosHabilidad = 10;
        heroe.clases = List.of("Guerrro", "Mago");

        HeroeImpl heroe1 = new HeroeImpl("Juana de arco", new Aspecto("largo", "blanca", 155, "azules"));
        heroe1.habilidades = List.of(new Habilidad("Ataque", "Disparar arco"),
                new Habilidad("Defensa", "Escudo"),
                new Habilidad("Magica", "Multiplicar flechas"));
        heroe1.experiencia = "Media";
        heroe1.nivel = 20;
        heroe1.puntosHabilidad = 5;
        heroe1.clases = List.of("Guerrro", "Arquero");

        HeroeImpl heroe2 = new HeroeImpl("Aquiles", new Aspecto("corto", "blanca", 190, "verdes"));
        heroe2.habilidades = List.of(new Habilidad("Ataque", "Estocada con espada"),
                new Habilidad("Defensa", "Esquivar"),
                new Habilidad("Magica", "Autorecuperacion"));
        heroe2.experiencia = "Baisca";
        heroe2.nivel= 15;
        heroe2.puntosHabilidad = 20;
        heroe2.clases = List.of("Guerrro");

        System.out.println("--------Lista de heroes--------");
        System.out.println(heroe);
        System.out.println(heroe1);
        System.out.println(heroe2);
        System.out.println("----------------");

        return List.of(heroe, heroe1, heroe2);
    }

    @Override
    public HeroeImpl clonar(HeroeImpl heroe) {
        System.out.println("--------Heroe a clonar--------");
        System.out.println(heroe);
        return heroe.clone();
    }
}
