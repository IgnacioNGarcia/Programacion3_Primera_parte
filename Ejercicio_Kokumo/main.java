package ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo;

import ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Dron.Dron;
import ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas.Brazo_robotico;
import ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas.Herramienta_accionable;
import ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas.Sensor;
import ar.edu.cuvl.utn.progra3.Ejercicio_Kokumo.Clases.Herramientas.Taser;

public class main {
    public static void main(String[] args) {
        Herramienta_accionable taser = new Taser();
        Herramienta_accionable brazo = new Brazo_robotico();
        Herramienta_accionable Sensor = new Sensor();

        Dron dron = new Dron(Sensor,200.0,5.0,100.0);

        System.out.println("Velocidad: " + dron.velocidad_final() + " Altura: " + dron.altura_final());
        dron.mostrar_herramienta();
    }
}
