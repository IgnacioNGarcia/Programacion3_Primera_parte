package ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Dron;

import ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas.Herramienta_accionable;

public class Dron {
    private Herramienta_accionable herramienta;
    private Double peso;
    private Double tolerancia;
    private Double velocidad_max;
    private Double altura_max;

    public Dron(Herramienta_accionable herramienta, Double tolerancia, Double velocidad_max, Double altura_max) {
        this.herramienta = herramienta;
        this.tolerancia = tolerancia;
        this.velocidad_max = velocidad_max;
        this.altura_max = altura_max;
        this.peso = 0.0;
    }

    public void setHerramienta(Herramienta_accionable herramienta) {
        this.herramienta = herramienta;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setTolerancia(Double tolerancia) {
        this.tolerancia = tolerancia;
    }

    public void setVelocidad_max(Double velocidad_max) {
        this.velocidad_max = velocidad_max;
    }

    public void setAltura_max(Double altura_max) {
        this.altura_max = altura_max;
    }

    public Herramienta_accionable getHerramienta(){
        return herramienta;
    }

    public Double getPeso() {
        return this.peso + this.herramienta.getPeso();
    }
    public Double getPesoExtra(){
        return this.tolerancia - this.getPeso();
    }
    public Double getTolerancia() {
        return tolerancia;
    }

    public Double getVelocidad_max() {
        return this.velocidad_max;
    }

    public Double getAltura_max() {
        return altura_max;
    }
    public void mostrar_herramienta(){
        System.out.println(this.herramienta.tipo_herramienta());
    }
    public Double velocidad_final(){
        Integer gramos_extras = (int) (this.getPeso() -this.getTolerancia());
        Integer perdidas = gramos_extras/50;
        if (gramos_extras%50 >0) perdidas = perdidas + 1;
        return this.velocidad_max - this.velocidad_max * (0.02 * perdidas);
    }
    public Double altura_final(){
        Integer gramos_extras = (int) (this.getPeso() -this.getTolerancia());
        Integer perdidas = gramos_extras/50;
        if (gramos_extras%50 >0) perdidas = perdidas + 1;
        return this.altura_max - this.altura_max * (0.05 * perdidas);
    }
}
