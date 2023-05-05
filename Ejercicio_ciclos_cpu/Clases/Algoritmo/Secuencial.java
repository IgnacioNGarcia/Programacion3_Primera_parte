package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.ArrayList;

public class Secuencial extends Algortimo {
    @Override
    void reacomodar_lista(ArrayList<Tareas> tareas) {
        ArrayList<Tareas> tareas_aux = new ArrayList<Tareas>();
        ArrayList<Tareas> tareas_auxs_us = new ArrayList<Tareas>();

        for (Tareas tarea : tareas) {
            if (tarea.es_de_sistema()) {
                tareas_aux.add(tarea);
            } else {
                tareas_auxs_us.add(tarea);
            }
        }
        tareas.clear();

        while (!tareas_aux.isEmpty()) {
            tareas.add(tareas_aux.get(0));
            tareas_aux.remove(0);
        }

        while (!tareas_auxs_us.isEmpty()) {
            tareas.add(tareas_auxs_us.get(0));
            tareas_auxs_us.remove(0);
        }
        //Funciona correcto.
    }
}