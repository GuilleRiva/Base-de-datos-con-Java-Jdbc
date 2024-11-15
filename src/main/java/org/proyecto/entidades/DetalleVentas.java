package org.proyecto.entidades;

public class DetalleVentas {
    private Integer id_detalleVentas;
    private Integer cantidad;
    private Double precio_unitario;

    public DetalleVentas(){}

    public DetalleVentas(Integer id_detalleVentas, Integer cantidad, Double precio_unitario) {
        this.id_detalleVentas = id_detalleVentas;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
    }

    public Integer getId_detalleVentas() {
        return id_detalleVentas;
    }

    public void setId_detalleVentas(Integer id_detalleVentas) {
        this.id_detalleVentas = id_detalleVentas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }
}

