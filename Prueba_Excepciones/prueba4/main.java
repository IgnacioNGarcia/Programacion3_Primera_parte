package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4;

import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4.Cliente.Cliente;
import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.prueba4.SaldoException.SaldoException;

public class main {
    public static void main(String[] args) throws SaldoException {
        Cliente ignacio = new Cliente("Nacho", 400.5);

        Producto escoba = new Producto("Escoba", 200.0);
        try{

            ignacio.comprar(escoba);
            ignacio.mostrarDatos();
        }catch(SaldoException e){
            System.out.println(e.getMessage());
        }
        Producto joystick = new Producto("Dualshock ps4", 300.0);
        try{
            ignacio.comprar(joystick);
            ignacio.mostrarDatos();
        }catch(SaldoException a){
            System.out.println(a.getMessage());
        }

    }
}
