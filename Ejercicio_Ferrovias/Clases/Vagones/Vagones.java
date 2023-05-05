package ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Vagones;

public abstract class Vagones {
    private Double peso_maximo;

    public Double getPeso_maximo() {
        return peso_maximo;
    }

    public void setPeso_maximo(Double peso_maximo) {
        this.peso_maximo = peso_maximo;
    }
    public Boolean es_liviano(){
        if (this.peso_maximo< 2500.0) return true;
        else return false;
    }
    public abstract Integer get_cant_max_de_pasajeros();
}
