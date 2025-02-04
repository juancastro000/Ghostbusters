package com.ghostdevs.ghostbusters.controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

        Fantasma nuevoFantasma = new Fantasma(id, nombre, idClase, nivelPeligro, habilidadEspecial, fecha);
        contenedor.agregarFantasma(nuevoFantasma);
        return nuevoFantasma;
    }

}
