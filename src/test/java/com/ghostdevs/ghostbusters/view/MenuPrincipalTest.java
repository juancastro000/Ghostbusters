package com.ghostdevs.ghostbusters.view;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MenuPrincipalTest {
    private ByteArrayOutputStream outputStream;
    private ContenedorEctoplasmico contenedor;
    private FantasmaController controller;

    @BeforeEach
    void setUp() {
        contenedor = new ContenedorEctoplasmico();
        controller = new FantasmaController(contenedor);

     
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMostrarMenuYSalir() {
      
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

    
        MenuPrincipal menu = new MenuPrincipal(controller);
        menu.mostrarMenu();

   
        String output = outputStream.toString();

        assertThat(output, containsString("===== MENÚ PRINCIPAL ====="));
        assertThat(output, containsString("1. Capturar un fantasma"));
        assertThat(output, containsString("2. Liberar un fantasma"));
        assertThat(output, containsString("3. Listar fantasmas capturados"));
        assertThat(output, containsString("4. Salir"));

   
        assertThat(output, containsString("¡Hasta la próxima, Cazafantasmas!"));
    }

    @Test
    void testOpcionInvalida() {
      
        String simulatedInput = "99\n4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        MenuPrincipal menu = new MenuPrincipal(controller);
        menu.mostrarMenu();

   
        String output = outputStream.toString();

      
        assertThat(output, containsString("Opción no válida. Intente nuevamente."));
    }
}