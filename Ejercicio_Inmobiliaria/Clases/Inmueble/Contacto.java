package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble;

public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    private String observaciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public Contacto(String nombre, String apellido,
                    String telefono, String mail,
                    String observaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.observaciones = observaciones;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void mostrar_contacto(){
        System.out.println("Datos del contacto: ");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Tel: " + this.telefono);
        System.out.println("mail: " + this.mail);
        System.out.println("Observaciones: " + this.observaciones);



    }
}
