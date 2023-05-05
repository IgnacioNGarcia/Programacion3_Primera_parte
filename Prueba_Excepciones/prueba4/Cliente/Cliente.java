package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4.Cliente;

import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4.Producto;
import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4.SaldoException.SaldoException;

public class Cliente {
    private String nombre;
    private Double saldo;

    public Cliente(String nombre, Double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo(){
        return this.saldo;
    }
    public void comprar(Producto producto) throws SaldoException {
        if (this.saldo < producto.getPrecio()){
            throw new SaldoException("No te alcanza la guita");
        }else{
            this.setSaldo( this.saldo - producto.getPrecio());
        }
    }
    public void mostrarDatos(){
        System.out.println("Cliente: " + this.nombre+ " Saldo: " + this.saldo);
    }
}
