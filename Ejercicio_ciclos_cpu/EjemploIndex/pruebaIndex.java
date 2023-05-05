package ar.edu.cuvl.utn.progra3.Ejercicio_ciclos_cpu.EjemploIndex;

import java.util.ArrayList;

public class pruebaIndex {
    public static void main(String[] args) {
        ArrayList<Integer> lista_num = new ArrayList<>();
        lista_num.add(1);
        lista_num.add(2);
        lista_num.add(3);
        lista_num.add(4);
        lista_num.add(5);
        lista_num.add(6);

        System.out.println(lista_num.get(-1));
    }
}
