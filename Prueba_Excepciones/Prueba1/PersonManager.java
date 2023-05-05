package ar.edu.cuvl.utn.progra3.Prueba_Excepciones.Prueba1;

public class PersonManager {
    public String getLastName(Employee employee) throws EmployeeException, EmployeeAttributeException {
        if (employee == null) {
            throw new EmployeeException("Employee is null!");
        }
        if (employee.getLastName().isEmpty()) {
            throw new EmployeeAttributeException("Attribute name is empty!");
        } else {
            return employee.getLastName();
        }
    }
}