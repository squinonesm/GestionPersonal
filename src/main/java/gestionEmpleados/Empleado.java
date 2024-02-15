package gestionEmpleados;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 15-02-2024
 * 
 */
public abstract class Empleado {
    
    public static final double salarioMinimo = 645;
    protected String NIF;
    protected String nombre;
    protected int edad;

    public Empleado(String NIF, String nombre, int edad) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.edad = edad;
    }
   
    public abstract double calculaSueldo();

    @Override
    public String toString() {
        return "Empleado{" + "NIF=" + NIF + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

    
}
