package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Vehiculo;

import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto.Objeto;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Excepciones.NoCorrespondeObjeto;
import ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Excepciones.VehiculoLlenoException;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class Vehiculo {
    private ArrayList<Objeto> carga_vehiculo;
    private ArrayList<String> objetos_permitidos;
    private Integer carga_maxima;

    public ArrayList<Objeto> getCarga_vehiculo() {
        return carga_vehiculo;
    }

    public Vehiculo() {
        this.carga_vehiculo = new ArrayList<Objeto>();
        this.objetos_permitidos = new ArrayList<String>();
    }

    public void setCarga_vehiculo(ArrayList<Objeto> carga_vehiculo) {
        this.carga_vehiculo = carga_vehiculo;
    }

    public ArrayList<String> getObjetos_permitidos() {
        return objetos_permitidos;
    }

    public void setObjetos_permitidos(ArrayList<String> objetos_permitidos) {
        this.objetos_permitidos = objetos_permitidos;
    }

    public Integer getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(Integer carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public void cargar(Objeto obj) throws VehiculoLlenoException, NoCorrespondeObjeto {
        if (this.carga_vehiculo.size() >= this.carga_maxima)
           throw new VehiculoLlenoException("El vehiculo está lleno, no es posible subir la carga. ");
        if (this.objetos_permitidos.contains(obj.getNombre()))
            throw new VehiculoLlenoException("El objeto no corresponde a este tipo de vehiculo. Intente subirlo en otro lado.");
        this.carga_vehiculo.add(obj);
    }
    public void mostrarObjetosPermitidos(){
        Iterator<String> it = this.objetos_permitidos.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    public void listarObjetos(){
        System.out.println("Objetos: \n");
        Iterator<Objeto> it = this.carga_vehiculo.iterator();
        while (it.hasNext()) {
            Objeto obj = (Objeto) it.next();
            System.out.println(obj.getNombre());
        }
    }
}
