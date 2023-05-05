package ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Libro;

public class Libro_matematica extends Libro{
    public Libro_matematica(Integer id, String titulo, Integer cant_capitulos, Boolean prestado) {
        super(id, titulo, cant_capitulos, prestado);
    }

    @Override
    public Integer get_dias_de_prestamo() {
        if (this.getCant_capitulos() >= 2) return 21;
        else return 7;
    }
}
