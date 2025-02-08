package com.ghostdevs.ghostbusters.view;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;


import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.Fantasma;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

class ListaFantasmasViewTest {
    private FantasmaController controller;
    private ByteArrayOutputStream outputStream;
    private ContenedorEctoplasmico contenedor;

    @BeforeEach
    void setUp() {
        contenedor = new ContenedorEctoplasmico();
        controller = new FantasmaController(contenedor);

        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testMostrarListaFantasmasConFantasmas() {
   
        contenedor.agregarFantasma(new Fantasma( "Espectro Sombrío", 2, "Bajo", "Posee objetos", LocalDate.of(2024, 2, 5)));
        contenedor.agregarFantasma(new Fantasma( "Poltergeist Juguetón", 3, "Medio", "Mueve cosas", LocalDate.of(2024, 1, 20)));

        ListaFantasmasView view = new ListaFantasmasView(controller);
        view.mostrarListaFantasmas();

        String output = outputStream.toString();

        assertThat(output, containsString("Lista de fantasmas capturados:"));
        assertThat(output, containsString("Espectro Sombrío"));
        assertThat(output, containsString("Nivel: Bajo"));
        assertThat(output, containsString("Habilidad: Posee objetos"));
        assertThat(output, containsString("Fecha Captura: 2024-02-05"));

        assertThat(output, containsString("Poltergeist Juguetón"));
        assertThat(output, containsString("Nivel: Medio"));
        assertThat(output, containsString("Habilidad: Mueve cosas"));
        assertThat(output, containsString("Fecha Captura: 2024-01-20"));
    }

    @Test
    void testMostrarListaFantasmasVacia() {

        ListaFantasmasView view = new ListaFantasmasView(controller);
        view.mostrarListaFantasmas();


        String output = outputStream.toString();


        assertThat(output, containsString("No hay fantasmas capturados."));
        assertThat(output, not(containsString("Lista de fantasmas capturados:")));
    }
}