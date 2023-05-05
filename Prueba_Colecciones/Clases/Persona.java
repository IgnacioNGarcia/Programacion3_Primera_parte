package ar.edu.cuvl.utn.progra3.Prueba_Colecciones.Clases;

public class Persona implements Comparable{
    private String nombre;
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEdad() {
        return edad;
    }
    public String mostrarPersona(){
        return (this.nombre + " Edad: "+ this.edad);
    }

    public int compareTo(Object objeto){
        Persona persona = (Persona) objeto;
        return this.compararPorEdad(persona);
    }
    private int compararPorEdad(Persona persona){
        if (persona.getEdad() == this.getEdad()) return 0;
        if (persona.getEdad() > this.getEdad()) return-1;
        else return 1;
    }

}
