package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba1;

public class main {
    public static void main(String[] args) {
        try {
            PersonManager pm = new PersonManager();
            Employee empleado = new Employee();
            empleado.setLastName("Nacho");
            String name = pm.getLastName(empleado);
            System.out.println("Nombre: " + name);
        } catch (EmployeeException ex) {
            System.out.println(ex.getMessage());
        } catch (EmployeeAttributeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
