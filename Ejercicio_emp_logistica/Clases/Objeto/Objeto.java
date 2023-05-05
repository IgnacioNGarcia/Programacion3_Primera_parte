package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto;

public abstract class Objeto {
    private String descripcion;
    private String nombre;
    private Integer dimensiones;
    private Integer id;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDimensiones() {
        return dimensiones;
    }

    public Integer getId() {
        return id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDimensiones(Integer dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
