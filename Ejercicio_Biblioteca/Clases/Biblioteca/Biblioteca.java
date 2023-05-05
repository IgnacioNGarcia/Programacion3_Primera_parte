package ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Biblioteca;

import ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Libro.Libro;
import ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Persona.Persona;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<Integer, Libro> libros_biblio;


    public Map<Integer, Libro> getLibros_biblio() {
        return libros_biblio;
    }

    public void setLibros_biblio(Map<Integer, Libro> libros_biblio) {
        this.libros_biblio = libros_biblio;
    }

    public Biblioteca() {
        this.libros_biblio = new HashMap<>();
    }

    public void agregar_libro(Libro libro){
        this.libros_biblio.put(libro.getId(), libro);
    }
    public Libro traer_libro(Integer id){
        return this.libros_biblio.get(id);
    }
    public void prestar_libro(Persona persona, Integer id){
        persona.agregar_libro(this.traer_libro(id));

        this.libros_biblio.get(id).setPrestado(true);
        this.libros_biblio.get(id).setPersona_que_tomo_prestado(persona);
    }
    public void consultar_disponibilidad(Libro libro){
        if (this.libros_biblio.get(libro.getId()).getPrestado()) System.out.println("Prestado");
        else System.out.println("Disponible");
    }

    public void mostrar_tamanio_biblio(){
        System.out.println("Tenemos: " + this.libros_biblio.size() + " libros registrados en la biblio :)");
    }
    public void mostrar_cant_de_disponibles(){
        Integer contador = 0;
        for (Map.Entry<Integer,Libro> entrada : this.libros_biblio.entrySet()){
            if (!entrada.getValue().getPrestado()) contador++;
        }
        System.out.println("Tenemos " + contador + " Libros disponibles. ");
    }

    public void consultar_a_quien_se_prestó(Integer id){
        if (!this.libros_biblio.get(id).getPrestado()) System.out.println("Disponible en la biblio");
        else{
            System.out.println("El libro fue prestado a " + this.libros_biblio.get(id).getPersona_que_tomo_prestado().getNombre());
        }
    }
}
