package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmobiliaria;

import ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble.Inmueble;
import ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Excepciones.InmuebleNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class Inmobiliaria {
    private Map<Integer, Inmueble> lista_inmuebless;

    public Inmobiliaria() {
        this.lista_inmuebless = new HashMap<>();
    }

    public void agregar_inmueble(Inmueble inmueble){
        this.lista_inmuebless.put(inmueble.getId(), inmueble);
    }
    public void mostrar_inmueble_pedido(Integer id) throws InmuebleNotFoundException{
        if (this.lista_inmuebless.get(id) == null) throw new InmuebleNotFoundException("El id no existe");
            this.lista_inmuebless.get(id).mostrar_cualidades();
        }
    }
