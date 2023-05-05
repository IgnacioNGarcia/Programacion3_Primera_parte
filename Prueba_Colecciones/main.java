package ar.edu.cuvl.utn.progra3.Prueba_Colecciones;

import ar.edu.cuvl.utn.progra3.Prueba_Colecciones.Clases.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Nacho", 25);
        Persona persona2 = new Persona("Alejo", 25);
        Persona persona3 = new Persona("Mica", 22);
        Persona persona4 = new Persona("Agus", 20);
        Persona persona5 = new Persona("Enzo", 26);

        ArrayList<Persona> personas = new ArrayList();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);
        Collections.sort(personas);

        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()){
            Persona persona = (Persona)it.next();
            System.out.println(persona.mostrarPersona());
        }





    }
}
