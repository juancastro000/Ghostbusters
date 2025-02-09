package com.ghostdevs.ghostbusters;

import com.ghostdevs.ghostbusters.controller.FantasmaController;
import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;
import com.ghostdevs.ghostbusters.view.MenuPrincipal;

public class App {
    public static void main(String[] args) {

        ContenedorEctoplasmico contenedor = new ContenedorEctoplasmico();
        FantasmaController controller = new FantasmaController(contenedor);


        MenuPrincipal menu = new MenuPrincipal(controller);
        menu.mostrarMenu();
  
    }
    
}