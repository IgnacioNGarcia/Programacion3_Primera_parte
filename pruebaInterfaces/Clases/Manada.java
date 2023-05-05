package ar.edu.cuvl.utn.progra3.pruebaInterfaces.Clases;

import ar.edu.cuvl.utn.progra3.pruebaInterfaces.Interfaces.Divertido;
import ar.edu.cuvl.utn.progra3.pruebaInterfaces.Interfaces.SerVivo;

public class Manada implements SerVivo,Divertido {
    public String tipoDeManada;
    public Manada(String tipo){
        this.tipoDeManada = tipo;
    }
    @Override
    public void moverse() {
        System.out.println("La manada de "+this.tipoDeManada +" se está moviendo.");
    }

    @Override
    public void decirAnimal() {
        System.out.println("Somo una manada de: " + this.tipoDeManada);
    }
    public void jugar(){
        System.out.println("La manada "+this.tipoDeManada +"juegaaa, que diversión en grupo");
    }
}
