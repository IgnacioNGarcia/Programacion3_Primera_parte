package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria;

import ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmobiliaria.Inmobiliaria;
import ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble.*;
import ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Excepciones.InmuebleNotFoundException;

public class main {
    public static void main(String[] args) {
        DatosCatastrales datos = new DatosCatastrales("BS AS",
                "Munro", "Aguero",
                1905, "1604", false);
        Ambientes ambientes = new Ambientes(3,"un piso",
                "dimrandom", true);
        Contacto contacto = new Contacto("Nacho" , "Garcia", "113", "nacho@gmail",
        "");

        Inmueble casa_nacho = new Casa(5,datos,ambientes,contacto,true,true,
                true,false);

        //casa_nacho.mostrar_cualidades();

        Inmobiliaria inmobiliaria = new Inmobiliaria();
        inmobiliaria.agregar_inmueble(casa_nacho);
        try {
            inmobiliaria.mostrar_inmueble_pedido(1);
        }catch (InmuebleNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
