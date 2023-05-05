package ar.edu.cuvl.utn.progra3.pruebaInterfaces.Clases;

public class Gato extends Animal{
    public Gato(){
        this.tipoDeAnimal = "Gato";
    }

    @Override
    public void decirAnimal() {
        System.out.println(this.tipoDeAnimal);
    }

    @Override
    public void moverse() {
        System.out.println("El "+ this.tipoDeAnimal + " se está moviendo. Miau Miuau");
    }
}
