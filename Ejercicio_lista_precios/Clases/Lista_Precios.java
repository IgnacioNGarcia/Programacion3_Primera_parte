package ar.edu.cuvl.utn.progra3.Ejercicio_lista_precios.Clases;

import ar.edu.cuvl.utn.progra3.Ejercicio_lista_precios.TipoDeLista;

import java.util.ArrayList;
import java.util.Iterator;

public class Lista_Precios {
    private String nombre;
    private String vigencia;
    private TipoDeLista tipo_lista;
    private ArrayList<Articulo> lista_articulos;

    public Lista_Precios(String nombre, String vigencia, TipoDeLista tipo_lista) {
        this.nombre = nombre;
        this.vigencia = vigencia;
        this.tipo_lista = tipo_lista;
        this.lista_articulos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public TipoDeLista getTipo_lista() {
        return tipo_lista;
    }

    public void setTipo_lista(TipoDeLista tipo_lista) {
        this.tipo_lista = tipo_lista;
    }

    public ArrayList<Articulo> getLista_articulos() {
        return lista_articulos;
    }

    public void setLista_articulos(ArrayList<Articulo> lista_articulos) {
        this.lista_articulos = lista_articulos;
    }
    public Double getPorcentajeAumento(){
        if (this.tipo_lista == TipoDeLista.MAYORISTA) return 1.5;
        if (this.tipo_lista == TipoDeLista.MINORISTA) return 2.0;
        else return 1.0;
    }
    public void agregar_articulo(Articulo art){
        this.lista_articulos.add(art);
    }

    public void mostrar_precios(){
        System.out.println("Lista " + this.tipo_lista);
        System.out.println("Articulo | Precio");
        Iterator<Articulo> it = this.lista_articulos.iterator();
        while (it.hasNext()){
            Articulo artic = (Articulo) it.next();
            System.out.println(artic.getNombre() + "  $" + artic.getCosto_produccion()*this.getPorcentajeAumento());
        }
    }
}
