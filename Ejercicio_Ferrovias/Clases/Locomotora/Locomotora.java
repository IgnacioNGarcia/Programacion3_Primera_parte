package ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Locomotora;

public class Locomotora {
    private Double peso;
    private Double peso_arrastre_maximo;
    private Double vel_max;

    public Locomotora(Double peso, Double peso_arrastre_maximo, Double vel_max) {
        this.peso = peso;
        this.peso_arrastre_maximo = peso_arrastre_maximo;
        this.vel_max = vel_max;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPeso_arrastre_maximo() {
        return peso_arrastre_maximo;
    }

    public void setPeso_arrastre_maximo(Double peso_arrastre_maximo) {
        this.peso_arrastre_maximo = peso_arrastre_maximo;
    }

    public Double getVel_max() {
        return vel_max;
    }

    public void setVel_max(Double vel_max) {
        this.vel_max = vel_max;
    }


    public Double get_arrastre_util(){
        return 0.0;
    }
    public Double get_velocidad_maxima(){
        return 0.0;
    }
    public Boolean es_eficiente(){
        if ((this.peso * 5) <= this.peso_arrastre_maximo) return true;
        else return false;
    }
}
