package ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases;

import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Telefono.Telefono;

public class Persona{
    private String nombre;
    private Telefono tel;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTel(Telefono tel) {
        this.tel = tel;
    }

    public String getNombre() {
        return nombre;
    }

    public Telefono getTel() {
        return tel;
    }

    public Persona(String nombre, Telefono tel) {
        this.nombre = nombre;
        this.tel = tel;
    }
}
