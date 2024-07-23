package com.unisabana.patrones.ejercicio1.heroe;

import java.util.List;

public interface Personaje<T> {

    List<HeroeImpl> heroes();

    HeroeImpl clonar(HeroeImpl heroe);


}
