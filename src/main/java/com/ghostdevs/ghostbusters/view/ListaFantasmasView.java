package com.ghostdevs.ghostbusters.view;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.Fantasma;

import java.util.List;

public class ListaFantasmasView {
    private final FantasmaController controller;

    public ListaFantasmasView(FantasmaController controller) {
        this.controller = controller;
    }

    public void mostrarListaFantasmas() {
        List<Fantasma> fantasmas = controller.visualizarFantasmas();

        if (fantasmas.isEmpty()) {
            System.out.println("No hay fantasmas capturados.");
        } else {
            System.out.println("Lista de fantasmas capturados:");
            for (Fantasma fantasma : fantasmas) {
                System.out.println("- " + fantasma.getNombre() + " | Nivel: " + fantasma.getNivelPeligro() +
                                   " | Habilidad: " + fantasma.getHabilidadEspecial() +
                                   " | Fecha Captura: " + fantasma.getFechaCaptura());
            }
        }
    }
}