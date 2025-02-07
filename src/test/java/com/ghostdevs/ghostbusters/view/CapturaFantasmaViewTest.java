package com.ghostdevs.ghostbusters.view;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.Fantasma;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CapturaFantasmaViewTest {
    private FantasmaController controller;
    private ByteArrayOutputStream outputStream;
    private ContenedorEctoplasmico contenedor;

    @BeforeEach
    void setUp() {
        contenedor = new ContenedorEctoplasmico(); 
        controller = new FantasmaController(contenedor);  // Usamos un controlador real
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));  // Capturamos la salida de consola
    }

    @Test
    void testCapturarFantasma() {
      
        String simulatedInput = "2\n" +                  
        "Sombra del Naranco\n" +  
        "2\n" +                  
        "Medio\n" +             
        "Induce miedo\n" +      
        "03022025\n";         
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        
        CapturaFantasmaView view = new CapturaFantasmaView(controller);
        view.capturarFantasma();

       
        Fantasma capturado = controller.visualizarFantasmas().get(0);
        assertThat(capturado.getNombre(), containsString("Sombra del Naranco"));

       
        String output = outputStream.toString();
        assertThat(output, containsString("¡Fantasma capturado exitosamente: Sombra del Naranco!"));
    }
}