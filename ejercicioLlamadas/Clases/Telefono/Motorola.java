package ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Telefono;

import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Persona;

public class Motorola extends Telefono{

    public Motorola(String modelo, Double bateria) {
        super(modelo, bateria);
    }

    @Override
    public void hacerLlamada(Persona persona, Integer duracion) {
        if (this.getBateria() >0) {
            this.setBateria(this.getBateria() - 0.25);
            recibirLlamada(persona, duracion);
            checkBat();
        }else{
            System.out.println("El telefono no tenía bateria para la llamada");
        }
    }
    public void recibirLlamada(Persona persona, Integer duracion){
        persona.getTel().setBateria(persona.getTel().getBateria() - persona.getTel().calculoGastoLlamada(duracion));
        persona.getTel().checkBat();
    }

    @Override
    public Double calculoGastoLlamada(Integer duracionLlamada) {
        return 0.25;
    }


}
