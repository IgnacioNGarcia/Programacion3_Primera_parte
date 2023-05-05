package ar.edu.cuvl.utn.progra3.Ejercicio_lista_precios.Clases;

public class Articulo {
    private String nombre;
    private Double costo_produccion;
    private String observacion;

    public Articulo(String nombre, Double costo_produccion) {
        this.nombre = nombre;
        this.costo_produccion = costo_produccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCosto_produccion() {
        return costo_produccion;
    }

    public void setCosto_produccion(Double costo_produccion) {
        this.costo_produccion = costo_produccion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
