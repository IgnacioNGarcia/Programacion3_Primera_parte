package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Acomodadores;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.Comparator;

public class AlternadoComparator implements Comparator<Tareas> {


    @Override
    public int compare(Tareas t1, Tareas t2) {
        if (t1.es_de_sistema() == t2.es_de_sistema()) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
        // Si solo una de las tareas es de sistema, la de sistema va primero
        else if (t1.es_de_sistema()) {
            return -1;
        } else {
            return 1;
        }
    }

}
