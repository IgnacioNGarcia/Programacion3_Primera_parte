package ar.edu.cuvl.utn.progra3.Ejercicio_Biblioteca.Clases.Libro;

public class Libro_filosofia extends Libro{
    public Libro_filosofia(Integer id, String titulo, Integer cant_capitulos, Boolean prestado) {
        super(id, titulo, cant_capitulos, prestado);
    }

    @Override
    public Integer get_dias_de_prestamo() {
        return 14;
    }
}
