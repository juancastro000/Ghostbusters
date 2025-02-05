package com.ghostdevs.ghostbusters.model;

import java.time.LocalDate;



public class Fantasma {

    private int id;
    private String nombre;
    private int idClase;
    private String nivelPeligro;
    private String habilidadEspecial;
    private LocalDate fechaCaptura;

    public Fantasma(int id, String nombre, int clase, String nivelPeligro, String habilidadEspecial, LocalDate fechaCaptura) {
        this.id = id;
        this.nombre = nombre;
        this.idClase = clase;
        this.nivelPeligro = nivelPeligro;
        this.habilidadEspecial = habilidadEspecial;
        this.fechaCaptura = fechaCaptura;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdClase() {
        return idClase;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public LocalDate getFechaCaptura() {
        return fechaCaptura;
    }

  

}
