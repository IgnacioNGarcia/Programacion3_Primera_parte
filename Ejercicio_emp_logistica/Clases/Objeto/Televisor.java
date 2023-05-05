package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto;

public class Televisor extends Objeto implements Electrico{
    private Boolean es_led;
    private Boolean es_lcd;
    private Boolean es_smart;

    public Boolean getEs_led() {
        return es_led;
    }

    public Televisor() {
        this.setNombre("Televisor");
    }

    public void setEs_led(Boolean es_led) {
        this.es_led = es_led;
    }

    @Override
    public Integer getVoltaje() {
        return null;
    }
}
