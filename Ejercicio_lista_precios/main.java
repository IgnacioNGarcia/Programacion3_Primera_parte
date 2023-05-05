package ar.edu.cuvl.utn.progra3.Ejercicio_lista_precios;

import ar.edu.cuvl.utn.progra3.Ejercicio_lista_precios.Clases.Articulo;
import ar.edu.cuvl.utn.progra3.Ejercicio_lista_precios.Clases.Lista_Precios;

public class main {
    public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Silla", 100.0);
        Articulo articulo2 = new Articulo("Cama", 300.0);
        Articulo articulo3 = new Articulo("Velador", 150.0);
        Articulo articulo4 = new Articulo("Mesa de luz", 200.0);
        Articulo articulo5 = new Articulo("Mesa", 500.0);
        Articulo articulo6 = new Articulo("Soporte", 50.0);


        Lista_Precios lista_minorista = new Lista_Precios("listaMi","Abril 2022" , TipoDeLista.MINORISTA);
        lista_minorista.agregar_articulo(articulo1);
        lista_minorista.agregar_articulo(articulo2);
        lista_minorista.agregar_articulo(articulo3);
        lista_minorista.agregar_articulo(articulo4);
        lista_minorista.agregar_articulo(articulo5);
        lista_minorista.agregar_articulo(articulo6);
        lista_minorista.mostrar_precios();
        System.out.println(" ");

        Lista_Precios lista_mayorista = new Lista_Precios("ListaMA",
                "Abril 2023", TipoDeLista.MAYORISTA);
        lista_mayorista.agregar_articulo(articulo1);
        lista_mayorista.agregar_articulo(articulo2);
        lista_mayorista.agregar_articulo(articulo3);
        lista_mayorista.agregar_articulo(articulo4);
        lista_mayorista.agregar_articulo(articulo5);
        lista_mayorista.agregar_articulo(articulo6);

        lista_mayorista.mostrar_precios();




    }
}
