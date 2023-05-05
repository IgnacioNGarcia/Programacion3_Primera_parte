package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.SO.SO;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

import java.util.ArrayList;

public abstract class Algortimo {

    abstract void reacomodar_lista(ArrayList<Tareas> tareas);
    public void ejecutar_algoritmo(ArrayList<Tareas> tareas, SO sist_opt_xra_actualizar){
        this.reacomodar_lista(tareas);
        //las acomoda bien.
        System.out.println("Todo ok");
        for (Tareas tarea : tareas){
            sist_opt_xra_actualizar.setCiclos_cpu(sist_opt_xra_actualizar.getCiclos_cpu() + tarea.getTiempo_est_ejecucion());

            System.out.println("Proceso " + tarea.getNombre() +" finalizado");
            System.out.println("Ciclo actual: "+sist_opt_xra_actualizar.getCiclos_cpu());
            System.out.println("");
        }
    }
}

