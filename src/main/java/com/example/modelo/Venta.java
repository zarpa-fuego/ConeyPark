package com.example.modelo;

import java.util.List;

public class Venta {
    private String serie;
    private String numero;
    private List<VentaDetalle> ventaDetalleList;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
