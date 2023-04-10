package com.example.peliculas.models;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo,descripcion,director,actor, portada;

    public Pelicula(String titulo) {
        this.titulo = titulo;
    }

    public Pelicula(String titulo, String descripcion, String portada, String director, String actor) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.portada = portada;
        this.director = director;
        this.actor = actor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
