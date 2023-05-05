package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo.Algortimo;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo.Alternado;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo.Prioritario;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Algoritmo.Secuencial;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.SO.SO;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tarea_sistema;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tarea_usuario;
import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas.Tareas;

public class main {
    public static void main(String[] args) {

        Algortimo algoritmo_alternado = new Alternado();
        Algortimo algoritmo_secuencial = new Secuencial();
        Algortimo algoritmo_prioritario = new Prioritario();

        Tareas tarea_usuario1 = new Tarea_usuario("Tarea Usuario 1",3,1);
        Tareas tarea_usuario2 = new Tarea_usuario("Tarea Usuario 2",4,2);
        Tareas tarea_usuario3 = new Tarea_usuario("Tarea Usuario 3",1,4);

        Tareas tarea_sistema1 = new Tarea_sistema("Tarea Sistema 1",2,1);
        Tareas tarea_sistema2 = new Tarea_sistema("Tarea Sistema 2",6,1);
        Tareas tarea_sistema3 = new Tarea_sistema("Tarea Sistema 3",1,0);



        SO sistema_operativo = new SO();
        sistema_operativo.agregar_tarea(tarea_usuario1);
        sistema_operativo.agregar_tarea(tarea_usuario2);
        sistema_operativo.agregar_tarea(tarea_usuario3);
        sistema_operativo.agregar_tarea(tarea_sistema1);
        sistema_operativo.agregar_tarea(tarea_sistema2);
        sistema_operativo.agregar_tarea(tarea_sistema3);

        sistema_operativo.agregar_algoritmo("Alternado", algoritmo_alternado);
        sistema_operativo.agregar_algoritmo("Secuencial", algoritmo_secuencial);
        sistema_operativo.agregar_algoritmo("Prioritario", algoritmo_prioritario);

        /*Prueba de es_de_sistema()
        for (Tareas tarea : sistema_operativo.getTareas()){
            System.out.println(tarea.getNombre() + " Es de sistema? - " + tarea.es_de_sistema());
        }*/


        Algortimo algo_a_usar = sistema_operativo.getAlgoritmos().get("Secuencial");
        algo_a_usar.ejecutar_algoritmo(sistema_operativo.getTareas(), sistema_operativo);



    }
}
