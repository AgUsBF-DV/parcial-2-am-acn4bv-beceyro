package com.example.viverodv.model;

import java.io.Serializable;

/**
 * Modelo producto del vivero.
 * Implementa Serializable para poder pasar instancias entre Activities via Intent.
 */
public class Producto implements Serializable {

    private String id;
    private String nombre;
    private double precio;
    private String descripcion;
    private String urlImagen;

    public Producto(String id, String nombre, double precio, String descripcion, String urlImagen) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
}
