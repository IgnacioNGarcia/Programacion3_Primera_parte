package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto;

public class Comoda extends Objeto{
    private Integer superficie;
    private Integer cant_escalones;

    public Comoda() {
        this.setNombre("Comoda");
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public void setCant_escalones(Integer cant_escalones) {
        this.cant_escalones = cant_escalones;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public Integer getCant_escalones() {
        return cant_escalones;
    }
}
