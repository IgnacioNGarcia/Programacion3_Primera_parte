package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Excepciones.invalid_system_priority_exception;

public class Tarea_sistema extends Tareas{
    public Tarea_sistema(String nombre, Integer tiempo_est_ejecucion, Integer prioridad) {
        super(nombre, tiempo_est_ejecucion, prioridad);
    }

    @Override
    public Boolean es_de_sistema() {
        return true;
    }

    public void es_prio_aceptable(Integer prioridad) throws invalid_system_priority_exception{
        if (prioridad< 0 || prioridad >1) throw new invalid_system_priority_exception();
    }
}
