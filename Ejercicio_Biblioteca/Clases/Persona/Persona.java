package ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Persona;

import ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Biblioteca.Biblioteca;
import ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Libro.Libro;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String mail;
    ArrayList<Libro> libros_prestados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.libros_prestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Libro> getLibros_prestados() {
        return libros_prestados;
    }

    public void setLibros_prestados(ArrayList<Libro> libros_prestados) {
        this.libros_prestados = libros_prestados;
    }

    public void devolver_libro(Biblioteca biblio, Libro libro){
        biblio.getLibros_biblio().get(libro.getId()).setPrestado(false);
        //Borrar los datos de quien lo prestó de la biblio.
        this.libros_prestados.remove(libro);
    }
    public void agregar_libro(Libro libro){
        this.libros_prestados.add(libro);
    }
}
