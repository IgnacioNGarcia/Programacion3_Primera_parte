package ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas;

public class Brazo_robotico extends Herramienta_accionable{

    @Override
    public Double getPeso() {
        return 500.0;
    }

    @Override
    public String tipo_herramienta() {
        return "Brazo robotico";
    }
}
