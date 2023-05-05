package ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Libro;

import ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Persona.Persona;

public class Libro {
    private Integer id;
    private String titulo;
    private Integer cant_capitulos;

    public Integer getId() {
        return id;
    }

    public Libro(Integer id, String titulo, Integer cant_capitulos, Boolean prestado) {
        this.id = id;
        this.titulo = titulo;
        this.cant_capitulos = cant_capitulos;
        this.prestado = prestado;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCant_capitulos() {
        return cant_capitulos;
    }

    public void setCant_capitulos(Integer cant_capitulos) {
        this.cant_capitulos = cant_capitulos;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public Persona getPersona_que_tomo_prestado() {
        return persona_que_tomo_prestado;
    }

    public void setPersona_que_tomo_prestado(Persona persona_que_tomo_prestado) {
        this.persona_que_tomo_prestado = persona_que_tomo_prestado;
    }

    private Boolean prestado;
    private Persona persona_que_tomo_prestado;

    public Integer get_dias_de_prestamo(){
        return 35;
    }
}
