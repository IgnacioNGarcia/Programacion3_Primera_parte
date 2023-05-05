package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba2;

import ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba2.ExcepcionNegativa.ExcepcionNegativa;

public class main {
    public static void main(String[] args) {
        Integer numero = -2;
        try{
            validarNumero(numero);
            System.out.println(numero);
        }catch (ExcepcionNegativa e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void validarNumero(Integer num) throws ExcepcionNegativa {
        if (num < 0){
            throw new ExcepcionNegativa("El numero es menor a 0");
        }
    }}
