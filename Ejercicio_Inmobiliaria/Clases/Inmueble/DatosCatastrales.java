package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble;

public class DatosCatastrales {
    private String provincia;
    private String barrio;
    private String nombre_calle;
    private Integer altura;
    private String cod_posta;
    private Boolean barrio_privado;

    public DatosCatastrales(String provincia, String barrio,
                            String nombre_calle,
                            Integer altura, String cod_posta,
                            Boolean barrio_privado) {
        this.provincia = provincia;
        this.barrio = barrio;
        this.nombre_calle = nombre_calle;
        this.altura = altura;
        this.cod_posta = cod_posta;
        this.barrio_privado = barrio_privado;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getCod_posta() {
        return cod_posta;
    }

    public void setCod_posta(String cod_posta) {
        this.cod_posta = cod_posta;
    }

    public Boolean getBarrio_privado() {
        return barrio_privado;
    }

    public void setBarrio_privado(Boolean barrio_privado) {
        this.barrio_privado = barrio_privado;
    }

    public void mostrar_datos_cat(){
        System.out.println("Datos Catastrales: ");
        System.out.println("Provincia: " + this.provincia);
        System.out.println("Barrio: " + this.barrio);
        System.out.println("Nombre Calle: " + this.nombre_calle);
        System.out.println("Altura: " + this.altura);
        System.out.println("Barrio privado: " + this.barrio_privado);
    }
}
