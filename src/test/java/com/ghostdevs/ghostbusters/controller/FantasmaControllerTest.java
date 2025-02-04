package com.ghostdevs.ghostbusters.controller;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;
import com.ghostdevs.ghostbusters.model.Fantasma;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class FantasmaControllerTest {

    @Test
    @DisplayName(" Comprueba si se añade un fantasma al contenedor")
    void testIfCapturarFantasma_AddFantasmaToContenedor() {

        ContenedorEctoplasmico contenedor = new ContenedorEctoplasmico();
        FantasmaController controller = new FantasmaController(contenedor);


        Fantasma fantasma = controller.capturarFantasma(
            1,
            "Espíritu del Pescador de Lastres",
            4,
            "Bajo",
            "Aparecer durante tormentas en la costa",
            "04022025"
        );

        assertThat(controller, is(instanceOf(FantasmaController.class)));
        assertThat(contenedor.obtenerFantasmas(), hasSize(1));
        assertThat(fantasma.getNombre(), is("Espíritu del Pescador de Lastres"));



    }

 
    
}
