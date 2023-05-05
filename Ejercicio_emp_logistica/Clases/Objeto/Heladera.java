package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto;

public class Heladera extends Objeto implements Electrico{
    private Boolean tiene_freezer;

    public Heladera() {
        this.setNombre("Heladera");
    }

    public void setTiene_freezer(Boolean tiene_freezer) {
        this.tiene_freezer = tiene_freezer;
    }

    public Boolean getTiene_freezer() {
        return tiene_freezer;
    }

    @Override
    public Integer getVoltaje() {
        return null;
    }
}
