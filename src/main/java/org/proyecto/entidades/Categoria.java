package org.proyecto.entidades;

public class Categoria {
    private Integer id_categorias;
    private String nombre;
    private String descripcion;

    public Categoria(){
    }

    public Categoria(String descripcion, String nombre, Integer id_categorias) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id_categorias = id_categorias;
    }

    public Integer getId_categorias() {
        return id_categorias;
    }

    public void setId_categorias(Integer id_categorias) {
        this.id_categorias = id_categorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id_categorias=" + id_categorias +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
