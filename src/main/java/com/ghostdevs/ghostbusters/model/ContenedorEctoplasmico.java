package com.ghostdevs.ghostbusters.model;

import java.util.ArrayList;
import java.util.List;

public class ContenedorEctoplasmico {

    //Atributos
    private List<Fantasma> contenedorFantasma;
    //Constructor
    public ContenedorEctoplasmico() {
        this.contenedorFantasma = new ArrayList<>();
    }

    public void agregarFantasma(Fantasma fantasma) {
        contenedorFantasma.add(fantasma);
    }

    public List<Fantasma> obtenerFantasmas() {
        return this.contenedorFantasma;
    }

    
}

