package com.example.modelo;

import java.util.List;

public class Categoria {
    private String nombre;
    private List<Producto> productoList;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getProductoList() {
        return productoList;
    }


    }
