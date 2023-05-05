package ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Tren;

import ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Locomotora.Locomotora;
import ar.edu.cuvl.utn.progra3.Ejercicio_Ferrovias.Clases.Vagones.Vagones;

import java.util.ArrayList;
import java.util.Iterator;

public class Tren {
    private ArrayList<Locomotora> locomotoras;
    private ArrayList<Vagones> vagones;

    public void agregar_locomotora(Locomotora locomotora){
        this.locomotoras.add(locomotora);
    }

    public Integer contar_max_pasajeros(){
        Integer pasajeros_max = 0;

        Iterator<Vagones> it = vagones.iterator();
        while (it.hasNext()) {
            Vagones vagon = (Vagones) it.next();
            pasajeros_max += vagon.get_cant_max_de_pasajeros();
        }
        return pasajeros_max;
    }

    public Integer contar_vagones_livianos(){
        Integer contador_livianos = 0;

        Iterator<Vagones> it = vagones.iterator();
        while (it.hasNext()) {
            Vagones vagon = (Vagones) it.next();
            if (vagon.es_liviano()) contador_livianos++;
        }
        return contador_livianos;
    }

    public Double get_vel_maxima(){
        Double vel_mas_chica = 0.0;
        Iterator<Locomotora> it = locomotoras.iterator();
        if (it.hasNext()) vel_mas_chica = it.next().getVel_max();
        else {System.out.println("Sin locomotoras");
                return 0.0;}
        while (it.hasNext()){
            Locomotora locomotora = (Locomotora) it.next();
            if (locomotora.getVel_max() < vel_mas_chica) vel_mas_chica = locomotora.getVel_max();
        }
        return vel_mas_chica;}

    public Boolean es_eficiente_la_formacion(){
        Boolean son_eficientes = true;

        Iterator<Locomotora> it = locomotoras.iterator();
        while (it.hasNext()){
            Locomotora locomotora = (Locomotora) it.next();
            if (locomotora.es_eficiente() == false) son_eficientes = false;
        }

        return son_eficientes;}

    public Boolean se_puede_mover(){
        if (this.get_arrastre_util_total() >= this.get_peso_maximo_vagones()) return true;
        else return false;

    }

    public Double get_arrastre_util_total(){
        Iterator<Locomotora> it = locomotoras.iterator();
        Double arrastre_util_total = 0.0;
        while (it.hasNext()){
            Locomotora loco = (Locomotora) it.next();
            arrastre_util_total += loco.get_arrastre_util();
        }
        return arrastre_util_total;
    }

    public Double get_peso_maximo_vagones(){
        Iterator<Vagones> it = vagones.iterator();
        Double peso_maximo = 0.0;
        while (it.hasNext()){
            Vagones vagon = (Vagones) it.next();
            peso_maximo += vagon.getPeso_maximo();
        }
        return peso_maximo;}

    public Double peso_faltante_para_moverse(){
        if (this.se_puede_mover()) return 0.0;
        else return this.get_peso_maximo_vagones() - this.get_arrastre_util_total();
    }

    public Boolean es_complejo(){
        Double peso_total = 0.0;
        Integer cant_unidades = 0;

        Iterator<Vagones> it1 = this.vagones.iterator();
        while (it1.hasNext()){
            Vagones vagon = (Vagones) it1.next();
            peso_total+= vagon.getPeso_maximo();
            cant_unidades++;
        }
        Iterator<Locomotora> it2 = this.locomotoras.iterator();
        while (it2.hasNext()){
            Locomotora locomotora = (Locomotora) it2.next();
            peso_total += locomotora.getPeso();
            cant_unidades++;
        }

        if (cant_unidades >20) return true;
        if (peso_total >10000) return true;

        return false;
    }

}
