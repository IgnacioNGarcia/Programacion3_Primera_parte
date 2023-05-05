package ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas;

public class Taser extends Herramienta_accionable{


    @Override
    public Double getPeso() {
        return 300.0;
    }

    @Override
    public String tipo_herramienta() {
        return "Taser";
    }
}
