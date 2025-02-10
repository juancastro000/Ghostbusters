package com.ghostdevs.ghostbusters;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
     
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testAppIniciaYFinalizaCorrectamente() {
       
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        
        App.main(new String[]{});

     
        String output = outputStream.toString();

     
        assertThat(output, containsString("===== MENÚ PRINCIPAL ====="));
        assertThat(output, containsString("1. Capturar un fantasma"));
        assertThat(output, containsString("2. Liberar un fantasma"));
        assertThat(output, containsString("3. Listar fantasmas capturados"));
        assertThat(output, containsString("4. Salir"));

       
        assertThat(output, containsString("¡Hasta la próxima, Cazafantasmas!"));
    }
}