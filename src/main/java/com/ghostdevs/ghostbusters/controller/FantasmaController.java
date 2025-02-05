package com.ghostdevs.ghostbusters.controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import com.ghostdevs.ghostbusters.model.ContenedorEctoplasmico;
import com.ghostdevs.ghostbusters.model.Fantasma;


public class FantasmaController {

    private ContenedorEctoplasmico contenedor;

    public FantasmaController(ContenedorEctoplasmico contenedor) {
        this.contenedor = contenedor;
    }

    public Fantasma capturarFantasma(int id, String nombre, int idClase, String nivelPeligro, String habilidadEspecial, String fechaCaptura){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
        LocalDate fecha = LocalDate.parse(fechaCaptura, formatter);
        String peligro = nivelPeligro.toLowerCase();

        Fantasma nuevoFantasma = new Fantasma(id, nombre, idClase, peligro, habilidadEspecial, fecha);
        contenedor.agregarFantasma(nuevoFantasma);
        return nuevoFantasma;
    }

    public List<Fantasma> liberarFantasma(String liberar){

        List<Fantasma> fantasmasLiberados = new ArrayList<>();
        Iterator<Fantasma> iterator = contenedor.obtenerFantasmas().iterator();

       

        while (iterator.hasNext()) {
            Fantasma fantasma = iterator.next();
           
            if(fantasma.getNivelPeligro().equalsIgnoreCase(liberar)){
                fantasmasLiberados.add(fantasma);
                iterator.remove();
            }
        }

        return fantasmasLiberados;
    }

    public List<Fantasma> visualizarFantasmas(){
        
    }

}
