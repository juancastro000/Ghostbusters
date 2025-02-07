package com.ghostdevs.ghostbusters.view;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.Fantasma;

import java.util.Scanner;

public class CapturaFantasmaView {
    private final FantasmaController controller;
    private final Scanner scanner;

    public CapturaFantasmaView(FantasmaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void capturarFantasma() {
        System.out.println("Ingrese los datos del fantasma en el siguiente formato:");
        System.out.println("ID\\Nombre\\ID Clase\\Nivel de Peligro\\Habilidad Especial\\Fecha de Captura (ddMMyyyy)");

        String input = scanner.nextLine();
        String[] datos = input.split("\\\\");

        if (datos.length < 6) {
            System.out.println("Error: Formato incorrecto.");
            return;
        }

        try {
            int id = Integer.parseInt(datos[0]);
            String nombre = datos[1];
            int idClase = Integer.parseInt(datos[2]);
            String nivelPeligro = datos[3];
            String habilidadEspecial = datos[4];
            String fechaCaptura = datos[5];

           
            Fantasma fantasma = controller.capturarFantasma(id, nombre, idClase, nivelPeligro, habilidadEspecial, fechaCaptura);
            
            System.out.println("¡Fantasma capturado exitosamente: " + fantasma.getNombre() + "!");
        } catch (NumberFormatException e) {
            System.out.println("Error: ID e ID Clase deben ser números enteros.");
        }
    }
}