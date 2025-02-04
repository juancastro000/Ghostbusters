package com.ghostdevs.ghostbusters.model;

import java.time.LocalDate;
import java.util.Date;


public class Fantasma {

    private int id;
    private String nombre;
    private int idClase;
    private String nivelPeligro;
    private String habilidadEspecial;
    private Date fechaCaptura;

    //Constructor vacio y por parametros
    public Fantasma() {
    }

    public Fantasma(int id, String nombre, int clase, String nivelPeligro, String habilidadEspecial, LocalDate fechaCaptura) {
        this.id = id;
        this.nombre = nombre;
        this.idClase = clase;
        this.nivelPeligro = nivelPeligro;
        this.habilidadEspecial = habilidadEspecial;
        this.fechaCaptura = new Date();
    }
    public Fantasma(String nombre, int clase, String nivelPeligro, String habilidadEspecial, LocalDate fechaCaptura) {
        this.nombre = nombre;
        this.idClase = clase;
        this.nivelPeligro = nivelPeligro;
        this.habilidadEspecial = habilidadEspecial;
        this.fechaCaptura = new Date();
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

    public Date getFechaCaptura() {
        return fechaCaptura;
    }

  

}
