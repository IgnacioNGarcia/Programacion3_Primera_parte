package ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Telefono;

import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Persona;

public abstract class Telefono {
    private String so;
    private String modelo;
    private Double bateria;
    private Boolean estado;

    public Telefono(String modelo, Double bateria) {
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public Double getBateria() {
        return bateria;
    }

    public void setBateria(Double bateria) {
        if (bateria > 5) bateria = 5.0;
        this.bateria = bateria;
    }
    public void getEstado(){
        if (this.bateria>0.0){
            System.out.println("Prendido");
        }else{
            System.out.println("Apagado");
        }
    }
    public void recargar(){
        this.bateria = 5.0;
    }
    public void conocerBateria(){
        System.out.println("Bateria: " + this.bateria);
    }
    public abstract void hacerLlamada(Persona persona, Integer duracion);
    //public abstract void recibirLlamada(Persona persona, Integer duracion);
    public void recibirLlamada(Persona persona, Integer duracion){
        persona.getTel().setBateria(persona.getTel().getBateria() - persona.getTel().calculoGastoLlamada(duracion));
        persona.getTel().checkBat();
    }
    public abstract Double calculoGastoLlamada(Integer duracionLlamada);
    public  void checkBat(){
        if(this.getBateria() < 0.0) {
            System.out.println("El telefono "+ this.modelo+ " se apagó durante la llamada");
            this.setBateria(0.0);
        }
    }
}
