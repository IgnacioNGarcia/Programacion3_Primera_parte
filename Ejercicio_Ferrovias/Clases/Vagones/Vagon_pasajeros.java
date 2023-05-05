package ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Vagones;

import ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Pasajero.Pasajero;

import java.util.ArrayList;

public class Vagon_pasajeros extends Vagones {
    private Double largo;
    private Double ancho_util;
    private ArrayList<Pasajero> pasajeros;

    public Vagon_pasajeros(Double largo, Double ancho_util) {
        this.largo = largo;
        this.ancho_util = ancho_util;
        this.pasajeros = new ArrayList<>();
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho_util() {
        return ancho_util;
    }

    public void setAncho_util(Double ancho_util) {
        this.ancho_util = ancho_util;
    }

    public Integer get_cant_max_de_pasajeros() {
        if (this.ancho_util <= 2.5) return (int) (this.largo * 8);
        else return (int) (this.largo * 10);
    }

    public void agregar_pasajero(Pasajero pasajero_nuevo) {
        this.pasajeros.add(pasajero_nuevo); //agregar el try y catch cuando haga las excepciones.
    }

    public Double getPeso_maximo() {
    return (double) (80*this.get_cant_max_de_pasajeros());
    }
}