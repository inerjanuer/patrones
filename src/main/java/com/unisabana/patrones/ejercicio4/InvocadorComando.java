package com.unisabana.patrones.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class InvocadorComando {
    private List<Comando> historialComandos = new ArrayList<>();
    private int index = -1;

    public void ejecutaComando(Comando comando) {
        comando.ejecutar();
        if(index < historialComandos.size()-1) {
            historialComandos = historialComandos.subList(0, index+1);
        }
        historialComandos.add(comando);
        index++;
    }

    public void deshacerComando() {
        if(index > 0) {
            historialComandos.get(index).deshacer();
            index--;
        }
    }

    public void rehacerComando() {
        if(index < historialComandos.size()-1) {
            index++;
            historialComandos.get(index).ejecutar();
        }
    }


}
