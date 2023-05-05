package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble;

public class Inmueble {
    private Integer id;
    private DatosCatastrales datos_cat;
    private Ambientes ambientes;
    private Contacto contacto;
    private Boolean conectado_al_gas;
    private Boolean infraestructura_cloacal;

    public Inmueble(Integer id, DatosCatastrales datos_cat, Ambientes ambientes,
                    Contacto contacto,
                    Boolean conectado_al_gas, Boolean infraestructura_cloacal) {
        this.id = id;
        this.datos_cat = datos_cat;
        this.ambientes = ambientes;
        this.contacto = contacto;
        this.conectado_al_gas = conectado_al_gas;
        this.infraestructura_cloacal = infraestructura_cloacal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DatosCatastrales getDatos_cat() {
        return datos_cat;
    }

    public void setDatos_cat(DatosCatastrales datos_cat) {
        this.datos_cat = datos_cat;
    }

    public Ambientes getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(Ambientes ambientes) {
        this.ambientes = ambientes;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Boolean getConectado_al_gas() {
        return conectado_al_gas;
    }

    public void setConectado_al_gas(Boolean conectado_al_gas) {
        this.conectado_al_gas = conectado_al_gas;
    }

    public Boolean getInfraestructura_cloacal() {
        return infraestructura_cloacal;
    }

    public void setInfraestructura_cloacal(Boolean infraestructura_cloacal) {
        this.infraestructura_cloacal = infraestructura_cloacal;
    }

    public void mostrar_cualidades(){
        this.contacto.mostrar_contacto();
        System.out.println("\n");
        this.ambientes.mostrar_amb();
        System.out.println("Conectado al gas: " + this.conectado_al_gas);
        System.out.println("Infra cloacal " + this.infraestructura_cloacal);
        System.out.println("\n");
        this.datos_cat.mostrar_datos_cat();
        System.out.println("\n");
    }
}
