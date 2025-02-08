package com.ghostdevs.ghostbusters.view;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;
import java.util.Scanner;

public class MenuPrincipal {
    private final FantasmaController controller;
    private final Scanner scanner;

    public MenuPrincipal(FantasmaController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Capturar un fantasma");
            System.out.println("2. Liberar un fantasma");
            System.out.println("3. Listar fantasmas capturados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    capturarFantasma();
                    break;
                case "2":
                    liberarFantasma();
                    break;
                case "3":
                    listarFantasmas();
                    break;
                case "4":
                    System.out.println("¡Hasta la próxima, Cazafantasmas!");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private void capturarFantasma() {
        CapturaFantasmaView capturaView = new CapturaFantasmaView(controller);
        capturaView.capturarFantasma();
    }

    private void liberarFantasma() {
        LiberarFantasmaView liberarView = new LiberarFantasmaView(controller);
        liberarView.liberarFantasma();
    }

    private void listarFantasmas() {
        ListaFantasmasView listaView = new ListaFantasmasView(controller);
        listaView.mostrarListaFantasmas();
    }

    public static void main(String[] args) {
        ContenedorEctoplasmico contenedor = new ContenedorEctoplasmico();
        FantasmaController controller = new FantasmaController(contenedor);
        MenuPrincipal menu = new MenuPrincipal(controller);
        menu.mostrarMenu();
    }
}