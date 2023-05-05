package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba3.Clases_Y_Excep;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getBothNames() throws nameException, apellidoException {
        if (this.nombre == null){
            throw new nameException("No tiene nombre");
        }
        if (this.apellido == null){
            throw new apellidoException("No tiene apellido");
        }
        return this.nombre + this.apellido;
    }
}
