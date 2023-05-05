package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Acomodadores;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.Comparator;

public class PrioridadComparator implements Comparator<Tareas> {
    @Override
    public int compare(Tareas tarea1, Tareas tarea2) {
        return Integer.compare(tarea1.getPrioridad(), tarea2.getPrioridad());
    }
}