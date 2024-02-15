package gestionEmpleados;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 15-02-2024
 * 
 */
public abstract class EmpleadoPorHoras extends Empleado {
    
    private final double precioHoraTrabajada;
    private int horasTrabajadas;

    public EmpleadoPorHoras(double precioHoraTrabajada, int horasTrabajadas, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.precioHoraTrabajada = precioHoraTrabajada;
        this.horasTrabajadas = 0;
    }
    
    @Override
    public double calculaSueldo() {
        return (precioHoraTrabajada*horasTrabajadas)+Empleado.salarioMinimo;
    }
}
