package ar.edu.cuvl.utn.progra3.pruebaInterfaces.Clases;

import ar.edu.cuvl.utn.progra3.pruebaInterfaces.Interfaces.SerVivo;

public abstract class Animal implements SerVivo {
    public String tipoDeAnimal;

    public String getTipoDeAnimal() {
        return tipoDeAnimal;
    }

    public void setTipoDeAnimal(String tipoDeAnimal) {
        this.tipoDeAnimal = tipoDeAnimal;
    }

    @Override
    public void decirAnimal() {

    }

    @Override
    public void moverse() {

    }
}
