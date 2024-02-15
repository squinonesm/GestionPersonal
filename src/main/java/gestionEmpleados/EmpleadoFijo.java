package gestionEmpleados;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Sergio Quiñones Majuelo
 * @version 0.1
 * @date 15-02-2024
 *
 */
public abstract class EmpleadoFijo extends Empleado {

    private GregorianCalendar fechaAlta;
    private double complementoAnual;

    public EmpleadoFijo(GregorianCalendar fechaAlta, double complementoAnual, String NIF, String nombre, int edad) {
        super(NIF, nombre, edad);
        this.fechaAlta = fechaAlta;
        this.complementoAnual = complementoAnual;
    }

    public double getComplementoAnual() {
        return complementoAnual;
    }

    public void setComplementoAnual(double complementoAnual) {
        this.complementoAnual = complementoAnual;
    }
    
    private int añosAntiguedad(){
        Calendar calendar = new GregorianCalendar();
        return calendar.get(Calendar.YEAR) - fechaAlta.get(Calendar.YEAR);
    }
    

    @Override
    public double calculaSueldo() {
        return Empleado.salarioMinimo+(complementoAnual*añosAntiguedad());
    }

}
