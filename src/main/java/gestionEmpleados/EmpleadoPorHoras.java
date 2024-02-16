package gestionEmpleados;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 16-02-2024
 *
 */
/**
 * Clase que representa a un empleado por horas.
 */
public class EmpleadoPorHoras extends Empleado {

    private final double precioHoraTrabajada = 10; //Establecemos un precio hora igual para todos
    private int horasTrabajadas;

    /**
     * Constructor de la clase EmpleadoPorHoras.
     *
     * @param horasTrabajadas Horas trabajadas por el empleado.
     * @param NIF Número de identificación fiscal.
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     */
    public EmpleadoPorHoras(int horasTrabajadas, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Calcula el sueldo del empleado por horas.
     *
     * @return Sueldo del empleado por horas.
     */
    @Override
    public double calculaSueldo() {
        return (precioHoraTrabajada * horasTrabajadas) + Empleado.salarioMinimo;
    }

    @Override
    public String toString() {
        return "Empleado Por Horas -> " + super.toString();
    }

}
