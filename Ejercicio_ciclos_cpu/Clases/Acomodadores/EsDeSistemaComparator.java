package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Acomodadores;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.Comparator;

public class EsDeSistemaComparator implements Comparator<Tareas> {
    @Override
    public int compare(Tareas tarea1, Tareas tarea2) {
        if (tarea1.es_de_sistema() && !tarea2.es_de_sistema()) {
            return -1;
        } else if (!tarea1.es_de_sistema() && tarea2.es_de_sistema()) {
            return 1;
        } else {
            return 0;
        }
    }
}