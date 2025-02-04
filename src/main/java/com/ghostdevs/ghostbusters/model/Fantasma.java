package com.ghostdevs.ghostbusters.model;

import java.time.LocalDate;


public class Fantasma {

    private int id;
    String nombre;
    int idClase;
    String nivelPeligro;
    String habilidadEspecial;
    LocalDate fechaCaptura;

    //Constructor vacio y por parametros
    public Fantasma() {
    }

    public Fantasma(int id, String nombre, int clase, String nivelPeligro, String habilidadEspecial, LocalDate fechaCaptura) {
        this.id = id;
        this.nombre = nombre;
        this.idClase = clase;
        this.nivelPeligro = nivelPeligro;
        this.habilidadEspecial = habilidadEspecial;
        this.fechaCaptura = fechaCaptura;
    }
    public Fantasma(String nombre, int clase, String nivelPeligro, String habilidadEspecial, LocalDate fechaCaptura) {
        this.nombre = nombre;
        this.idClase = clase;
        this.nivelPeligro = nivelPeligro;
        this.habilidadEspecial = habilidadEspecial;
        this.fechaCaptura = fechaCaptura;
    }

    //Métodos getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClase() {
        return idClase;
    }

    public void setClase(int clase) {
        this.idClase = clase;
    }

    public String getNivelPeligro() {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro) {
        this.nivelPeligro = nivelPeligro;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    public LocalDate getFechaCaptura() {
        return fechaCaptura;
    }

    public void setFechaCaptura(LocalDate fechaCaptura) {
        this.fechaCaptura = fechaCaptura;
    }

}
