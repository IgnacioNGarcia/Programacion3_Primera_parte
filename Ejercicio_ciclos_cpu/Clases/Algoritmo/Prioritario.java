package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Acomodadores.PrioridadComparator;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.ArrayList;
import java.util.Collections;

public class Prioritario extends Algortimo{
    @Override
    void reacomodar_lista(ArrayList<Tareas> tareas) {
        Collections.sort(tareas, new PrioridadComparator());
        return;
    }


}
