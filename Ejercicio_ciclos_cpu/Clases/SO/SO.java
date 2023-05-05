package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.SO;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo.Algortimo;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.*;

public class SO {
    Integer ciclos_cpu = 0;
    ArrayList<Tareas> tareas = new ArrayList<>();
    Map<String, Algortimo> algoritmos = new HashMap<>();

    public Integer getCiclos_cpu() {
        return ciclos_cpu;
    }

    public void setCiclos_cpu(Integer ciclos_cpu) {
        this.ciclos_cpu = ciclos_cpu;
    }

    public ArrayList<Tareas> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tareas> tareas) {
        this.tareas = tareas;
    }

    public Map<String, Algortimo> getAlgoritmos() {
        return algoritmos;
    }

    public void setAlgoritmos(Map<String, Algortimo> algoritmos) {
        this.algoritmos = algoritmos;
    }

    public void agregar_tarea(Tareas tarea){
        this.tareas.add(tarea);
    }
    public void eliminar_tarea(Tareas tarea){
        this.tareas.remove(tarea);
    }

    public void agregar_algoritmo(String key ,Algortimo algo){
        this.algoritmos.put(key,algo);
    }
    public void elminar_algoritmo(String key){
        this.algoritmos.remove(key);
    }

    public void conocer_ciclo_actual(){
        System.out.println("Ciclo actual: " + this.ciclos_cpu);
    }
}
