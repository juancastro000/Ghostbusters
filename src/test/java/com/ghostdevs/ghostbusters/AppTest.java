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
        // Capturamos la salida de la consola
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testAppIniciaYFinalizaCorrectamente() {
        // Simular la opción 4 (Salir) para cerrar la app inmediatamente
        String simulatedInput = "4\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Ejecutar la aplicación
        App.main(new String[]{});

        // Capturar la salida
        String output = outputStream.toString();

        // Verificar que el menú se muestra correctamente
        assertThat(output, containsString("===== MENÚ PRINCIPAL ====="));
        assertThat(output, containsString("1. Capturar un fantasma"));
        assertThat(output, containsString("2. Liberar un fantasma"));
        assertThat(output, containsString("3. Listar fantasmas capturados"));
        assertThat(output, containsString("4. Salir"));

        // Verificar que la aplicación finaliza correctamente
        assertThat(output, containsString("¡Hasta la próxima, Cazafantasmas!"));
    }
}