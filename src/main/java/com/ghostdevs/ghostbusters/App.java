package com.ghostdevs.ghostbusters;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;
import com.ghostdevs.ghostbusters.view.MenuPrincipal;

public class App {
    public static void main(String[] args) {
        // Inicializamos el contenedor de fantasmas y el controlador
        ContenedorEctoplasmico contenedor = new ContenedorEctoplasmico();
        FantasmaController controller = new FantasmaController(contenedor);

        // Iniciamos el menú principal
        MenuPrincipal menu = new MenuPrincipal(controller);
        menu.mostrarMenu();
  
    }
    
}