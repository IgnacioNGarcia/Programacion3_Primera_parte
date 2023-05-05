package ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Vagones;

public class Vagon_carga extends Vagones{
    public Vagon_carga(Double peso_maximo) {
        this.setPeso_maximo(peso_maximo);
    }

    public Double carga_maxima_vagon(){
        return this.getPeso_maximo() + 160;
    }

    @Override
    public Integer get_cant_max_de_pasajeros() {
        return 0;
    }
}
