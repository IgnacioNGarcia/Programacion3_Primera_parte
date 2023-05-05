package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble;

public class Casa extends Inmueble{
    private Boolean tiene_quincho;
    private Boolean tiene_pileta;

    public Boolean getTiene_quincho() {
        return tiene_quincho;
    }

    public Casa(Integer id, DatosCatastrales datos_cat,
                Ambientes ambientes, Contacto contacto, Boolean conectado_al_gas,
                Boolean infraestructura_cloacal,
                Boolean tiene_quincho, Boolean tiene_pileta) {
        super(id, datos_cat, ambientes, contacto, conectado_al_gas, infraestructura_cloacal);
        this.tiene_quincho = tiene_quincho;
        this.tiene_pileta = tiene_pileta;
    }

    public void setTiene_quincho(Boolean tiene_quincho) {
        this.tiene_quincho = tiene_quincho;
    }

    public Boolean getTiene_pileta() {
        return tiene_pileta;
    }

    public void setTiene_pileta(Boolean tiene_pileta) {
        this.tiene_pileta = tiene_pileta;
    }

    @Override
    public void mostrar_cualidades() {
        super.mostrar_cualidades();
        System.out.println("Tiene quincho: " + this.tiene_quincho);
        System.out.println("Tiene pileta: " + this.tiene_pileta);
    }
}
