package com.ghostdevs.ghostbusters.view;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.is;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.Fantasma;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.List;

class LiberarFantasmaViewTest {
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
    void testLiberarFantasmaExitosamente() {
        
        contenedor.agregarFantasma(new Fantasma( "Espectro Sombrío", 2, "Bajo", "Posee objetos", LocalDate.now()));
        contenedor.agregarFantasma(new Fantasma( "Poltergeist Juguetón", 3, "Medio", "Mueve cosas", LocalDate.now()));
        contenedor.agregarFantasma(new Fantasma( "Demonio Feroz", 5, "Crítico", "Destruye almas", LocalDate.now()));

       
        String simulatedInput = "Bajo\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

     
        LiberarFantasmaView view = new LiberarFantasmaView(controller);
        view.liberarFantasma();

        String output = outputStream.toString();
        assertThat(output, containsString("Fantasmas liberados:"));
        assertThat(output, containsString("Espectro Sombrío"));
        assertThat(output, not(containsString("Demonio Feroz"))); 

 
        List<Fantasma> fantasmasRestantes = controller.visualizarFantasmas();
        assertThat(fantasmasRestantes.size(), is(2)); 
    }

    @Test
    void testNoLiberarFantasmasProhibidos() {
   
        contenedor.agregarFantasma(new Fantasma( "Demonio Feroz", 5, "Crítico", "Destruye almas", LocalDate.now()));
        contenedor.agregarFantasma(new Fantasma( "Espectro Malévolo", 4, "Alto", "Atormenta mentes", LocalDate.now()));

       
        String simulatedInput = "Crítico\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

     
        LiberarFantasmaView view = new LiberarFantasmaView(controller);
        view.liberarFantasma();

      
        String output = outputStream.toString();
        assertThat(output, containsString("No se liberaron fantasmas"));
        assertThat(output, not(containsString("Fantasmas liberados:")));

 
        List<Fantasma> fantasmasRestantes = controller.visualizarFantasmas();
        assertThat(fantasmasRestantes.size(), is(2)); 
    }

    @Test
    void testNoLiberarFantasmasSiNoExisten() {
    
        String simulatedInput = "Bajo\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

 
        LiberarFantasmaView view = new LiberarFantasmaView(controller);
        view.liberarFantasma();

     
        String output = outputStream.toString();
        assertThat(output, containsString("No se liberaron fantasmas"));
    }
}