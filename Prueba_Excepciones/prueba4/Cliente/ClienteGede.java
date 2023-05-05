package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4.Cliente;

public class ClienteGede extends Cliente{
    private String apellido;

    public ClienteGede(String nombre, Double saldo, String apellido) {
        super(nombre, saldo);
        this.apellido = apellido;
    }
}
