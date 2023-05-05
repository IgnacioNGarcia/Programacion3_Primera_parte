package ar.edu.cuvl.utn.progra3.Ejercicio_emp_logistica.Clases.Objeto;

public class Bicicleta extends Objeto {
    private Integer tamanio_rodado;
    private Boolean es_electrica;
    private Integer cant_cambios;

    public Bicicleta() {
        this.setNombre("Bicicleta plegable");
    }

    public Integer getTamanio_rodado() {
        return tamanio_rodado;
    }

    public Boolean getEs_electrica() {
        return es_electrica;
    }

    public Integer getCant_cambios() {
        return cant_cambios;
    }

    public void setTamanio_rodado(Integer tamanio_rodado) {
        this.tamanio_rodado = tamanio_rodado;
    }

    public void setEs_electrica(Boolean es_electrica) {
        this.es_electrica = es_electrica;
    }

    public void setCant_cambios(Integer cant_cambios) {
        this.cant_cambios = cant_cambios;
    }
}
