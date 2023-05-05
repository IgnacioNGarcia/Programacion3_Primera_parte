package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas;

import ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Excepciones.invalid_user_priority_exception;

public class Tarea_usuario extends Tareas{


    public Tarea_usuario(String nombre, Integer tiempo_est_ejecucion, Integer prioridad) {
        super(nombre, tiempo_est_ejecucion, prioridad);
    }

    @Override
    public Boolean es_de_sistema() {
        return false;
    }
    public void es_prio_aceptable(Integer prioridad) throws invalid_user_priority_exception {
        if (prioridad< 0 || prioridad >9) throw new invalid_user_priority_exception();
    }

    public void setPrioridad(Integer prioridad) throws invalid_user_priority_exception {
        try{
            this.es_prio_aceptable(prioridad);
            this.set_Prioridad(prioridad);
        }catch (invalid_user_priority_exception e){
            System.out.println("Prioridad no valida");
        }
    }
}
