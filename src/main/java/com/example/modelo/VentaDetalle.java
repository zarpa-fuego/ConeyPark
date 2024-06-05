package com.example.modelo;

import java.util.List;

public class VentaDetalle {
    private Double precio;
    private Producto producto;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
