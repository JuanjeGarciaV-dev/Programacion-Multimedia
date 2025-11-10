package com.example.listas;

public class Equipos_Futbol {

    private String title;
    private String image;
    private String estadio;
    private String nombre_aficionados;

    // Constructor que inicializa todos los atributos
    public Equipos_Futbol(String title, String image, String estadio, String nombre_aficionados) {
        this.title = title;
        this.image = image;
        this.estadio = estadio;
        this.nombre_aficionados = nombre_aficionados;
    }

    // Getters para acceder a los atributos
    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getEstadio() {
        return estadio;
    }

    public String getNombre_aficionados() {
        return nombre_aficionados;
    }

    // Setters opcionales
    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public void setNombre_aficionados(String nombre_aficionados) {
        this.nombre_aficionados = nombre_aficionados;
    }
}
