package ar.edu.cuvl.utn.progra3.ejercicioLlamadas;

import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Persona;
import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Telefono.Iphone;
import ar.edu.cuvl.utn.progra3.ejercicioLlamadas.Clases.Telefono.Motorola;

public class main {
    public static void main(String[] args) {
        Motorola motog5 = new Motorola("Moto G 5", 0.0);
        Iphone iphone14 = new Iphone("Iphone 14", 5.0);

        Persona pers1 = new Persona("Juliana", motog5);
        Persona pers2 = new Persona("Catalina", iphone14);

        pers2.getTel().hacerLlamada(pers1, 1);
        pers1.getTel().conocerBateria();
        pers2.getTel().conocerBateria();

        //pers2.getTel().recargar();

        pers1.getTel().getEstado();
        pers2.getTel().getEstado();
    }
}
