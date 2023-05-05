package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba3;

import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba3.Clases_Y_Excep.Persona;
import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba3.Clases_Y_Excep.apellidoException;
import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba3.Clases_Y_Excep.nameException;

public class main {
    public static void main(String[] args) {
        Persona nacho = new Persona("Ignacio ",null);
        try{
            System.out.println(nacho.getBothNames());
        }catch (nameException e){
            System.out.println(e.getMessage());
        }catch (apellidoException a){
            System.out.println(a.getMessage());
        }
    }
}
