package ar.edu.cuvl.utn.progra3.Ejercicio_Inmobiliaria.Clases.Inmueble;

public class Departamento extends Inmueble{
    private Integer piso;
    private String num_letra;
    private Boolean pet_friendly;

    public Departamento(Integer id, DatosCatastrales datos_cat,
                        Ambientes ambientes, Contacto contacto, Boolean conectado_al_gas,
                        Boolean infraestructura_cloacal,
                        Integer piso, String num_letra, Boolean pet_friendly) {
        super(id, datos_cat, ambientes, contacto, conectado_al_gas, infraestructura_cloacal);
        this.piso = piso;
        this.num_letra = num_letra;
        this.pet_friendly = pet_friendly;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public void setNum_letra(String num_letra) {
        this.num_letra = num_letra;
    }

    public void setPet_friendly(Boolean pet_friendly) {
        this.pet_friendly = pet_friendly;
    }

    @Override
    public void mostrar_cualidades() {
        super.mostrar_cualidades();
        System.out.println("Piso " + this.piso);
        System.out.println("Numero dpto: " + this.num_letra);
        System.out.println("Pet Friendly: " + this.pet_friendly);
    }
}
