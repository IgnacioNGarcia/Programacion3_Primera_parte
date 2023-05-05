package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Vehiculo;

public class Camioneta extends Vehiculo{
    public Camioneta() {
        super();
        this.getObjetos_permitidos().add("Televisor");
        this.getObjetos_permitidos().add("Bicicleta plegable");
        this.getObjetos_permitidos().add("Caja");
        this.setCarga_maxima(10);
    }
}
