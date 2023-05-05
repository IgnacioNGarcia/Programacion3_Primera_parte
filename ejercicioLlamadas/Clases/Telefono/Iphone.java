package ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Telefono;

import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Persona;

public class Iphone extends Telefono{
    public Iphone(String modelo, Double bateria) {
        super(modelo, bateria);
    }

    @Override
    public void hacerLlamada(Persona persona, Integer duracion) {
        this.setBateria(this.getBateria() - duracion * 0.1);
        recibirLlamada(persona, duracion);
        checkBat();
    }

    @Override
    public Double calculoGastoLlamada(Integer duracionLlamada) {
        return duracionLlamada * 0.1;
    }
}
