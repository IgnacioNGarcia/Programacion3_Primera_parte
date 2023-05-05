package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto;

public class Lavarropa extends Objeto implements Electrico{
    private Integer revoluciones_centrifugado;

    public Integer getRevoluciones_centrifugado() {
        return revoluciones_centrifugado;
    }

    public void setRevoluciones_centrifugado(Integer revoluciones_centrifugado) {
        this.revoluciones_centrifugado = revoluciones_centrifugado;
    }

    public Lavarropa() {
        this.setNombre("Lavarropas");

    }

    @Override
    public Integer getVoltaje() {
        return null;
    }
}
