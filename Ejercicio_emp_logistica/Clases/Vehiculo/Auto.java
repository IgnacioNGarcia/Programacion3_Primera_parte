package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Vehiculo;

public class Auto extends Vehiculo{

    public Auto() {
        super();
        this.getObjetos_permitidos().add("Comoda");
        this.getObjetos_permitidos().add("Heladera");
        this.getObjetos_permitidos().add("Lavarropas");
        this.setCarga_maxima(5);
    }
}
