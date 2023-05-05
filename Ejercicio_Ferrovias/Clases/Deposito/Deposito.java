package ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Deposito;

import ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Locomotora.Locomotora;
import ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Tren.Tren;

import java.util.ArrayList;
import java.util.Iterator;

public class Deposito {
    private ArrayList<Tren> trenes_armados;
    private ArrayList<Locomotora> locomotaras_para_agregar;

    public Boolean necesita_conductor_experimentado(){
        Iterator<Tren> it = this.trenes_armados.iterator();
        while (it.hasNext()){
            Tren tren = (Tren) it.next();
            if (tren.es_complejo()) return true;
        }
        return false;
    }
}
