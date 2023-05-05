package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Acomodadores;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.Comparator;

public class SecuencialComparator implements Comparator<Tareas> {

    public int compare(Tareas t1, Tareas t2) {
        // Si t1 es de sistema y t2 no, entonces t1 debe ir primero
        if (t1.es_de_sistema() && !t2.es_de_sistema()) {
            return -1; // Devuelve un número negativo para que t1 vaya primero
        }
        // Si t2 es de sistema y t1 no, entonces t2 debe ir primero
        else if (!t1.es_de_sistema() && t2.es_de_sistema()) {
            return 1; // Devuelve un número positivo para que t2 vaya primero
        }
        // Si ambos son de sistema o ambos no son de sistema, entonces no importa el orden
        else {
            return 0; // Devuelve cero para indicar que el orden no importa
        }
    }
}
