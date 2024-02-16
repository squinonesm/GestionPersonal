package gestionEmpleados;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 16-02-2024
 *
 */

/**
 * Clase abstracta que representa a un empleado.
 */
public abstract class Empleado {
    
    public static final double salarioMinimo = 645;
    protected String NIF;
    protected String nombre;
    protected int edad;
    
    /**
     * Constructor de la clase Empleado.
     * 
     * @param NIF Número de identificación fiscal.
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     */
    public Empleado(String NIF, String nombre, int edad) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    /**
     * Método abstracto para calcular el sueldo del empleado.
     * 
     * @return  Sueldo del empleado.
     */
    public abstract double calculaSueldo();

    @Override
    public String toString() {
        return String.format("NIF: %s, Nombre: %s, Edad: %d", NIF, nombre, edad);
    }

}
