package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica;

import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto.*;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Vehiculo.Auto;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Vehiculo.Camioneta;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Vehiculo.Vehiculo;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Excepciones.NoCorrespondeObjeto;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Excepciones.VehiculoLlenoException;

public class main {
    public static void main(String[] args) {
        Vehiculo camion = new Camioneta();
        Vehiculo auteli = new Auto();

        Objeto comoda = new Comoda();
        Objeto televisor = new Televisor();
        Objeto lavarropa = new Lavarropa();
        Objeto bici = new Bicicleta();
        Objeto heladera = new Heladera();

       try{
            auteli.cargar(bici);
            System.out.println("Cargado con exito.");
        }catch (VehiculoLlenoException ex){
            System.out.println(ex.getMessage());
        }catch (NoCorrespondeObjeto ex2){
            System.out.println(ex2.getMessage());
        }


        //camion.mostrarObjetosPermitidos();
        auteli.listarObjetos();
    }
}

/*
Una empresa de logística que se encarga de realizar envíos, pone a disposición de sus clientes dos tipos de vehículos:

● Una camioneta con capacidad para llevar cómodas, heladeras y lavarropas.
● Un auto con espacio suficiente como para llevar televisores, bicicletas plegables y cajaspequeñas.

Modelar las entidades teniendo en cuenta las siguientes consideraciones:
● Los vehículos deben ofrecer el método cargar() para ir incrementando su carga, razón
por la cual la función debe recibir el dato por parámetro.
● Mediante el empleo del método listarItems() el vehículo deberá facilitar el listado que compone la carga

● Todos los elementos poseen una descripción, dimensiones y un número que los
identifica pero, además, resulta de interés:
    i. Cómodas: superficie y cantidad de cajones.
    ii. Heladeras: voltaje al que trabaja y si posee freezer.
    iii. Lavarropas: voltaje al que trabaja, carga y revoluciones de centrifugado.
    iv. Televisores: voltaje al que trabaja, si es de led o lcd y si es inteligente.
    v. Bicicletas: tamaño de rodado, si son eléctricas y cantidad de cambios.


Analizar, diseñar, diagramar las relaciones e implementar el código considerando que la
capacidad máxima de carga de del auto es de 5 elementos, mientras que para la
camioneta es de 10.

 */