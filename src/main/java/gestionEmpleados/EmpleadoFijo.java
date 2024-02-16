package gestionEmpleados;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 16-02-2024
 *
 */
/**
 * Clase que representa a un empleado fijo.
 */
public class EmpleadoFijo extends Empleado {

    private GregorianCalendar fechaAlta;
    private double complementoAnual;

    /**
     * Constructor de la clase EmpleadoFijo.
     *
     * @param fechaAlta Fecha de alta del empleado.
     * @param complementoAnual Complemento anual del empleado.
     * @param NIF Número de identificación fiscal.
     * @param nombre Nombre del empleado.
     * @param edad Edad del empleado.
     */
    public EmpleadoFijo(GregorianCalendar fechaAlta, double complementoAnual, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.complementoAnual = 50;
    }

    public String getNombre() {
        return nombre;
    }

    public double getComplementoAnual() {
        return complementoAnual;
    }

    public void setComplementoAnual(double complementoAnual) {
        this.complementoAnual = complementoAnual;
    }

    /**
     * Calcula los años de antigüedad del empleado fijo.
     *
     * @return Años de antigüedad del empleado fijo.
     */
    private int añosAntiguedad() {
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.YEAR) - fechaAlta.get(Calendar.YEAR);
    }

    /**
     * Calcula el sueldo del empleado fijo.
     *
     * @return Sueldo del empleado fijo.
     */
    @Override
    public double calculaSueldo() {
        return Empleado.salarioMinimo + (complementoAnual * añosAntiguedad());
    }

    @Override
    public String toString() {
        return "Empleado Fijo ->" + super.toString() + ", Fecha de Alta: " + fechaAlta.getTime();
    }
}
