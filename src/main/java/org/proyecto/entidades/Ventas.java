package org.proyecto.entidades;

public class Ventas {
    private Integer detalle_venta;
    private Integer fecha;
    private Double total;

    public Ventas(){

    }

    public Ventas(Integer detalle_venta, Integer fecha, Double total) {
        this.detalle_venta = detalle_venta;
        this.fecha = fecha;
        this.total = total;
    }

    public Integer getDetalle_venta() {
        return detalle_venta;
    }

    public void setDetalle_venta(Integer detalle_venta) {
        this.detalle_venta = detalle_venta;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Ventas{" +
                "detalle_venta=" + detalle_venta +
                ", fecha=" + fecha +
                ", total=" + total +
                '}';
    }
}
