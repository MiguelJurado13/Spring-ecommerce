package com.ecommerce.ecommerce.model;

import java.util.Date;

public class Order {
    private Integer id;
    private String numero;
    private Date fechaCreacion;
    private Date fechaRecibido;

    public Order(){

    }

    public Order(Integer id, String numero, Date fechaCreacion, Date fechaRecibido) {
        this.id = id;
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibido = fechaRecibido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Date fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    @Override
    public String toString() {
        return "Order: " +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaRecibido=" + fechaRecibido;
    }
}
