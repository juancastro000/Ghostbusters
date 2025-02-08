package com.ghostdevs.ghostbusters.view;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.Fantasma;

import java.util.List;
import java.util.Scanner;

public class LiberarFantasmaView {
    private final FantasmaController controller;
    private final Scanner scanner;

    public LiberarFantasmaView(FantasmaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void liberarFantasma() {
        System.out.println("Ingrese el nivel de peligro de los fantasmas a liberar (Bajo, Medio):");
        String nivelPeligro = scanner.nextLine().trim();

        // Llamar al controlador para liberar fantasmas
        List<Fantasma> fantasmasLiberados = controller.liberarFantasma(nivelPeligro);

        // Mostrar los fantasmas liberados
        if (fantasmasLiberados.isEmpty()) {
            System.out.println("No se liberaron fantasmas con nivel de peligro '" + nivelPeligro + "'.");
        } else {
            System.out.println("Fantasmas liberados:");
            for (Fantasma fantasma : fantasmasLiberados) {
                System.out.println("- " + fantasma.getNombre() + " (" + fantasma.getNivelPeligro() + ")");
            }
        }
    }
}