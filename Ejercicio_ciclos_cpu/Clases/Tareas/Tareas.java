package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.Clases.Tareas;

public abstract class Tareas {
    private String nombre;
    private Integer tiempo_est_ejecucion;
    private Integer prioridad;

    public Tareas(String nombre, Integer tiempo_est_ejecucion, Integer prioridad) {
        this.nombre = nombre;
        this.tiempo_est_ejecucion = tiempo_est_ejecucion;
        this.set_Prioridad(prioridad);    }

    public Boolean es_de_sistema(){
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTiempo_est_ejecucion() {
        return tiempo_est_ejecucion;
    }

    public void setTiempo_est_ejecucion(Integer tiempo_est_ejecucion) {
        this.tiempo_est_ejecucion = tiempo_est_ejecucion;
    }

    public Integer getPrioridad() {
        return prioridad;
    }

    public void set_Prioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }




}
