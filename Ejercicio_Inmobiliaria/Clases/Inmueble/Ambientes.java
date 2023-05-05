package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble;

public class Ambientes {
    private Integer cantidad;
    private String tipo;
    private String dimensiones;
    private Boolean son_luminosos;

    public Ambientes(Integer cantidad, String tipo,
                     String dimensiones, Boolean son_luminosos) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.dimensiones = dimensiones;
        this.son_luminosos = son_luminosos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Boolean getSon_luminosos() {
        return son_luminosos;
    }

    public void setSon_luminosos(Boolean son_luminosos) {
        this.son_luminosos = son_luminosos;
    }
    public void mostrar_amb(){
        System.out.println("Informacion de los ambientes: ");
        System.out.println("Cantidad de ambientes: " + this.cantidad);
        System.out.println("Tipo de ambientes: " + this.tipo);
        System.out.println("Dimensiones de ambientes: " + this.dimensiones);
        System.out.println("Son luminosos: " + this.son_luminosos);


    }
}
