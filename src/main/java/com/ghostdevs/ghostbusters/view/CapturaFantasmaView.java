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
        System.out.println("===== Captura de Fantasma =====");

        System.out.print("Ingrese el nombre del fantasma: ");
        String nombre = scanner.nextLine().trim();

       
        int idClase = solicitarEntero("Ingrese el ID de la clase del fantasma (1-7): ");

        
        System.out.print("Ingrese el nivel de peligro (Bajo, Medio, Alto, Crítico): ");
        String nivelPeligro = scanner.nextLine().trim();

       
        System.out.print("Ingrese la habilidad especial del fantasma: ");
        String habilidadEspecial = scanner.nextLine().trim();

        
        System.out.print("Ingrese la fecha de captura (ddMMyyyy): ");
        String fechaCaptura = scanner.nextLine().trim();

       
        Fantasma fantasma = controller.capturarFantasma( nombre, idClase, nivelPeligro, habilidadEspecial, fechaCaptura);

        System.out.println("¡Fantasma capturado exitosamente: " + fantasma.getNombre() + "!");
    }

    private int solicitarEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero válido.");
            }
        }
    }
}